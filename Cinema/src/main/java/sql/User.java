/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

import cinema.cinema.AdminFrame;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
        boolean isEmployee = false;
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "SELECT isEmployee FROM user WHERE mail = ? AND password = ?";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1, user_mail);
            st.setString(2, user_password);
            ResultSet rs = st.executeQuery();
            if(rs.isBeforeFirst())
            {
                rs.next();
                connected = true;
                ConnectedUser.clear();
                ConnectedUser.email = user_mail;
                isEmployee = rs.getBoolean(1);
                if(isEmployee)
                {
                    System.out.println("isEmployee");
                    AdminFrame admin = new AdminFrame();
                    admin.setVisible(true);
                }
                else
                {
                    System.out.println("Is not employee");
                }
                
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
    
    public void loadUserIntoAdmin(javax.swing.JList<String> list)
    {
        DefaultListModel m = new DefaultListModel();
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "SELECT mail,name,surname FROM user";
            PreparedStatement st = con.prepareStatement(qry);
            ResultSet rs = st.executeQuery();

            
            while(rs.next())
            {
                String info = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3);
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
    
    public void loadUserIntoAdminFilter(javax.swing.JList<String> list, String text)
    {
        DefaultListModel m = new DefaultListModel();
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "SELECT mail,name,surname FROM user WHERE name LIKE ?";
            qry+= " OR surname LIKE ?";
            qry+= " OR mail LIKE ?";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1, text+"%");
            st.setString(2, text+"%");
            st.setString(3, text+"%");
            ResultSet rs = st.executeQuery();

            
            while(rs.next())
            {
                String info = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3);
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
    
    public String getAll(String mail)
    {
        String returnValue = "";
        try
        {
            Class.forName(driver);   
            
            Connection con = DriverManager.getConnection(url, username, password);
            String qry = "SELECT * FROM user WHERE mail LIKE ?";
            PreparedStatement st = con.prepareStatement(qry);
            st.setString(1, mail);
            ResultSet rs = st.executeQuery();

            
            while(rs.next())
            {
                returnValue = rs.getString(2) + " " + rs.getString(3) + " "+ rs.getString(4) + " " +  rs.getString(5) + " " + rs.getString(6) + " "+  rs.getString(7);
                
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
    
    public boolean verifyAddress(String mail_address) throws MessagingException
    {
        Properties properties = new Properties();
        Random r = new Random();
        
        String code = String.format("%d%d%d%d%d",r.nextInt(10),r.nextInt(10),r.nextInt(10),r.nextInt(10),r.nextInt(10));
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        String sender = "tanguy.vienot.pers@gmail.com";
        String sender_password = "lexurxnbmkikslfc";
        
        
        Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(sender, sender_password);
            }
        });
        
        Message message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(sender));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(mail_address));
            message.setSubject("Validation code CineGobelin");
            message.setText("CineGobelin\n" + "Renseignez ce code dans l'application pour valider votre inscription : " + code);
        } catch (MessagingException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Transport.send(message);
        System.out.println("Message envoyé");
        
        String value = JOptionPane.showInputDialog("Code envoyé par mail");
        if(!(value == null ? code == null : value.equals(code)))
        {
        } else {
            return true;
        }
        return false;
        

    }
}
