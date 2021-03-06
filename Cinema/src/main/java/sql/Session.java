/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Tanguy
 */
public class Session extends SQLqry{
    
    /**
     * constructor
     */
    public Session()
    {
        super();
    }
    
    /**
     * insert session into database
     * @param start
     * @param end
     * @param date
     * @param filmid
     * @param roomnb
     */
    public void insert(Time start, Time end, Date date, String filmid, int roomnb)
    {
        try
        {
            Class.forName(driver);
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "INSERT INTO session VALUES (UUID(), ?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(qry);
            st.setTime(1,start);
            st.setTime(2,end);
            st.setDate(3,date);
            st.setString(4,filmid);
            st.setInt(5, roomnb);                  
            
            st.executeUpdate();        
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * load session of a film into a listbox
     * @param filmid
     * @param allids
     * @param list
     */
    public void loadSessionIntoList(String filmid,ArrayList<String> allids, javax.swing.JList<String> list)
    {
        DefaultListModel m = new DefaultListModel();
        allids.clear();
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "SELECT date, start, roomnb, sessionid FROM session WHERE filmid = ?";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1, filmid);
            ResultSet rs = st.executeQuery();

            
            while(rs.next())
            {
                String info = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3);
                m.addElement(info);
                allids.add(rs.getString(4));
                
            }
            list.setModel(m);
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * load session of a film into a listbox
     * @param list
     * @param allids
     * @param filmname
     */
    public void loadSessionIntoList(javax.swing.JList<String> list, ArrayList<String> allids ,String filmname)
    {
        allids.clear();
        DefaultListModel m = new DefaultListModel();
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "SELECT * FROM session WHERE filmid = (SELECT filmid FROM Film WHERE name = ?)";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1, filmname);
            ResultSet rs = st.executeQuery();

            
            while(rs.next())
            {
                String info = rs.getString(4) + " " + rs.getString(2) + " " + rs.getString(6);
                m.addElement(info);
                allids.add(rs.getString(1));
                
            }
            list.setModel(m);
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * delete a session from database
     * @param sessionid
     */
    public void deleteSession(String sessionid)
    {
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "{CALL Deletesession(?)}";
            CallableStatement st = con.prepareCall(qry);
            st.setString(1, sessionid);
            st.executeQuery();
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
