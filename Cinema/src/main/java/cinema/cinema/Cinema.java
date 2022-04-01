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
      UserDetailFrame frm = new UserDetailFrame();
        frm.setVisible(true);
        
    }
}
