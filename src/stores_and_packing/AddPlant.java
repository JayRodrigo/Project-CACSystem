/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stores_and_packing;

import maintenance.*;
import common.PredefineMethods;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class AddPlant extends javax.swing.JFrame {

    /**
     * Creates new form AddTools
     */
    public AddPlant() throws SQLException {
        initComponents();
        id.setText(Integer.toString((Integer.parseInt(PredefineMethods.
                        viewDBValue("SELECT MAX(plant_id) as last_plant_id FROM plant", "last_plant_id")))+1));
    }
    
    private void setAllNull() {
        PredefineMethods.setTextField(toname, "");
        PredefineMethods.setTextField(qua, "");
        PredefineMethods.setComboBox(typet, "Select..");
        jTextArea1.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        typet = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        toname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        qua = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        plantFA = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 51, 0));
        id.setText("Plant ID");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 160, 35));

        jLabel6.setText("type");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 60, 35));

        submit.setBackground(new java.awt.Color(0, 0, 255));
        submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Add Plant Details");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 180, 40));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 13));

        typet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..", "Flowering Plant", "Cactus", "Conifers", "Moss", "Seed Plants ", "Butter Cup", "Pinidae", "Algae", " " }));
        typet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typetActionPerformed(evt);
            }
        });
        getContentPane().add(typet, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 180, 25));

        jLabel2.setText("Note");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 20));

        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        toname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tonameActionPerformed(evt);
            }
        });
        getContentPane().add(toname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 180, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Add Plant Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 30));

        jLabel8.setText("Quantity");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        qua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quaActionPerformed(evt);
            }
        });
        qua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quaKeyTyped(evt);
            }
        });
        getContentPane().add(qua, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 180, 25));

        jLabel4.setText("Plant ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 80, 35));

        jLabel7.setText("First Appear");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 110, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 180, 140));
        getContentPane().add(plantFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String qry = "INSERT INTO plant (name, type, quantity, appear, Note) "
                + "VALUES ('"+PredefineMethods.getTextField(toname)+"',"
                + "'"+PredefineMethods.getSelectedCombo(typet)+"',"
                + "'"+PredefineMethods.getTextField(qua)+"',"
                + "'"+PredefineMethods.getSelectedDate(plantFA)+"',"
                + "'"+jTextArea1.getText().toString()+"')";
        
        PredefineMethods.editDB(qry);
        PredefineMethods.viewJoptionPane("Plant Successfully Added");
            
        try {
        id.setText(Integer.toString((Integer.parseInt(PredefineMethods.
                        viewDBValue("SELECT MAX(plant_id) as last_plant_id FROM plant", "last_plant_id")))+1));
        } catch (SQLException ex) {
            Logger.getLogger(AddMachine.class.getName()).log(Level.SEVERE, null, ex);
        }
        setAllNull();
    }//GEN-LAST:event_submitActionPerformed

    private void tonameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tonameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tonameActionPerformed

    private void quaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_quaActionPerformed

    private void quaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quaKeyPressed

    }//GEN-LAST:event_quaKeyPressed

    private void quaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quaKeyTyped

    }//GEN-LAST:event_quaKeyTyped

    private void typetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typetActionPerformed
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
            java.util.logging.Logger.getLogger(ViewTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPlant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private com.toedter.calendar.JDateChooser plantFA;
    private javax.swing.JTextField qua;
    public javax.swing.JButton submit;
    private javax.swing.JTextField toname;
    private javax.swing.JComboBox<String> typet;
    // End of variables declaration//GEN-END:variables

    
}
