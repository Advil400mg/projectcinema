/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

/**
 *
 * @author Tanguy
 */
public class ConnectedUser {

    /**
     *
     */
    public static String email;

    /**
     *
     */
    public static String surname;

    /**
     *
     */
    public static String userid;

    /**
     *
     */
    public static Boolean purchaseok = false;

    /**
     *
     */
    public static void clear()
    {
        email = "";
        surname = "";
        purchaseok = false;
        userid = "";
    }
}
