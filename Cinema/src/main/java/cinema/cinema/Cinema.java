/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cinema.cinema;
import sql.SQLqry;
import java.sql.Date;


/**
 *
 * @author Tanguy
 */
public class Cinema {
    static SQLqry sql = new SQLqry();

    public static void main(String[] args) {
        Date date = Date.valueOf("2000-12-15");
        sql.insert_user("Momo", "la truire", date, "ouho", false);
    }
}
