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
import javax.swing.DefaultListModel;

/**
 *
 * @author Tanguy
 */
public class Film extends SQLqry{
    public Film()
    {
        super();
    }
    public void insert(String name, String genre, int duration, String imagepath)
    {
        try
        {
            Class.forName(driver);
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "INSERT INTO film VALUES (UUID(),?,?,?,?)";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1,name);
            st.setString(2,genre);
            st.setInt(3,duration);
            st.setString(4,imagepath);
            
            
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
    
    public String getFilm(String name)
    {
        String returnValue = "";
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "SELECT * FROM film WHERE name = ?";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1,name);
            ResultSet rs = st.executeQuery();

            
            while(rs.next())
            {
                returnValue = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5);
                
            }
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return returnValue;
    }
    
    public void loadFilmIntoList(javax.swing.JList<String> list)
    {
        DefaultListModel m = new DefaultListModel();
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "SELECT name FROM film";
            PreparedStatement st = con.prepareStatement(qry);
            ResultSet rs = st.executeQuery();

            
            while(rs.next())
            {
                String info = rs.getString(1);
                m.addElement(info);
                
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
    
    public void deleteFilm(String filmid)
    {
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "{CALL Deletefilm(?)}";
            CallableStatement st = con.prepareCall(qry);
            st.setString(1, filmid);
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
