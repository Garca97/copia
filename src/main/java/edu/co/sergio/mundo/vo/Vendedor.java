package edu.co.sergio.mundo.vo;
/**
 * @author Nico Patalagua
 */
public class Vendedor extends Empleado{
    private int NumeroVentas;
    public Vendedor(int NumeroVentas, String Nombre, String Direccion, String Clave, int Id, int Telefono, double Salario) {
        super(Nombre, Direccion, Clave, Id, Telefono, Salario);
        this.NumeroVentas = NumeroVentas;
    }   
    public int getNumeroVentas() {
        return NumeroVentas;
    }
    public void setNumeroVentas(int NumeroVentas) {
        this.NumeroVentas = NumeroVentas;
    }
}
