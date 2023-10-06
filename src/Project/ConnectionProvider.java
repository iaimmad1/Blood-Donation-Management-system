/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author LENOVO
 */      
public class ConnectionProvider {
    public static Connection getCon()//Method ho yo
    {
  try
  {  
      String user="root";
      String password="Iloveyou@Raa";
      String url="jdbc:mysql://localhost:3306/bdms";
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            
       Connection con=DriverManager.getConnection(url,user,password);
      return con;
  }
  catch(Exception e)
              {
              return null;
              }
      
  
      
      
    }
}
