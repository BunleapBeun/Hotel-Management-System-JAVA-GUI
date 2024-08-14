/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Beun Bunleap
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
    
        try
        {
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "Rupp123");
            return con;
        }
        catch(Exception e)
        {
        
            return null;
            
        }
    
    }
    
}
