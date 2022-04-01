/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;


/**
 *
 * @author Tanguy
 */

public class SQLqry {
    protected String driver;
    protected String url;
    protected String username;
    protected String password;
    
    
    public SQLqry()
    {
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/cinema";
        username = "root";
        password = "";
    }
}
