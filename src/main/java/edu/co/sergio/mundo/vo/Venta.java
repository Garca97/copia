package edu.co.sergio.mundo.vo;
/**
 * @author Nico Patalagua
 */
public class Venta {
    private String Codigo,Nombre;
    private int Cantidad,IdFactura;
    private double PrecioUnitario,PrecioTotal;
    public Venta(String Codigo, String Nombre, int Cantidad, int IdFactura, double PrecioUnitario, double PrecioTotal) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.IdFactura = IdFactura;
        this.PrecioUnitario = PrecioUnitario;
        this.PrecioTotal = PrecioTotal;
    }
    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    public int getIdFactura() {
        return IdFactura;
    }
    public void setIdFactura(int IdFactura) {
        this.IdFactura = IdFactura;
    }
    public double getPrecioUnitario() {
        return PrecioUnitario;
    }
    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }
    public double getPrecioTotal() {
        return PrecioTotal;
    }
    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }   
}
