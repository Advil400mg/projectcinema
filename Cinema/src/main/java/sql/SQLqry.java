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
public class SQLqry {
    String driver;
    String url;
    String username;
    String password;
    
    public SQLqry()
    {
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/cinema";
        username = "root";
        password = "";
    }
    
    public void insert_user(String name, String surname, Date dateofbirth,String user_password, boolean isEmployee )
    {
        try
        {
            Class.forName(driver);
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "INSERT INTO user VALUES (UUID(), ?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1,name);
            st.setString(2,surname);
            st.setDate(3,dateofbirth);
            st.setString(4, user_password);
            st.setBoolean(5, isEmployee);                    
            
            st.executeUpdate();        
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println("ptn " + e.getMessage());
        }
    }
}
