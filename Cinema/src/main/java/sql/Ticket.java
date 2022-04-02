/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import javax.swing.DefaultListModel;

/**
 *
 * @author Tanguy
 */
public class Ticket extends SQLqry{
    
    public Ticket()
    {
        super();
    }
    
    public void insert(String sessionid, String userid, int nbChild, int nbRegular, int nbSenior, int willCome, int price)
    {
        try
        {
            Class.forName(driver);
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "INSERT INTO ticket VALUES (UUID(), ?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1,sessionid);
            st.setString(2,userid);
            st.setInt(3, nbChild);
            st.setInt(4, nbRegular);
            st.setInt(5, nbSenior);
            st.setInt(6, willCome);
            st.setInt(7, price);
                 
            
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
    
    public void loadTicketIntoList(String userid, javax.swing.JList<String> list)
    {
        DefaultListModel m = new DefaultListModel();
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "SELECT film.name, session.date , session.start, session.roomnb FROM ticket";
            qry += " INNER JOIN session ON ticket.sessionid = session.sessionid";
            qry += " INNER JOIN film ON session.filmid = film.filmid";
            qry += " WHERE ticket.userid = ?";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1, userid);
            ResultSet rs = st.executeQuery();

            
            while(rs.next())
            {
                String info = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " Room : " + rs.getString(4);
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
