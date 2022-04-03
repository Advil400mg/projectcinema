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

/**
 *
 * @author Tanguy
 */
public class Prices extends SQLqry{
    
    /**
     * constructor
     */
    public Prices()
    {
        super();
    }
    
    /**
     * get all prices
     * @return
     */
    public String getAll()
    {
        String returnValue = "";
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "SELECT * FROM prices";
            PreparedStatement st = con.prepareStatement(qry);
            ResultSet rs = st.executeQuery();

            
            while(rs.next())
            {
                returnValue += rs.getString(2) + " ";
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
    
}
