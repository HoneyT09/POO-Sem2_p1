/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto3;

import java.util.ArrayList;
import javax.swing.JFrame;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Honey
 */
public class Interfaz extends javax.swing.JFrame {
    List<Cliente> clientes = new ArrayList<>();
    private Object javax;
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jColorChooser3 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jColorChooser4 = new javax.swing.JColorChooser();
        jColorChooser5 = new javax.swing.JColorChooser();
        jColorChooser6 = new javax.swing.JColorChooser();
        txtIdCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtidCliente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        idCliente = new javax.swing.JLabel();
        Txtnombre = new javax.swing.JLabel();
        Txtedad = new javax.swing.JLabel();
        Txtcorreo = new javax.swing.JLabel();
        Txttelefono = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableClientes = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtIdCliente.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        jLabel1.setText("Cartera de Clientes");

        TxtidCliente.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                TxtidClienteComponentResized(evt);
            }
        });
        TxtidCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtidClienteActionPerformed(evt);
            }
        });

        idCliente.setText("idCliente");

        Txtnombre.setText("nombre");

        Txtedad.setText("edad");

        Txtcorreo.setText("correo");

        Txttelefono.setText("telefono");

        Agregar.setText("Agregar Cliente");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar Cliente");

        Buscar.setText("Buscar cliente (Nombre)");

        JTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IdCliente", "Nombre", "Edad", "Correo", "Telefono"
            }
        ));
        jScrollPane2.setViewportView(JTableClientes);

        javax.swing.GroupLayout txtIdClienteLayout = new javax.swing.GroupLayout(txtIdCliente);
        txtIdCliente.setLayout(txtIdClienteLayout);
        txtIdClienteLayout.setHorizontalGroup(
            txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtIdClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtIdClienteLayout.createSequentialGroup()
                        .addGroup(txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtIdClienteLayout.createSequentialGroup()
                                .addGroup(txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtnombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(TxtidCliente)))
                            .addComponent(Txtcorreo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(txtIdClienteLayout.createSequentialGroup()
                        .addGroup(txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txtIdClienteLayout.createSequentialGroup()
                                .addComponent(Txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 149, 149)
                        .addComponent(Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Eliminar)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtIdClienteLayout.createSequentialGroup()
                        .addComponent(Txttelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(479, 479, 479))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtIdClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtIdClienteLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtIdClienteLayout.createSequentialGroup()
                                .addComponent(Buscar)
                                .addGap(177, 177, 177))))))
        );
        txtIdClienteLayout.setVerticalGroup(
            txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtIdClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtnombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtedad))
                .addGap(1, 1, 1)
                .addComponent(Buscar)
                .addGap(5, 5, 5)
                .addGroup(txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtcorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtIdClienteLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txttelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(txtIdClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(txtIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Agregar)
                            .addComponent(Eliminar))))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void limpiar(){
    TxtidCliente.setText("");
    Txtnombre.setText("");
    Txtedad.setText("");
    Txtcorreo.setText("");
    Txttelefono.setText("");
}
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        int edad, idCliente;
        String nombre, correo, telefono;
        try {
            idCliente = Integer.parseInt(TxtidCliente.getText());
            nombre = Txtnombre.getText();
            edad = Integer.parseInt(Txtedad.getText());
            correo = Txtcorreo.getText();
            telefono = Txttelefono.getText();
            Cliente cliente = new Cliente(idCliente,nombre,edad,correo,telefono);
            clientes.add(cliente);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifica los datos");
        }
       limpiar();
       verDatos();
       
    }//GEN-LAST:event_AgregarActionPerformed
    private void verDatos(){
        String lib [][] = new String[clientes.size()][3];
        Cliente aux;
        for (int i = 0; i < clientes.size(); i++) {
            aux = clientes.get(i);
            lib[i][0] = Integer.toString(aux.getIdCliente());
            lib[i][1] = aux.getNombre();
            lib[i][2] = Integer.toString(aux.getEdad());
            lib[i][3] = aux.getCorreo();
            lib[i][4] = aux.getTelefono();
        }
        JTableClientes.setModel(new javax.swing.table.DefaultTableModel(
                lib,
                new Object [][] {
                },
                new String [] {
                    "IdCliente", "Nombre", "Edad", "Correo", "Telefono"
                }
        ));        
    }
    private void TxtidClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtidClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtidClienteActionPerformed

    private void TxtidClienteComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TxtidClienteComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtidClienteComponentResized

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTable JTableClientes;
    private javax.swing.JLabel Txtcorreo;
    private javax.swing.JLabel Txtedad;
    private javax.swing.JTextField TxtidCliente;
    private javax.swing.JLabel Txtnombre;
    private javax.swing.JLabel Txttelefono;
    private javax.swing.JLabel idCliente;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    private javax.swing.JColorChooser jColorChooser4;
    private javax.swing.JColorChooser jColorChooser5;
    private javax.swing.JColorChooser jColorChooser6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JPanel txtIdCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
