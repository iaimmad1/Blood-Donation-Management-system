
import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PRAKASH
 */
public class firstClass {
    public static void main(String args[]){
        
            try{
          Connection con =ConnectionProvider.getCon();
          Statement st=con.createStatement();// kahila kahi statement bhitra (ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY) halna vanxa...
          ResultSet rs = st.executeQuery("Select max(userId) from user");
          int Id = 0;
          if(rs.next())// our table is not then '
 {
              Id = rs.getInt(1);
              if(Id > 0)
              {
                  new Login().setVisible(true);
              }
              else{
              
              new signUp().setVisible(true);
            }
              
          }
          
    }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
            
            
    
}
}
