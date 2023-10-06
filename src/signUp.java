
import Project.ConnectionProvider;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date; 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PRAKASH
 */
public class signUp extends javax.swing.JFrame {

    public signUp() {
        initComponents();
        setLocationRelativeTo(null);
         setResizable(false);
          try{
          Connection con =ConnectionProvider.getCon();
          Statement st=con.createStatement();// kahila kahi statement bhitra (ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY) halna vanxa...
         ResultSet rs = st.executeQuery("Select max(userId) from user");
          int ID = 0;
         
          if(rs.next())// our table is not then '
            {
              ID = rs.getInt(1);
              ID = ID+1;
              String Id = String.valueOf(ID);
              jLabel5.setText(Id);
              if( ID == 1)
              {
                  jLabel16.setText("admin");
              }
              else{
                  jLabel16.setText("user");
              }
              
          }
          }catch(Exception e)
          {
              
          }
      
    
    }
/**
     * Creates new form passwordChange
     * @return
     */
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        usenameTextfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        citizenshipTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        provienceComboBox = new javax.swing.JComboBox<>();
        districtComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        DOBS = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText(" password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 101, 30));

        jLabel2.setText("conform password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 154, 20));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 240, 30));
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 240, 30));

        btn_save.setText("save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        btn_cancel.setText("cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, -1, -1));

        jLabel3.setText(" username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 114, 10));
        getContentPane().add(usenameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 240, 30));

        jLabel4.setText("ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 20, -1));

        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 61, -1));

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 240, 30));

        jLabel7.setText("address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 80, 30));
        getContentPane().add(citizenshipTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 290, 30));

        jLabel8.setText("Citizenship no.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 119, 30));
        getContentPane().add(phoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 240, 30));
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 241, 30));

        provienceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Province No 1", "Madhesh Pradesh", "Bagmati Pradesh", "Gandaki Pradesh", "Lumbini Pradesh", "Karnali Pradesh", "Sudur Pashchim Pradesh" }));
        provienceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provienceComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(provienceComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 130, 30));

        districtComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(districtComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 150, 30));

        jLabel9.setText("Phone");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 61, 22));

        jLabel10.setText("email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 80, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "others", " " }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 100, 30));

        jLabel12.setText("Gender");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1010, 10));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("USER REGESTRATION");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 550, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 86, 60, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 1010, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1000, 10));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(" LOGIN CREDENTIALS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 470, 40));

        jLabel14.setText("Type");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 1010, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Date of Birth");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 112, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 100, 30));
        getContentPane().add(DOBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 120, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here: 

            try{
          Connection con =ConnectionProvider.getCon();
          Statement st=con.createStatement();// kahila kahi statement bhitra (ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY) halna vanxa...
         ResultSet rs = st.executeQuery("Select max(userId) from user");
          int ID = 0;
          if(rs.next())// our table is not then '
 {
              ID = rs.getInt(1);
              ID = ID+1;
              String Id = String.valueOf(ID);
              jLabel5.setText(Id);
              
          }
          
          
          
             
            
          
        
        if(jPasswordField1.getText().equals(jPasswordField2.getText())){
            
//         jLabel5.setText(id);   
        String Id = jLabel5.getText();
        int id = Integer.parseInt(Id);
        String type = "";
        if(id == 1)
        {
             type = "admin"; 
             jLabel16.setText("admin");
        }
        else{
            type = "user"; 
            jLabel16.setText("user");
        }
        String name = nameTextField.getText();
        String provience = (String)provienceComboBox.getSelectedItem();
        String district = (String)districtComboBox.getSelectedItem();
        String cNo = citizenshipTextField.getText();
        String ph = phoneTextField.getText();
        String email = emailTextField.getText();
        String gender = (String)jComboBox1.getSelectedItem();
        String username = usenameTextfield.getText();
        String password = jPasswordField1.getText();
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        String DOB =dFormat.format(DOBS.getDate());
            
        if("".equals(Id)||"".equals(name)||"".equals(provience)||"".equals(district)||"".equals(cNo)||"".equals(ph)||"".equals(email)||"".equals(gender)||"".equals(username)||"".equals(password)||"".equals(DOB)){
            
            JOptionPane.showMessageDialog(null, "empty TextField");
            dispose();
            setVisible(true);
        }
        else{
         
          st.executeUpdate(" insert into user values('"+Id+"','"+name+"','"+district+"','"+provience+"','"+cNo+"','"+ph+"','"+email+"','"+gender+"','"+username+"','"+password+"','"+type+"','"+DOB+"') ");
          if(id == 1)
          {
              JOptionPane.showMessageDialog(null,"registered as admin");
          }
          else{
               JOptionPane.showMessageDialog(null,"user registered successfully");
          }
         
        }
        
        dispose();
        if(id == 1)
        {
        new Login().setVisible(true);
        }          
        }
        else{
            JOptionPane.showMessageDialog(null,"Password doesnot match");
        }
        
        
        
        }catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void provienceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provienceComboBoxActionPerformed
        // TODO add your handling code here:
        if(provienceComboBox.getSelectedItem().equals("Province No 1"))
        {
            districtComboBox.removeAllItems();
            districtComboBox.addItem("Bhojpur");
            districtComboBox.addItem("Dhankuta");
            districtComboBox.addItem("Ilam");
            districtComboBox.addItem("Jhapa");
            districtComboBox.addItem("Khotang");
            districtComboBox.addItem("Khotang");
            districtComboBox.addItem("Okhaldhunga");
            districtComboBox.addItem("Panchthar");
            districtComboBox.addItem("Sankhuwasabha");
            districtComboBox.addItem("Solukhumbu");
            districtComboBox.addItem("Sunsari");
            districtComboBox.addItem("Taplejung");
            districtComboBox.addItem("Terhathum");
            districtComboBox.addItem("Udayapur");
            districtComboBox.setSelectedItem(null);
        }

        else
        if(provienceComboBox.getSelectedItem().equals("Madhesh Pradesh"))
        {
            districtComboBox.removeAllItems();
            districtComboBox.addItem("Bara");
            districtComboBox.addItem("Dhanusa");
            districtComboBox.addItem("Mahottari");
            districtComboBox.addItem("Parsa");
            districtComboBox.addItem("Rauthat");
            districtComboBox.addItem("Saptari");
            districtComboBox.addItem("Sarlahi");
            districtComboBox.addItem("Siraha");
            districtComboBox.setSelectedItem(null);
        }

        else
        if(provienceComboBox.getSelectedItem().equals("Bagmati Pradesh"))
        {
            districtComboBox.removeAllItems();
            //ProvienceComboBox.setSelectedItem(null);
            districtComboBox.addItem("Bhaktapur ");
            districtComboBox.addItem("Chitwan");
            districtComboBox.addItem("Dhading");
            districtComboBox.addItem("Dolakha");
            districtComboBox.addItem("Kathmandu");
            districtComboBox.addItem("Kavrepalanchok");
            districtComboBox.addItem("Lalitpur");
            districtComboBox.addItem("Makawanpur");
            districtComboBox.addItem("Nuwakot");
            districtComboBox.addItem("Ramechap");
            districtComboBox.addItem("Rasuwa");
            districtComboBox.addItem("Sindhuli");
            districtComboBox.addItem("Sindhupalanchowk");
            districtComboBox.setSelectedItem(null);
        }

        else
        if(provienceComboBox.getSelectedItem().equals("Gandaki Pradesh"))
        {
            districtComboBox.removeAllItems();
            //  ProvienceComboBox.setSelectedItem(null);
            districtComboBox.addItem("Baglung ");
            districtComboBox.addItem("Gorkha");
            districtComboBox.addItem("Kaski");
            districtComboBox.addItem("Lamjung");
            districtComboBox.addItem("Manang");
            districtComboBox.addItem("Mustang");
            districtComboBox.addItem("Myagdi");
            districtComboBox.addItem("Nawalparasi(Bardaghat Susta Purva)");
            districtComboBox.addItem("Parbat");
            districtComboBox.addItem("Syangja");
            districtComboBox.addItem("Tanahu");
            districtComboBox.setSelectedItem(null);
        }

        else
        if(provienceComboBox.getSelectedItem().equals("Lumbini Pradesh"))
        {
            districtComboBox.removeAllItems();
            //  ProvienceComboBox.setSelectedItem(null);
            districtComboBox.addItem("Arghakhanchi ");
            districtComboBox.addItem("Banke");
            districtComboBox.addItem("Bardiya");
            districtComboBox.addItem("Dang");
            districtComboBox.addItem("Gulmi");
            districtComboBox.addItem("Kapilvastu");
            districtComboBox.addItem("Nawalparasi(Bardaghat Susta Paschim)");
            districtComboBox.addItem("Palpa");
            districtComboBox.addItem("Pyuthan");
            districtComboBox.addItem("Rolpa");
            districtComboBox.addItem("Purbi Rukum");
            districtComboBox.addItem("Rupandehi");
            districtComboBox.setSelectedItem(null);
        }

        else
        if(provienceComboBox.getSelectedItem().equals("Karnali Pradesh"))
        {
            districtComboBox.removeAllItems();
            //  ProvienceComboBox.setSelectedItem(null);
            districtComboBox.addItem("Dailekh");
            districtComboBox.addItem("Dolpa");
            districtComboBox.addItem("Humla");
            districtComboBox.addItem("Jajarkot");
            districtComboBox.addItem("Jumla");
            districtComboBox.addItem("Kalikot");
            districtComboBox.addItem("Mugu");
            districtComboBox.addItem("Rukum Pashim");
            districtComboBox.addItem("Salyan");
            districtComboBox.addItem("Surkhet");
            districtComboBox.setSelectedItem(null);
        }
        else
        {
            districtComboBox.removeAllItems();
            // ProvienceComboBox.setSelectedItem(null);
            districtComboBox.addItem("Achham");
            districtComboBox.addItem("Baitadi");
            districtComboBox.addItem("Bajhang");
            districtComboBox.addItem("Bajura");
            districtComboBox.addItem("Darchula");
            districtComboBox.addItem("Doti");
            districtComboBox.addItem("Kailali");
            districtComboBox.addItem("Kanchanpur");
            districtComboBox.setSelectedItem(null);
        }
    }//GEN-LAST:event_provienceComboBoxActionPerformed

    private void districtComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districtComboBoxActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar DOBS;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField citizenshipTextField;
    private javax.swing.JComboBox<String> districtComboBox;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JComboBox<String> provienceComboBox;
    private javax.swing.JTextField usenameTextfield;
    // End of variables declaration//GEN-END:variables
}
