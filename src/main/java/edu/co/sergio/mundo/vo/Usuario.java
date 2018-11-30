package edu.co.sergio.mundo.vo;
/**
 * @author Nico Patalagua
 */
public class Usuario {
    private int id;
    private String Contrasena,Tipo;
    public Usuario(int id, String Contrasena, String Tipo) {
        this.id = id;
        this.Contrasena = Contrasena;
        this.Tipo = Tipo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getContrasena() {
        return Contrasena;
    }
    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }    
}
