
import Project.ConnectionProvider;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PRAKASH
 */
public class receiveBlood extends javax.swing.JFrame {
// private static receiveBlood obj=null;
    /**
     * Creates new form receiveBlood
     */
    public receiveBlood() {
        initComponents();
        setLocationRelativeTo(null);
         setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Gets the width and height
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        // Subtract height of taskbar from height in my case 50 
        setSize((int)width, (int)height -50);
        setLocation(0,57);  // Set frame at center of the screen
        //setUndecorated(true); // Removes title bar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

        jSpinField1.setMinimum(0);

        Date();
        ID();
    }
    
     private void Date() {
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String str = ft.format(new java.util.Date());
        lbl_date.setText(str);
       
     }
     public void ID(){
          try{
          Connection con =ConnectionProvider.getCon();
          Statement st=con.createStatement();// kahila kahi statement bhitra (ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY) halna vanxa...
          ResultSet rs = st.executeQuery("Select max(receiver_log_id) from receiver_log");
          if(rs.next())// our table is not then 
          {
              int Id = rs.getInt(1);
              Id=Id+1;
              String str=String.valueOf(Id);
              lbl_log_id.setText(str);
              
          }
          else
              lbl_log_id.setText("1");
    }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
     }

 /*   public static receiveBlood getObj()
    {
        if (obj==null)
        {
            
           // obj = new receiveBlood();
            obj =  new receiveBlood();
        }
        return obj;
    }
   */ 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_log_id = new javax.swing.JLabel();
        receiver_id = new javax.swing.JTextField();
        patient_name = new javax.swing.JTextField();
        lbl_date = new javax.swing.JLabel();
        BLOODGROUPBOX = new javax.swing.JComboBox<>();
        referenceTextField = new javax.swing.JTextField();
        purposeTextField = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSpinField1 = new com.toedter.components.JSpinField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 790, 12));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Purpose");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 246, 90, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Register ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 113, 90, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Blood Group");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Units");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 162, 90, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Receiver ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 162, 90, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 114, 90, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Patient Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 246, 100, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Reference");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 210, 90, 30));

        lbl_log_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_log_id.setForeground(new java.awt.Color(253, 4, 12));
        lbl_log_id.setText("1");
        getContentPane().add(lbl_log_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 117, 72, 24));

        receiver_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiver_idActionPerformed(evt);
            }
        });
        getContentPane().add(receiver_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 167, 171, -1));
        getContentPane().add(patient_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 246, 173, -1));

        lbl_date.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_date.setText("jLabel10");
        getContentPane().add(lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 115, 136, 30));

        BLOODGROUPBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-", " " }));
        getContentPane().add(BLOODGROUPBOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 215, 171, -1));
        getContentPane().add(referenceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 215, 179, -1));
        getContentPane().add(purposeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 251, 179, -1));

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 401, -1, -1));

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 401, -1, -1));

        btn_close.setText("Cancel");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 401, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 790, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("BLOOD RECEIVNG FORM");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 20, 710, 60));
        getContentPane().add(jSpinField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
       setVisible(false);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        dispose();
        new receiveBlood().setVisible(true);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        String l_id = lbl_log_id.getText();
        String r_id = receiver_id.getText();
        String date = lbl_date.getText();
        int units = jSpinField1.getValue();
        String b_g = (String)BLOODGROUPBOX.getSelectedItem();
        String reference = referenceTextField.getText();
        String p_name = patient_name.getText();
        String purpose = purposeTextField.getText();
        int sid = 0 ;
        if("A+".equals((String)BLOODGROUPBOX.getSelectedItem()))
        {
            sid =1;
        }
        else if("A-".equals((String)BLOODGROUPBOX.getSelectedItem()))
        {
            sid =2;
        }
        else if("B+".equals((String)BLOODGROUPBOX.getSelectedItem()))
        {
            sid =3;
        }
        else if("B-".equals((String)BLOODGROUPBOX.getSelectedItem()))
        {
            sid =4;
        }
        else if("O+".equals((String)BLOODGROUPBOX.getSelectedItem()))
        {
            sid =5;
        }
        else if("O-".equals((String)BLOODGROUPBOX.getSelectedItem()))
        {
            sid =6;
        }
        else if("AB+".equals((String)BLOODGROUPBOX.getSelectedItem()))
        {
            sid =7;
        }
        else if("AB-".equals((String)BLOODGROUPBOX.getSelectedItem()))
        {
            sid =8;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"enter blood group");
            setVisible(false);
        }
       
        
        try{
          Connection con =ConnectionProvider.getCon();
          Statement st=con.createStatement();
         ResultSet rs1 = st.executeQuery("select unit from stock where stockId = '"+sid+"' ");
          if(rs1.next()){
              
              int unit = rs1.getInt(1);
              int n_unit = unit - units;
              st.executeUpdate("insert into receiver_log (receiver_log_id,date_of_receive,units_received,received_blood_group,reference,patient_name,purpose,receiver_ID,stock_Id) values ('"+l_id+"','"+date+"','"+units+"','"+b_g+"','"+reference+"','"+p_name+"','"+purpose+"','"+r_id+"','"+sid+"')");
                                 
              st.executeUpdate("update stock set unit = '"+n_unit+"' where stockId = '"+sid+"'");
          }
          
          
          
          
          JOptionPane.showMessageDialog(null, "updated successfully");
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void receiver_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiver_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receiver_idActionPerformed

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
            java.util.logging.Logger.getLogger(receiveBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receiveBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receiveBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receiveBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receiveBlood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BLOODGROUPBOX;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_log_id;
    private javax.swing.JTextField patient_name;
    private javax.swing.JTextField purposeTextField;
    private javax.swing.JTextField receiver_id;
    private javax.swing.JTextField referenceTextField;
    // End of variables declaration//GEN-END:variables
}
