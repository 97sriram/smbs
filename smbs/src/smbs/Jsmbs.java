/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smbs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTextField;
/**
 *
 * @author sriram
 */
public class Jsmbs extends javax.swing.JFrame {
    

    private Connection con;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    
    /**
     * Creates new form Jsmbs
     */
    public Jsmbs() {
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Super?zeroDateTimeBehavior=convertToNull","root","");
          st = con.createStatement();
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ins = new javax.swing.JButton();
        upd = new javax.swing.JButton();
        del = new javax.swing.JButton();
        bill = new javax.swing.JButton();
        sdb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ins.setText("Insert");
        ins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insActionPerformed(evt);
            }
        });

        upd.setText("Update");
        upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updActionPerformed(evt);
            }
        });

        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        bill.setText("Billing");
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });

        sdb.setText("Items Avail");
        sdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdbActionPerformed(evt);
            }
        });

        jLabel1.setText("WELCOME TO SUPER MARKET BILLING SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(sdb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ins)
                            .addComponent(del))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bill, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(upd, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ins)
                    .addComponent(upd))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(del)
                    .addComponent(bill))
                .addGap(32, 32, 32)
                .addComponent(sdb)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insActionPerformed
        // TODO add your handling code here:
        Insert ob= new Insert();
        this.setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_insActionPerformed

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        
        this.setVisible(false);
        new Billing().setVisible(true);
        
    }//GEN-LAST:event_billActionPerformed

    private void updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updActionPerformed
        // TODO add your handling code here:
        Update ob = new Update();
        this.setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_updActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
        Delete ob = new Delete();
        this.setVisible(false);
        ob.setVisible(true);
        
        
    }//GEN-LAST:event_delActionPerformed

    private void sdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdbActionPerformed
        // TODO add your handling code here:
        sdb ob = new sdb();
        this.setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_sdbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        Billing obj= new Billing();
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jsmbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jsmbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jsmbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jsmbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jsmbs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bill;
    private javax.swing.JButton del;
    private javax.swing.JButton ins;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sdb;
    private javax.swing.JButton upd;
    // End of variables declaration//GEN-END:variables
}
