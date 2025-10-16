

import javax.swing.table.DefaultTableModel;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author javiifu
 */
public class jpnClientes extends javax.swing.JPanel {

    // ==== CAMPOS DE CLASE ====
    private static final Logger logger = Logger.getLogger(jpnClientes.class.getName());
    private DefaultTableModel modelo;
    private CesurClientes cesurClientes;

    /**
     * Creates new form jpnClientes
     */
    public jpnClientes() {
        initComponents();

        modelo = new DefaultTableModel();
        this.tbl.setModel(modelo);

        modelo.addColumn("Nombre");
        modelo.addColumn("Dirección");
        modelo.addColumn("NIF");
        modelo.addColumn("Razón Social");
        modelo.addColumn("Dirección Facturación");
        modelo.addColumn("Dirección de Envío");
        modelo.addColumn("Email");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Activo");

        cesurClientes = new CesurClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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

        jLabel1.setText("Nombre:");

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
                "Nombre", "Dirección", "NIF", "Razón Social", "Dirección Facturación", "Dirección Envío", "Email", "Teléfono", "Activo"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        btnAñadir.setText("AÑADIR");
        btnAñadir.addActionListener(evt -> btnAñadirActionPerformed(evt));

        btnLeer.setText("LEER");

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(evt -> btnActualizarActionPerformed(evt));

        btnEliminar.setText("DAR ALTA/BAJA");

        jLabel4.setText("Razón Social");

        jLabel5.setText("Dirección de envío:");

        jLabel6.setText("Email");

        jLabel7.setText("Teléfono");

        jLabel8.setText("Dirección Facturación:");

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(evt -> btnSalirActionPerformed(evt));

        // Layout del panel (corregido para JPanel)
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }// </editor-fold>                        


    // ==== EVENTOS ====

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String direccion = this.txtDireccion.getText();
        String telefono = this.txtTelefono.getText();
        String nombre = this.txtNombre.getText();
        String nif = this.txtNif.getText();
        String razon = this.txtRazon.getText();
        String email = this.txtEmail.getText();
        String direccionFacturacion = this.txtDireccionFacturacion.getText();
        String direccionEnvio = this.txt_DireccionEnv.getText();

        Cliente cliente = new Cliente(nombre, direccion, nif, razon, direccionFacturacion, direccionEnvio, email, telefono);

        if (!cesurClientes.existeCliente(cliente)) {
            cesurClientes.addCliente(cliente);
        }

        rellenarTabla();
    }                                             

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String direccion = this.txtDireccion.getText();
        String telefono = this.txtTelefono.getText();
        String nombre = this.txtNombre.getText();
        String nif = this.txtNif.getText();
        String razon = this.txtRazon.getText();
        String email = this.txtEmail.getText();
        String direccionFacturacion = this.txtDireccionFacturacion.getText();
        String direccionEnvio = this.txt_DireccionEnv.getText();

        Cliente cliente = new Cliente(nombre, direccion, nif, razon, direccionFacturacion, direccionEnvio, email, telefono);

        if (!cesurClientes.existeCliente(cliente)) {
            cesurClientes.addCliente(cliente);
            rellenarTabla();
        }
    }                                         

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Como es un JPanel embebido, no cerramos toda la app
        // Podrías limpiar campos si quieres
        txtNombre.setText("");
        txtDireccion.setText("");
        txtNif.setText("");
        txtRazon.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtDireccionFacturacion.setText("");
        txt_DireccionEnv.setText("");
    }                                        

    // ==== MÉTODOS ====
    private void rellenarTabla() {
        modelo.setRowCount(0);
        Cliente[] clientes = cesurClientes.getCliente();
        if (clientes == null) return;

        for (Cliente c : clientes) {
            if (c == null) continue;
            Object[] fila = {
                c.getNombre(),
                c.getDireccion(),
                c.getnIF(),
                c.getRazonSocial(),
                c.getDireccionFacturacion(),
                c.getDireccionEnvio(),
                c.getEmail(),
                c.getTelefono(),
                c.isActivo()
            };
            modelo.addRow(fila);
        }
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
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
            //Pasarle el contacto que queremos elimnar 
            cesurClientes.delCliente(aux);
            
            rellenarTabla();
    }                                           
    }
    // ==== VARIABLES ====
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
}

/**
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
/*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido a la ventana de clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(417, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(419, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
/*

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}**/