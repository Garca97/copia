package edu.co.sergio.mundo.vo;
import java.util.ArrayList;
import java.util.Date;
/**
 * @author Nico Patalagua
 */
public class Factura {
    private int CodigoFactura;
    private String NombreSupermercado="";
    private ArrayList<Venta> Ventas;
    private Date Fecha;
    private double Subtotal,Total,Efectivo,Cambio;
    private Cliente Cliente;
    private Vendedor Vendedor;
    public Factura(int CodigoFactura, ArrayList<Venta> Ventas, Date Fecha, double Subtotal, double Total, double Efectivo, double Cambio, Cliente Cliente, Vendedor Vendedor) {
        this.CodigoFactura = CodigoFactura;
        this.Ventas = Ventas;
        this.Fecha = Fecha;
        this.Subtotal = Subtotal;
        this.Total = Total;
        this.Efectivo = Efectivo;
        this.Cambio = Cambio;
        this.Cliente = Cliente;
        this.Vendedor = Vendedor;
    }
    public int getCodigoFactura() {
        return CodigoFactura;
    }
    public void setCodigoFactura(int CodigoFactura) {
        this.CodigoFactura = CodigoFactura;
    }
    public String getNombreSupermercado() {
        return NombreSupermercado;
    }
    public void setNombreSupermercado(String NombreSupermercado) {
        this.NombreSupermercado = NombreSupermercado;
    }
    public ArrayList<Venta> getVentas() {
        return Ventas;
    }
    public void setVentas(ArrayList<Venta> Ventas) {
        this.Ventas = Ventas;
    }
    public Date getFecha() {
        return Fecha;
    }
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    public double getSubtotal() {
        return Subtotal;
    }
    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }
    public double getTotal() {
        return Total;
    }
    public void setTotal(double Total) {
        this.Total = Total;
    }
    public double getEfectivo() {
        return Efectivo;
    }
    public void setEfectivo(double Efectivo) {
        this.Efectivo = Efectivo;
    }
    public double getCambio() {
        return Cambio;
    }
    public void setCambio(double Cambio) {
        this.Cambio = Cambio;
    }
    public Cliente getCliente() {
        return Cliente;
    }
    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }
    public Vendedor getVendedor() {
        return Vendedor;
    }
    public void setVendedor(Vendedor Vendedor) {
        this.Vendedor = Vendedor;
    }   
}
