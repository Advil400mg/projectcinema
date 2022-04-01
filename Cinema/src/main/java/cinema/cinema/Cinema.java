/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cinema.cinema;
import sql.User;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;


/**
 *
 * @author Tanguy
 */
public class Cinema {
    static User sql = new User();

    public static void main(String[] args) {

        /*Date date = Date.valueOf("2000-12-15");
        sql.insert("Momo", "la truire","gobelin@amassue.com", date, "ouho", false);*/
        
        LoginFrame first = new LoginFrame();
        first.setVisible(true);
    }
}
