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

public class Acceso extends javax.swing.JFrame {
//Clases de conexion y sus objetos
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    public Acceso() {//Inicia constructor
        initComponents();
        this.setTitle("Bienvenido al Sistema de Venta *CUTE THINGS*");//pone titulo
        this.setLocationRelativeTo(null);//Centra la ventana
    }//Termina constructor
    
    //metodo para conectar a la base de datos
public void conectarBase(){
    try{ //inicia try
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost/bdcutethings", "root", "");
        JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nCute Things");
        stmt=cn.createStatement();//genera sentencias sobre objetos de base de datos
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error de base de datos 1: \n"+ex);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error de base de datos 2:"+e);
    }
}//termina metodo conectar

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBienvenido = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        panAutentificacion = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        pasContrasena = new javax.swing.JPasswordField();
        lblImagen = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panBienvenido.setBackground(new java.awt.Color(255, 204, 255));

        lblBienvenido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(153, 51, 255));
        lblBienvenido.setText("Bienvenido al Sistema de Venta");

        panAutentificacion.setBackground(new java.awt.Color(255, 102, 255));
        panAutentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Autentificación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(102, 0, 153))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 153, 153));
        lblUsuario.setText("Usuario:");

        lblContrasena.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(0, 153, 153));
        lblContrasena.setText("Contraseña:");

        javax.swing.GroupLayout panAutentificacionLayout = new javax.swing.GroupLayout(panAutentificacion);
        panAutentificacion.setLayout(panAutentificacionLayout);
        panAutentificacionLayout.setHorizontalGroup(
            panAutentificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAutentificacionLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panAutentificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblContrasena)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAutentificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(pasContrasena))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        panAutentificacionLayout.setVerticalGroup(
            panAutentificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAutentificacionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panAutentificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAutentificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasena)
                    .addComponent(pasContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cute Things2.jpg"))); // NOI18N

        btnEntrar.setBackground(new java.awt.Color(204, 51, 255));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(204, 153, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBienvenidoLayout = new javax.swing.GroupLayout(panBienvenido);
        panBienvenido.setLayout(panBienvenidoLayout);
        panBienvenidoLayout.setHorizontalGroup(
            panBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBienvenidoLayout.createSequentialGroup()
                .addGroup(panBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBienvenidoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panBienvenidoLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(lblBienvenido))
                    .addGroup(panBienvenidoLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(panAutentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panBienvenidoLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(btnEntrar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panBienvenidoLayout.setVerticalGroup(
            panBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBienvenidoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panAutentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try{
            String usuarioAcceso=this.txtUsuario.getText();
            String passAcceso=this.pasContrasena.getText();
            boolean error=true;
            
            conectarBase();
            
            //busqueda de usuario
            rs=stmt.executeQuery("SELECT * FROM tusuarios");
            
            while (rs.next() == true) {//inicia while   
                
                if (usuarioAcceso.equals(rs.getString("usuario"))&&passAcceso.equals(rs.getString("contrasena"))) {//inicia if
                    error=false;
                    JOptionPane.showMessageDialog(null, "Bienvenido al sistema usuario: \n\n "+usuarioAcceso);
                    ControlVentas ventanaAplicacion=new ControlVentas();//llamada a la ventana de aplicacion o IGU
                    ventanaAplicacion.setVisible(true);//muestra ventana
                    this.hide();//oculta ventana anterior
                    
                }//termina if                
            }//termina while
            
            if(error==true){
                JOptionPane.showMessageDialog(null, "Error usuario no existe en sistema\nVerifica "+usuarioAcceso);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de BD validacion\n\n"+ex);
        } 
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panAutentificacion;
    private javax.swing.JPanel panBienvenido;
    private javax.swing.JPasswordField pasContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}