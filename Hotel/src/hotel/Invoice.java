/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import properties.focusManager;

/**
 *
 * @author Win -8
 */
public class Invoice extends javax.swing.JFrame {

    /**
     * Creates new form Invoice
     */
    public Invoice() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        ichid = new javax.swing.JTextField();
        ichn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nictf2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        nictf1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nictf = new javax.swing.JTextField();
        USER_REGISTRATION = new javax.swing.JLabel();
        invoiceBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ichid.setEnabled(false);
        ichid.setBounds(590, 510, 120, 20);
        jLayeredPane1.add(ichid, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ichn.setEnabled(false);
        ichn.setBounds(590, 540, 120, 20);
        jLayeredPane1.add(ichn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("Name :");
        jLabel10.setBounds(540, 510, 41, 17);
        jLayeredPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setText("ID :");
        jLabel11.setBounds(540, 540, 20, 17);
        jLayeredPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cashier"));
        jLabel3.setBounds(520, 480, 240, 100);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Print");
        jButton1.setBounds(620, 410, 80, 40);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nictf2.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        nictf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nictf2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nictf2KeyTyped(evt);
            }
        });
        nictf2.setBounds(210, 80, 170, 30);
        jLayeredPane1.add(nictf2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Cordia New", 0, 36)); // NOI18N
        jLabel8.setText("Total :");
        jLabel8.setBounds(80, 400, 80, 30);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Cordia New", 0, 36)); // NOI18N
        jLabel9.setText("Waiter ID :");
        jLabel9.setBounds(70, 80, 120, 30);
        jLayeredPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Cordia New", 0, 36)); // NOI18N
        jLabel7.setBounds(160, 400, 160, 30);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product", "Qty", "Unit Price", "Sub Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(70, 210, 640, 170);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Cordia New", 0, 36)); // NOI18N
        jLabel6.setText("Qty :");
        jLabel6.setBounds(430, 140, 50, 30);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nictf1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        nictf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nictf1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nictf1KeyTyped(evt);
            }
        });
        nictf1.setBounds(510, 140, 170, 30);
        jLayeredPane1.add(nictf1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Cordia New", 0, 36)); // NOI18N
        jLabel5.setText("Product :");
        jLabel5.setBounds(70, 140, 110, 30);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nictf.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        nictf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nictfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nictfKeyTyped(evt);
            }
        });
        nictf.setBounds(190, 140, 170, 30);
        jLayeredPane1.add(nictf, javax.swing.JLayeredPane.DEFAULT_LAYER);

        USER_REGISTRATION.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        USER_REGISTRATION.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        USER_REGISTRATION.setText("Invoice");
        USER_REGISTRATION.setBounds(0, 0, 800, 50);
        jLayeredPane1.add(USER_REGISTRATION, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoiceBG.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(invoiceBG, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nictfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nictfKeyPressed
        // TODO add your handling code here:
        new focusManager().textFieldsNext(evt, nictf, null);
    }//GEN-LAST:event_nictfKeyPressed

    private void nictfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nictfKeyTyped
        // TODO add your handling code here:
        if (!(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        } else {
            //evt.consume();
        }
        if (nictf.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_nictfKeyTyped

    private void nictf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nictf1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nictf1KeyPressed

    private void nictf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nictf1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nictf1KeyTyped

    private void nictf2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nictf2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nictf2KeyPressed

    private void nictf2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nictf2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nictf2KeyTyped

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel USER_REGISTRATION;
    private javax.swing.JTextField ichid;
    private javax.swing.JTextField ichn;
    private javax.swing.JLabel invoiceBG;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nictf;
    private javax.swing.JTextField nictf1;
    private javax.swing.JTextField nictf2;
    // End of variables declaration//GEN-END:variables
}
