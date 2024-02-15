
package Grafo_NO_Dirigido_listaAd;

import Grafo_Dirigido_listaAd.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrmGrafoLista extends javax.swing.JFrame {

    GrafoLista g = new GrafoLista(8);
    
    DefaultListModel modeloP = new DefaultListModel();
    DefaultListModel modeloA = new DefaultListModel();
    
    public FrmGrafoLista() throws Exception {
        initComponents();
        
//        g.insertarVertice("A");
//        g.insertarVertice("B");
//        g.insertarVertice("C");
//        g.insertarVertice("D");
//        g.insertarVertice("H");
//        g.insertarVertice("R");
//        g.insertarVertice("T");
//        
//        
//        g.insertarArco("D", "B");
//        g.insertarArco("D", "C");
//        
//        g.insertarArco("B", "H");
//        
//        g.insertarArco("H", "A");
//        g.insertarArco("H", "T");
//        
//        g.insertarArco("C", "R");
//        
//        g.insertarArco("R", "H");
//        
//        
//        g.mostrar(modelo);
//        g.recorridoEnAnchura(modeloA, "D");
//        g.recorridoEnProfunfidad(modeloP, "D");
    }
    
    public void apagar(boolean apaga){
        txtNumV.setEnabled(!apaga);
        btnGuardar.setEnabled(!apaga);
        
        txtVertice.setEnabled(apaga);
        btnVertice.setEnabled(apaga);
        
        txtA.setEnabled(apaga);
        txtB.setEnabled(apaga);
        btnArco.setEnabled(apaga);
        
        txtOrigen.setEnabled(apaga);
        btnOrigen.setEnabled(apaga);
        
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
        jLabel1 = new javax.swing.JLabel();
        txtNumV = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        txtVertice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnVertice = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        btnArco = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        btnOrigen = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaAdyace = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NUMERO DE VERTICES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 140, -1));
        jPanel1.add(txtNumV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 120, -1));

        btnGuardar.setBackground(new java.awt.Color(153, 153, 255));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 90, -1));

        txtVertice.setEnabled(false);
        txtVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerticeActionPerformed(evt);
            }
        });
        jPanel1.add(txtVertice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 110, -1));

        jLabel2.setText("INSERTAR VERTICE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 110, -1));

        btnVertice.setText("INSERTAR");
        btnVertice.setEnabled(false);
        btnVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerticeActionPerformed(evt);
            }
        });
        jPanel1.add(btnVertice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 110, -1));

        jLabel3.setText("INSERTAR ARCO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 110, -1));

        txtA.setEnabled(false);
        jPanel1.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 130, -1));

        txtB.setEnabled(false);
        jPanel1.add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 130, -1));

        btnArco.setText("INSERTAR");
        btnArco.setEnabled(false);
        btnArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArcoActionPerformed(evt);
            }
        });
        jPanel1.add(btnArco, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 130, -1));

        jLabel4.setText("a:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 20, -1));

        jLabel5.setText("b:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 20, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 900, 20));

        jLabel6.setText("LISTA DE ADYACENCIA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 400, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("VERTICE DE ORIGEN");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 19, 156, -1));

        txtOrigen.setEnabled(false);
        jPanel2.add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, -1));

        btnOrigen.setText("INSERTAR");
        btnOrigen.setEnabled(false);
        btnOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrigenActionPerformed(evt);
            }
        });
        jPanel2.add(btnOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 120, -1));

        jList1.setModel(modeloA);
        jScrollPane2.setViewportView(jList1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 120, 200));

        jList2.setModel(modeloP);
        jScrollPane3.setViewportView(jList2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 120, 200));

        jLabel8.setText("PROFUNDIDAD");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, -1));

        jLabel9.setText("ANCHURA");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 120, -1));

        jTabbedPane1.addTab("RECORRIDO", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        area.setColumns(20);
        area.setRows(5);
        jScrollPane4.setViewportView(area);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 260, 160));

        jTabbedPane1.addTab("ADYACENTES", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 420, 380));

        txtAreaAdyace.setColumns(20);
        txtAreaAdyace.setRows(5);
        jScrollPane5.setViewportView(txtAreaAdyace);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 420, 200));

        jLabel10.setText("GRAFO NO DIRIGIDO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int n = Integer.parseInt(txtNumV.getText());
        g = new GrafoLista(n);
        
        txtAreaAdyace.setText(g.mostrar());
        apagar(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerticeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVerticeActionPerformed

    private void btnVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerticeActionPerformed
        String v = txtVertice.getText();
        g.insertarVertice(v);
        
        txtAreaAdyace.setText(g.mostrar());
        txtVertice.setText("");
        txtVertice.requestFocus();
        
        try {
            area.setText(g.listaAdyacentes());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnVerticeActionPerformed

    private void btnArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArcoActionPerformed
        String a = txtA.getText();
        String b = txtB.getText();
        
        try {
            g.insertarArco(a, b);
            txtAreaAdyace.setText(g.mostrar());
            
            area.setText(g.listaAdyacentes());
            txtA.setText("");
            txtB.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        txtA.requestFocus();
    }//GEN-LAST:event_btnArcoActionPerformed

    private void btnOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrigenActionPerformed
        String origen = txtOrigen.getText();
        
        try {
            g.recorridoEnAnchura(modeloA, origen);
            g.recorridoEnProfunfidad(modeloP, origen);
            
            txtOrigen.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOrigenActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(FrmGrafoLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGrafoLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGrafoLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGrafoLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmGrafoLista().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FrmGrafoLista.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton btnArco;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnOrigen;
    private javax.swing.JButton btnVertice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextArea txtAreaAdyace;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtNumV;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtVertice;
    // End of variables declaration//GEN-END:variables
}
