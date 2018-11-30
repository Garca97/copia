package edu.co.sergio.mundo.vo;
/**
 * @author Nico Patalagua
 */
public class Administrador extends Empleado{
    private int Oficina;
    public Administrador(int Oficina, String Nombre, String Direccion, String Clave, int Id, int Telefono, double Salario) {
        super(Nombre, Direccion, Clave, Id, Telefono, Salario);
        this.Oficina = Oficina;
    }

    
    
    public int getOficina() {
        return Oficina;
    }
    public void setOficina(int Oficina) {
        this.Oficina = Oficina;
    }  
}
