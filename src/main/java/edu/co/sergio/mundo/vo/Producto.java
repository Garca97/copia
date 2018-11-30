package pos;
/**
 * @author Nico Patalagua
 */
public class Producto {
    private String Nombre;
    private int CodigoBarras,Cantidad;
    private double Precio;
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getCodigoBarras() {
        return CodigoBarras;
    }
    public void setCodigoBarras(int CodigoBarras) {
        this.CodigoBarras = CodigoBarras;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }   
}
