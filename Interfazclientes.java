
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class Interfazclientes extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Interfazclientes.class.getName());
    private DefaultTableModel modelo;
    
    
    public Interfazclientes() {
        
        modelo = new DefaultTableModel();
        
        initComponents();
        
        this.tbl.setModel(modelo); 
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Dirección");
        modelo.addColumn("NIF");
        modelo.addColumn("razonsocial");
        modelo.addColumn("Direccion de Facturacion");
        modelo.addColumn("Dirección de Envio");
        modelo.addColumn("E-mail");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Activo");
        
        
        cesurClientes = new CesurClientes();
                    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNif = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btnAñadir = new javax.swing.JToggleButton();
        btnLeer = new javax.swing.JToggleButton();
        btnActualizar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        txtRazon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_DireccionEnv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccionFacturacion = new javax.swing.JTextField();
        btnSalir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Dirección:");

        jLabel3.setText("NIF:");

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Dirección", "NIF", "Razón Social", "Direccion Facturacion", "Direccion de Envio", "Email", "Telefono", "Activo"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        btnAñadir.setText("AÑADIR");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnLeer.setText("LEER");

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setText("Razon Social");

        jLabel5.setText("Direccion de envío: ");

        jLabel6.setText("Email");

        jLabel7.setText("Telefono");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel8.setText("Direccion Facturacion:");

        txtDireccionFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionFacturacionActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLeer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNif)
                            .addComponent(txtNombre)
                            .addComponent(txtEmail)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccion)
                            .addComponent(txtRazon)
                            .addComponent(txt_DireccionEnv)
                            .addComponent(txtDireccionFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtRazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_DireccionEnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDireccionFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAñadir)
                        .addGap(18, 18, 18)
                        .addComponent(btnLeer)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addGap(50, 50, 50))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        //Utilizar getSelectedRow();
        String direccion = this.txtDireccion.getText();
        String telefono = this.txtTelefono.getText();
        String nombre = this.txtNombre.getText();
        String nif = this.txtNif.getText();
        String razon = this.txtNif.getText();
        String email = this.txtEmail.getText();
        String direccionFacturacion = this.txtDireccionFacturacion.getText();
        String direccionEnvio = this.txt_DireccionEnv.getText();
        
        Cliente cliente = new Cliente(nombre,direccion, nif,razon,direccionFacturacion, direccionEnvio, email, telefono);
        
        
        cesurClientes.addCliente(cliente);
        
        rellenarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
        String direccion = this.txtDireccion.getText();
        String telefono = this.txtTelefono.getText();
        String nombre = this.txtNombre.getText();
        String nif = this.txtNif.getText();
        String razon = this.txtNif.getText();
        String email = this.txtEmail.getText();
        String direccionFacturacion = this.txtDireccionFacturacion.getText();
        String direccionEnvio = this.txt_DireccionEnv.getText();
        
        Cliente cliente = new Cliente(nombre,direccion, nif,razon,direccionFacturacion, direccionEnvio, email, telefono);
        
        cesurClientes.existeCliente(cliente);
        cesurClientes.addCliente(cliente);
        
        rellenarTabla();
        
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void txtDireccionFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionFacturacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionFacturacionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = this.tbl.getSelectedRow();
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "No has seleccionado ninguna fila ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String nombre = (String)modelo.getValueAt(filaSeleccionada, 0);
            String direccion= (String)modelo.getValueAt(filaSeleccionada, 1);
            String Nif = (String)modelo.getValueAt(filaSeleccionada, 2);
            String razonSocial = (String)modelo.getValueAt(filaSeleccionada, 3);
            String direccionFacturacion = (String)modelo.getValueAt(filaSeleccionada, 4);
            String direccionEnvio = (String)modelo.getValueAt(filaSeleccionada, 5);
            String email = (String)modelo.getValueAt(filaSeleccionada, 6);
            String Telefono = (String)modelo.getValueAt(filaSeleccionada, 7);
            String activo = (String)modelo.getValueAt(filaSeleccionada, 8);
            
            Cliente aux = new Cliente(nombre, direccion, Nif, razonSocial, direccionFacturacion, direccionEnvio, email, Telefono);
            System.out.println(nombre);
            //Pasarle el contacto que queremos elimnar ahora a la agenda y eliminarlo.
            
            cesurClientes.delCliente(aux);
            
            rellenarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed
    }
    //Métodos para utilizar. 
    
    
    private void rellenarTabla(){
          
          modelo.setRowCount(0);  
        
          Cliente clientes[]  = cesurClientes.getCliente();
          
          
          Object[] fila;
          for (int i = 0; i < clientes.length; i++){
              //Creamos la fila
              fila = new Object[9];
              fila [0] = clientes[i].getNombre();
              fila [1] = clientes[i].getDireccion();
              fila [2] = clientes[i].getnIF();
              fila [3] = clientes[i].getRazonSocial();
              fila [4] = clientes[i].getDireccionFacturacion();
              fila [5] = clientes[i].getDireccionEnvio();
              fila [6] = clientes[i].getEmail();
              fila [7] = clientes[i].getTelefono();
              fila [8] = clientes[i].isActivo();
              modelo.addRow(fila);
              
          }
    }
    
    
    private CesurClientes cesurClientes;
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Interfazclientes().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnActualizar;
    private javax.swing.JToggleButton btnAñadir;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JToggleButton btnLeer;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionFacturacion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNif;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRazon;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txt_DireccionEnv;
    // End of variables declaration//GEN-END:variables
}
