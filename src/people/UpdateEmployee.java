/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import common.PredefineMethods;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class UpdateEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    public UpdateEmployee(String updateEmpNo,String updateEpfNo,String updateFname,String updateLname,String updateEmail,String updatePhone,String updateAddress,String updateDOB,String updateNIC,String updateJDate,String updateUserLevel) throws SQLException, ParseException {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        employeeNo.setText(updateEmpNo);
        PredefineMethods.setTextField(epfNo, updateEpfNo);
        PredefineMethods.setTextField(name, updateFname);
        PredefineMethods.setTextField(name1, updateLname);
        PredefineMethods.setTextField(email, updateEmail);
        PredefineMethods.setTextField(phone, updatePhone);
        PredefineMethods.setTextField(address, updateAddress);
        PredefineMethods.setTextField(nic, updateNIC);
        PredefineMethods.setComboBox(jComboBox1, updateUserLevel);
        java.util.Date dateDOB = new SimpleDateFormat("EEEE, MMMM dd, yyyy").parse(updateDOB);
        empDOB.setDate(dateDOB);
        java.util.Date dateJD = new SimpleDateFormat("EEEE, MMMM dd, yyyy").parse(updateJDate);
        empJD.setDate(dateJD);

    }
    
        private UpdateEmployee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void setAllNull(){
        epfNo.setText("");
        name.setText("");
        name1.setText("");
        email.setText("");
        phone.setText("");
        address.setText("");  
        nic.setText(""); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCustomer = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nic = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        employeeNo = new javax.swing.JLabel();
        epfNo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        name1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        empDOB = new com.toedter.calendar.JDateChooser();
        empJD = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addCustomer.setBackground(new java.awt.Color(10, 24, 224));
        addCustomer.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        addCustomer.setForeground(new java.awt.Color(255, 255, 255));
        addCustomer.setText("Update");
        addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(addCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 100, 30));

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 100, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("*");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("*");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("*");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
        });
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 210, -1));

        phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneFocusGained(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 210, -1));

        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 210, -1));

        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 210, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Date Of Birth");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Phone");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("First Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 90, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("NIC No");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 90, -1));

        nic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nicFocusGained(evt);
            }
        });
        getContentPane().add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 210, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("User Level");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 100, 20));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Update Employee");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 27, 420, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 57, 530, 20));

        jLabel2.setText("Please enter the information below. fields with * are required.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 67, -1, -1));

        employeeNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        employeeNo.setForeground(new java.awt.Color(255, 51, 0));
        employeeNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        employeeNo.setText("Emp No");
        getContentPane().add(employeeNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 220, -1));

        epfNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                epfNoFocusGained(evt);
            }
        });
        epfNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epfNoActionPerformed(evt);
            }
        });
        getContentPane().add(epfNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 210, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("*");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("*");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Joined date");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Data Entry Operator", "Driver", "Machine Repair", "Supervisor", "Manager", "Admin" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 210, -1));

        name1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name1FocusGained(evt);
            }
        });
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 210, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("*");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 10, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("*");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 20, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("*");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Last Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 90, -1));

        error.setForeground(java.awt.Color.red);
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 210, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("*");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 20, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("EPF No");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Emp No");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 90, -1));
        getContentPane().add(empDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 210, -1));
        getContentPane().add(empJD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerActionPerformed
        String qry = "Update employee SET "
                    + "epfNo = '"+PredefineMethods.getTextField(epfNo)+"',"
                    + "fname = '"+PredefineMethods.getTextField(name)+"',"
                    + "lname = '"+PredefineMethods.getTextField(name1)+"',"
                    + "email = '"+PredefineMethods.getTextField(email)+"',"
                    + "phone = '"+PredefineMethods.getTextField(phone)+"',"
                    + "address = '"+PredefineMethods.getTextField(address)+"',"
                    + "nic = '"+PredefineMethods.getTextField(nic)+"',"
                    + "user_level = '"+PredefineMethods.getSelectedCombo(jComboBox1)+"',"
                    + "dob = '"+PredefineMethods.getSelectedDate(empDOB)+"',"
                    + "jdate = '"+PredefineMethods.getSelectedDate(empJD)+"' "
                    + "where empNo = '"+employeeNo.getText()+"'";
        
            PredefineMethods.editDB(qry);
            PredefineMethods.viewJoptionPane("Employee Successfully Updated");

    }//GEN-LAST:event_addCustomerActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        this.dispose();   
    }//GEN-LAST:event_CancelActionPerformed

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
  
    }//GEN-LAST:event_addressFocusGained

    private void phoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneFocusGained

    }//GEN-LAST:event_phoneFocusGained

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
     
    }//GEN-LAST:event_emailFocusGained

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
  
    }//GEN-LAST:event_nameFocusGained

    private void nicFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nicFocusGained

    }//GEN-LAST:event_nicFocusGained

    private void epfNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_epfNoFocusGained

    }//GEN-LAST:event_epfNoFocusGained

    private void epfNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epfNoActionPerformed
    
    }//GEN-LAST:event_epfNoActionPerformed

    private void name1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name1FocusGained

    }//GEN-LAST:event_name1FocusGained

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployee().setVisible(true);            
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    protected javax.swing.JButton addCustomer;
    private javax.swing.JTextField address;
    private javax.swing.JTextField email;
    private com.toedter.calendar.JDateChooser empDOB;
    private com.toedter.calendar.JDateChooser empJD;
    private javax.swing.JLabel employeeNo;
    private javax.swing.JTextField epfNo;
    protected javax.swing.JLabel error;
    private javax.swing.JComboBox jComboBox1;
    protected javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    protected javax.swing.JLabel jLabel17;
    protected javax.swing.JLabel jLabel18;
    protected javax.swing.JLabel jLabel19;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel21;
    protected javax.swing.JLabel jLabel22;
    protected javax.swing.JLabel jLabel23;
    protected javax.swing.JLabel jLabel24;
    protected javax.swing.JLabel jLabel25;
    protected javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}