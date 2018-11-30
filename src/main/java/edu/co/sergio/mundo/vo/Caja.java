package edu.co.sergio.mundo.vo;
/**
 * @author Nico Patalagua
 */
public class Caja {
    private int Numero;
    private double Saldo;
    public Caja(int Numero, double Saldo) {
        this.Numero = Numero;
        this.Saldo = Saldo;
    }

    public int getNumero() {
        return Numero;
    }
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    public double getSaldo() {
        return Saldo;
    }
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }   
}
