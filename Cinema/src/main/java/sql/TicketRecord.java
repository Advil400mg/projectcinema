/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;

/**
 *
 * @author Tanguy
 */
public class TicketRecord extends SQLqry {
    
    /**
     * constructor
     */
    public TicketRecord()
    {
        super();
    }
    
    /**
     * insert ticketrecord into database
     * @param userid
     * @param filmname
     * @param nbComing
     * @param price
     */
    public void insert(String userid, String filmname, int nbComing, int price)
    {
         try
        {
            Class.forName(driver);
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "INSERT INTO ticketrecords VALUES (UUID(), ?,?,?,?)";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1,userid);
            st.setString(2,filmname);
            st.setInt(3, nbComing);
            st.setInt(4, price);

                 
            
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
     * load ticket records into a listbox
     * @param userid
     * @param list
     */
    public void loadTicketIntoList(String userid, javax.swing.JList<String> list)
    {
        DefaultListModel m = new DefaultListModel();
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "SELECT filmname, nbcoming, price FROM ticketrecords WHERE userid = ?";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1, userid);
            ResultSet rs = st.executeQuery();

            
            while(rs.next())
            {
                String info = rs.getString(1) + ". " + rs.getString(2) + " persons coming. " + rs.getString(3) + "€";
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
}
