package Pojos;

public class SistemaVentas {//Inicia clase
    //Atributos
    String Producto;
    double Precio;
    String ID;
    double Existencia;
    
    //Constructor vacio
    public SistemaVentas() {
    }
    
    //Constructor que pasa parametros
    public SistemaVentas(String Producto, double Precio, String ID, double Existencia) {
        this.Producto = Producto;
        this.Precio = Precio;
        this.ID = ID;
        this.Existencia = Existencia;
    }
    
    //Métodos get y set
    public String getProducto() {
        return Producto;
    }
    public void setProducto(String Producto) {
        this.Producto = Producto;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public double getExistencia() {
        return Existencia;
    }
    public void setExistencia(double Existencia) {
        this.Existencia = Existencia;
    }    
}//Termina clase
