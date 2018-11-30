package edu.co.sergio.mundo.vo;
/**
 * @author Nico Patalagua
 */
public class Cliente {
    private String Nombre,Direccion;
    public Cliente(String Nombre, String Direccion) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
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
}
