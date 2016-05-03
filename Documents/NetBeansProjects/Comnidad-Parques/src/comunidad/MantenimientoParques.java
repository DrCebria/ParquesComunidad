/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunidad;

import static comunidad.FichaComunidades.con;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author daw1
 */
public class MantenimientoParques extends javax.swing.JFrame {

    static Connection con;
    static String Consulta;
    static String Direccion = "jdbc:mysql://localhost:3306/parques";
    static PreparedStatement ps;
    static ResultSet rs;

    public MantenimientoParques() {
        initComponents();
        try {
            con = DriverManager.getConnection(Direccion, "root", "root");
            if (con != null) {
                LabelConexion.setText("CONEXI�N ESTABLECIDA");

            } else {
            }

        } catch (SQLException e) {
            LabelConexion.setText(e.getMessage() + " -- " + e.getErrorCode());

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
        FieldId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotonInsert = new javax.swing.JButton();
        BotonDelete = new javax.swing.JButton();
        BotonUpdate = new javax.swing.JButton();
        LabelConexion = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        FieldExtension = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ComboComunidades = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id Parque");

        jLabel2.setText("Nombre Parque");

        jLabel3.setText("Extensi�n");

        jLabel4.setText("C�digo de Comunidad");

        BotonInsert.setText("New");
        BotonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertActionPerformed(evt);
            }
        });

        BotonDelete.setText("Delete");
        BotonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDeleteActionPerformed(evt);
            }
        });

        BotonUpdate.setText("Edit");
        BotonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUpdateActionPerformed(evt);
            }
        });

        LabelConexion.setText("jLabel5");

        jLabel5.setText("Km2");

        ComboComunidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Andalucia", "Aragon", "Castilla la Mancha", "Canarias", "Comunidad Valenciana" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FieldExtension, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(ComboComunidades, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonInsert)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelConexion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonDelete)
                                .addGap(18, 18, 18)
                                .addComponent(BotonUpdate)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FieldExtension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(ComboComunidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonInsert)
                    .addComponent(BotonDelete)
                    .addComponent(BotonUpdate))
                .addGap(29, 29, 29)
                .addComponent(LabelConexion)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertActionPerformed
        try {

            con = DriverManager.getConnection(Direccion, "root", "root");

            if (con != null) {
                Consulta = "INSERT INTO parques.parque(id, nombre, extension, idComunidad) VALUES (" + FieldId.getText() + " , '"+ FieldNombre.getText() + "', " + FieldExtension.getText() + ", " + FieldCodigo.getText() + ")";
                ps = con.prepareStatement(Consulta);
                ps.executeUpdate();
                
            }

        } catch (SQLException e) {
            LabelConexion.setText(e.getMessage() + " -- " + e.getErrorCode());

        }
    }//GEN-LAST:event_BotonInsertActionPerformed

    private void BotonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDeleteActionPerformed
        try {

            con = DriverManager.getConnection(Direccion, "root", "root");

            if (con != null) {
                Double id2;
                
                Consulta = "DELETE FROM parques.parque WHERE 'id'="+FieldId.getText();
                ps = con.prepareStatement(Consulta);
                ps.executeUpdate();
                
            }

        } catch (SQLException e) {
            LabelConexion.setText(e.getMessage() + " -- " + e.getErrorCode());

        }
    }//GEN-LAST:event_BotonDeleteActionPerformed

    private void BotonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(MantenimientoParques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoParques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoParques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoParques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoParques().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDelete;
    private javax.swing.JButton BotonInsert;
    private javax.swing.JButton BotonUpdate;
    private javax.swing.JComboBox ComboComunidades;
    private javax.swing.JTextField FieldExtension;
    private javax.swing.JTextField FieldId;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JLabel LabelConexion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
