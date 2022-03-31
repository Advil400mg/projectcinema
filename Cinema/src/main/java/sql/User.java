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
import java.sql.Statement;
/**
 *
 * @author Tanguy
 */
public class User extends SQLqry{

    
    public User()
    {
        super();
    }
    
    public void insert(String name, String surname,String mail, Date dateofbirth,String user_password, boolean isEmployee )
    {
        try
        {
            Class.forName(driver);
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "INSERT INTO user VALUES (UUID(), ?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1,name);
            st.setString(2,surname);
            st.setString(3,mail);
            st.setDate(4,dateofbirth);
            st.setString(5, user_password);
            st.setBoolean(6, isEmployee);                    
            
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
    
    public boolean isConnected(String user_mail, String user_password)
    {
        boolean connected = false;
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "SELECT isEmployee FROM user WHERE mail = ? AND password = ?";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1, user_mail);
            st.setString(2, user_password);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                connected = true;
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
        
        return connected;
    }
    public boolean isRegistered(String user_mail)
    {
        boolean exists = false;
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "SELECT * FROM user WHERE mail = ?";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1, user_mail);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                exists = true;
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
        
        return exists;
    }
}
