/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7P2_CarmenCastillo;

/**
 *
 * @author casti
 */
public class Usuario {
    String Nombre;
    String Usuario;
    String Contra;
    double saldoCompra;

    public Usuario() {
    }

    public Usuario(String Nombre, String Usuario, String Contra, double saldoCompra) {
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Contra = Contra;
        this.saldoCompra = saldoCompra;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public double getSaldoCompra() {
        return saldoCompra;
    }

    public void setSaldoCompra(double saldoCompra) {
        this.saldoCompra = saldoCompra;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre=" + Nombre + ", Usuario=" + Usuario + ", Contra=" + Contra + ", saldoCompra=" + saldoCompra + '}';
    }
    
    
    
}
