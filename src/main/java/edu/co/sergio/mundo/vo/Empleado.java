package edu.co.sergio.mundo.vo;
/**
 * @author Nico Patalagua
 */
public class Empleado {
    private String Nombre,Direccion,Clave;
    private int Id,Telefono;
    private double Salario;
    public Empleado(String Nombre, String Direccion, String Clave, int Id, int Telefono, double Salario) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Clave = Clave;
        this.Id = Id;
        this.Telefono = Telefono;
        this.Salario = Salario;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    public String getClave() {
        return Clave;
    }
    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public int getTelefono() {
        return Telefono;
    }
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double Salario) {
        this.Salario = Salario;
    }  
}
