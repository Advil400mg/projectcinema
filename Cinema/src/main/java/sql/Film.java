/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
