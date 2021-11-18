package Vista;

//Librerias de conexion 
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//driver de conexion
import java.sql.ResultSet;//resultado final de datos
import java.sql.ResultSetMetaData;//resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errors de BD SQL
import java.sql.Statement;//Genereador de sentencias SQL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//Fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imagenes
import javax.swing.JOptionPane;//Ventanas emergentes
import javax.swing.table.DefaultTableModel;//Tabla de datos
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;

import Pojos.SistemaVentas;

public class ControlVentas extends javax.swing.JFrame {

    //Clases de conexion y sus objetos
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    //SistemaVentas objetoSistemaVentas
    SistemaVentas objetoSistemaVentas = new SistemaVentas();
    
    public ControlVentas() {
        initComponents();
    }

    //metodo para conectar a la base de datos
public void conectarBase(){
    try{ //inicia try
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost/bdcutethings", "root", "");
        JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nCUTE THINGS");
        stmt=cn.createStatement();//genera sentencias sobre objetos de base de datos
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error de base de datos 1: \n"+ex);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error de base de datos 2:"+e);
    }
}//termina metodo conectar

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panSistemaInventario = new javax.swing.JPanel();
        lblEscribe = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lbliD = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        panMenuOpciones = new javax.swing.JPanel();
        lblOpcion = new javax.swing.JLabel();
        btnAgregarProucto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        btnEditarProducto = new javax.swing.JButton();
        btnGenerarPDF = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInventario = new javax.swing.JTable();
        lblLetrero = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblExistencia = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtExistencia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        mnuIrA = new javax.swing.JMenu();
        itmMnuAutentificacion = new javax.swing.JMenuItem();
        mnuVersion = new javax.swing.JMenu();
        itmMnuAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panSistemaInventario.setBackground(new java.awt.Color(255, 204, 204));

        lblEscribe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEscribe.setText("A continuación escribe el producto.");

        lblProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblProducto.setText("Producto:");

        lbliD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbliD.setText("ID:");

        panMenuOpciones.setBackground(new java.awt.Color(204, 0, 255));
        panMenuOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menú de Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 102, 0))); // NOI18N
        panMenuOpciones.setForeground(new java.awt.Color(153, 0, 153));

        lblOpcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOpcion.setForeground(new java.awt.Color(255, 153, 153));
        lblOpcion.setText("Elija la opción deseada:");

        btnAgregarProucto.setBackground(new java.awt.Color(255, 153, 153));
        btnAgregarProucto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregarProucto.setForeground(new java.awt.Color(102, 0, 102));
        btnAgregarProucto.setText("Agregar Producto a Inventario");
        btnAgregarProucto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProuctoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setBackground(new java.awt.Color(255, 153, 153));
        btnEliminarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(102, 0, 102));
        btnEliminarProducto.setText("Eliminar Producto de Inventario");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnBuscarProducto.setBackground(new java.awt.Color(255, 153, 153));
        btnBuscarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(102, 0, 102));
        btnBuscarProducto.setText("Buscar Producto en Inventario");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnEditarProducto.setBackground(new java.awt.Color(255, 153, 153));
        btnEditarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditarProducto.setForeground(new java.awt.Color(102, 0, 102));
        btnEditarProducto.setText("Editar Producto de Inventario");
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });

        btnGenerarPDF.setBackground(new java.awt.Color(255, 153, 153));
        btnGenerarPDF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerarPDF.setForeground(new java.awt.Color(0, 102, 102));
        btnGenerarPDF.setText("Generar PDF Inventario");
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 153, 153));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 153, 153));
        btnActualizar.setText("Actualizar Inventario");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panMenuOpcionesLayout = new javax.swing.GroupLayout(panMenuOpciones);
        panMenuOpciones.setLayout(panMenuOpcionesLayout);
        panMenuOpcionesLayout.setHorizontalGroup(
            panMenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMenuOpcionesLayout.createSequentialGroup()
                .addGroup(panMenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMenuOpcionesLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblOpcion))
                    .addGroup(panMenuOpcionesLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panMenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarProucto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerarPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panMenuOpcionesLayout.setVerticalGroup(
            panMenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMenuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOpcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarProucto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerarPDF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "producto", "precio", "id", "existencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtInventario);

        lblLetrero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLetrero.setForeground(new java.awt.Color(0, 102, 102));
        lblLetrero.setText("SISTEMA INVENTARIO CUTE THINGS");

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrecio.setText("Precio:");

        lblExistencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblExistencia.setText("Existencia:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cute Things Logo.jpg"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panSistemaInventarioLayout = new javax.swing.GroupLayout(panSistemaInventario);
        panSistemaInventario.setLayout(panSistemaInventarioLayout);
        panSistemaInventarioLayout.setHorizontalGroup(
            panSistemaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSistemaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSistemaInventarioLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panSistemaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblProducto)
                        .addComponent(lbliD))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panSistemaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panSistemaInventarioLayout.createSequentialGroup()
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblExistencia))
                        .addGroup(panSistemaInventarioLayout.createSequentialGroup()
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(lblPrecio)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panSistemaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(140, 140, 140))
                .addGroup(panSistemaInventarioLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel1)
                    .addGroup(panSistemaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panSistemaInventarioLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                            .addComponent(lblLetrero)
                            .addGap(104, 104, 104))
                        .addGroup(panSistemaInventarioLayout.createSequentialGroup()
                            .addGap(211, 211, 211)
                            .addComponent(lblEscribe)
                            .addGap(0, 0, Short.MAX_VALUE)))))
            .addGroup(panSistemaInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panMenuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panSistemaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );
        panSistemaInventarioLayout.setVerticalGroup(
            panSistemaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSistemaInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSistemaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSistemaInventarioLayout.createSequentialGroup()
                        .addComponent(lblLetrero)
                        .addGap(49, 49, 49)
                        .addComponent(lblEscribe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panSistemaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProducto)
                            .addComponent(lblPrecio)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panSistemaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbliD)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExistencia)
                    .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panSistemaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSistemaInventarioLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(panMenuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuIrA.setText("Ir");

        itmMnuAutentificacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        itmMnuAutentificacion.setText("A Ventana de Autentificación");
        itmMnuAutentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMnuAutentificacionActionPerformed(evt);
            }
        });
        mnuIrA.add(itmMnuAutentificacion);

        BarraMenu.add(mnuIrA);

        mnuVersion.setText("Versión");

        itmMnuAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        itmMnuAcerca.setText("Acerca de...");
        itmMnuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMnuAcercaActionPerformed(evt);
            }
        });
        mnuVersion.add(itmMnuAcerca);

        BarraMenu.add(mnuVersion);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panSistemaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panSistemaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProuctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProuctoActionPerformed
        // llamada o invocacion a metodo conectar
        conectarBase();
        String altaProducto=""; //variable para almacenar los valores capturados y enviarlos a la base 
        //para almacenar los valores desde formulario
        objetoSistemaVentas.setProducto(txtProducto.getText());
        objetoSistemaVentas.setPrecio(Double.parseDouble(txtPrecio.getText()));
        objetoSistemaVentas.setID(txtID.getText());
        objetoSistemaVentas.setExistencia(Double.parseDouble(txtExistencia.getText()));
    altaProducto="INSERT INTO tproductos (`producto`,`precio`,`id`,`existencia`) VALUE ('"+objetoSistemaVentas.getProducto()+"','"+objetoSistemaVentas.getPrecio()+"','"+objetoSistemaVentas.getID()+"','"+objetoSistemaVentas.getExistencia()+"')";
             try {
            stmt.executeUpdate(altaProducto);
            JOptionPane.showMessageDialog(null, "Registro exitoso \n"+ objetoSistemaVentas.getProducto());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos 2:"+e);
        }  
    }//GEN-LAST:event_btnAgregarProuctoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        int confirmaEliminar;
        
        try{
            conectarBase();
            String EliminarProducto= txtProducto.getText();
            confirmaEliminar = stmt.executeUpdate("DELETE FROM tproductos where producto = '"+EliminarProducto+"' ");
            if (confirmaEliminar==1) {
                JOptionPane.showMessageDialog(null,"Se eliminó el Producto de BD \n\n: "+confirmaEliminar);
            } else {
                JOptionPane.showMessageDialog(null,"Error no existe ese nombre de Producto de BD \n\n: ");
            }
        }catch (SQLException ex){
        JOptionPane.showMessageDialog(null,"Error de BD Eliminar"+ ex);
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        try {
            conectarBase();
            objetoSistemaVentas.setProducto(txtProducto.getText());
            objetoSistemaVentas.setID(txtID.getText());
            rs=stmt.executeQuery("SELECT * from tproductos where producto = '"+objetoSistemaVentas.getProducto()+"' ");
            rs=stmt.executeQuery("SELECT * from tproductos where id = '"+objetoSistemaVentas.getID()+"' ");
            JOptionPane.showMessageDialog(null, "Buscando el Producto deseado .....");
            if(rs.next()==true){
                //imprime datos del libro encontrado
                this.txtProducto.setText(rs.getString("producto"));
                this.txtID.setText(rs.getString("id"));
                this.txtPrecio.setText(rs.getString("precio"));
                this.txtExistencia.setText(rs.getString("existencia"));
            }else{
                JOptionPane.showMessageDialog(null, "Error no existe el nombre del Producto");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de BD Busqueda"+ex);
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        String EditarProducto="";
        try{
            conectarBase();
            objetoSistemaVentas.setProducto(txtProducto.getText());
            objetoSistemaVentas.setPrecio(Double.parseDouble(txtPrecio.getText()));
            objetoSistemaVentas.setID(txtID.getText());
            objetoSistemaVentas.setExistencia(Double.parseDouble(txtExistencia.getText()));
            
            EditarProducto="UPDATE tproductos SET precio = '"+objetoSistemaVentas.getPrecio()+"', Existencia = '"+objetoSistemaVentas.getExistencia()+"',ID = '"+objetoSistemaVentas.getID()+"'where producto = '"+objetoSistemaVentas.getProducto()+"'";
                stmt.executeUpdate(EditarProducto);
                JOptionPane.showMessageDialog(null, "Datos del Producto actualizado\nVerifica tu consulta");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de BD Actualizar;\n"+ex);
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        conectarBase();
        try {
            String rutaReporte = "src/reportes/rptProductosPDF.jasper";
            JasperPrint rptProductos = JasperFillManager.fillReport(rutaReporte,null,cn);
            JasperViewer ventanaVisor = new JasperViewer(rptProductos,false);
            ventanaVisor.setTitle("Contenido del Sistema de Inventario CUTE THINGS");
            ventanaVisor.setVisible(true);                       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD de Inventario verificacion\n\n"+e);
        }       
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            conectarBase(); //llamada a metodo conectar
            //Objeto almacenamiento logico de datos modelo de datos
            DefaultTableModel modeloDatos = new DefaultTableModel();
            jtInventario.setModel(modeloDatos);
            
            rs=stmt.executeQuery("select * from tproductos");
            
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("Producto");
            modeloDatos.addColumn("Precio");
            modeloDatos.addColumn("ID");
            modeloDatos.addColumn("Existencia");
            
            //imprimir registros
            while(rs.next()){
                Object fila [] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=rs.getObject(i+1);
                }//termina for
                modeloDatos.addRow(fila);
            }//termina while
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de BD Consulta"+ ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int confirmaSalida=JOptionPane.showConfirmDialog(null, "¿Quieres salir?", "Mensaje Importante", JOptionPane.YES_NO_OPTION);
        if(confirmaSalida==0){
            System.exit(1);//cierra ventana
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itmMnuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMnuAcercaActionPerformed
        JOptionPane.showMessageDialog(null, "Version 1.0 Software Cute Things 17112021\n Autor: Samanta Guerrero");
    }//GEN-LAST:event_itmMnuAcercaActionPerformed

    private void itmMnuAutentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMnuAutentificacionActionPerformed
        Acceso ventanaAcceso = new Acceso();//llamada
        ventanaAcceso.setVisible(true);//visualizar
        hide();//ocultar
    }//GEN-LAST:event_itmMnuAutentificacionActionPerformed

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
            java.util.logging.Logger.getLogger(ControlVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarProucto;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JMenuItem itmMnuAcerca;
    private javax.swing.JMenuItem itmMnuAutentificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtInventario;
    private javax.swing.JLabel lblEscribe;
    private javax.swing.JLabel lblExistencia;
    private javax.swing.JLabel lblLetrero;
    private javax.swing.JLabel lblOpcion;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lbliD;
    private javax.swing.JMenu mnuIrA;
    private javax.swing.JMenu mnuVersion;
    private javax.swing.JPanel panMenuOpciones;
    private javax.swing.JPanel panSistemaInventario;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}