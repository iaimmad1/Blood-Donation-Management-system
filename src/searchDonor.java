
import Project.ConnectionProvider;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class searchDonor extends javax.swing.JFrame {

    /**
     * Creates new form searchDonor
     */
    private static searchDonor obj=null;
   public static searchDonor getObj()
    {
        if(obj==null)
        {
            obj=new searchDonor();
        }
        return obj;
    }
    
    protected searchDonor() {
        initComponents();
        setLocationRelativeTo(null);
         setResizable(false);
        searchComboBox.setSelectedItem("Blood ID");
        searchTextField.setVisible(true);
        BgCombobox.setVisible(false); 
        jTable1.setAutoCreateRowSorter(true);
        try{
         java.sql.Connection con =ConnectionProvider.getCon();
         java.sql.Statement st=con.createStatement();
         ResultSet rs1=st.executeQuery("select donorId,name,blood_group,DOB,Mobile_number,gender,email,provience,district,citizenship_number,donatedUnit from donor");  
         jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
         jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        
        }

    }
    
  
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        searchComboBox = new javax.swing.JComboBox<>();
        BgCombobox = new javax.swing.JComboBox<>();
        searchTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(340, 130));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel1.setText("Search Blood Donor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 700, 11));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Search by:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 158, 700, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 174, 700, 250));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 700, 9));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        jButton3.setText("search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        searchComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Donor ID", "Citizenship Number", "Blood Group", " " }));
        searchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(searchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 100, 30));

        BgCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-", " " }));
        BgCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BgComboboxActionPerformed(evt);
            }
        });
        getContentPane().add(BgCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 120, 30));
        getContentPane().add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 72, 180, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 700, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            jTable1.print(JTable.PrintMode.NORMAL);
            
        }catch(PrinterException e)
        {
            JOptionPane.showMessageDialog(null,"e");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try{
             
          java.sql.Connection con =ConnectionProvider.getCon();
         java.sql.Statement st=con.createStatement();
         
         if( searchComboBox.getSelectedItem().equals("Donor ID")){
             String d_id = searchTextField.getText();
            //ResultSet rs1 = st.executeUpdate("select donorId, name, blood_group, Mobile_number, email, gender, provience, district, citizenship_number, donatedUnit from donor like donorId = '%"+b_id+"'");
            ResultSet rs1=st.executeQuery("select donorId,name,blood_group,DOB,Mobile_number,gender,email,provience,district,citizenship_number,donatedUnit from donor where donorId like '%"+d_id+"' ");  
          jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
         }
         else  if( searchComboBox.getSelectedItem().equals("Citizenship Number")){
            String c_no = searchTextField.getText();
            ResultSet rs1=st.executeQuery("select donorId,name,blood_group,DOB,Mobile_number,gender,email,provience,district,citizenship_number,donatedUnit from donor where citizenship_number like '%"+c_no+"' ");  
          jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
         }
         else  if( searchComboBox.getSelectedItem().equals("Blood Group")){
             String b_group = (String)BgCombobox.getSelectedItem();
            ResultSet rs1=st.executeQuery("select donorId,name,blood_group,DOB,Mobile_number,gender,email,provience,district,citizenship_number,donatedUnit from donor where blood_group like '%"+b_group+"' ");  
          jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
         }
         else{
             JOptionPane.showMessageDialog(null, "please input the search method");
         }
        }catch(SQLException e)
        {
         JOptionPane.showMessageDialog(null, e);
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BgComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BgComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BgComboboxActionPerformed

    private void searchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchComboBoxActionPerformed
        // TODO add your handling code here:
        if(searchComboBox.getSelectedItem().equals("Blood Group")){
        searchTextField.setVisible(false);
        BgCombobox.setVisible(true);
    }
        else
        {
        searchTextField.setVisible(true);
        BgCombobox.setVisible(false);   
        }
        
        
    }//GEN-LAST:event_searchComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(searchDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BgCombobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}
