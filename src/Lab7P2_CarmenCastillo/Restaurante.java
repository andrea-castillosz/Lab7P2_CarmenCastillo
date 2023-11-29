/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7P2_CarmenCastillo;

import java.util.ArrayList;

/**
 *
 * @author casti
 */
public class Restaurante {
    String Nombre;
    String Ubicacion;
    ArrayList<Producto> producto = new ArrayList();
    double SaldoV;

    public Restaurante() {
    }

    public Restaurante(String Nombre, String Ubicacion, double SaldoV) {
        this.Nombre = Nombre;
        this.Ubicacion = Ubicacion;
        this.SaldoV = SaldoV;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    public double getSaldoV() {
        return SaldoV;
    }

    public void setSaldoV(double SaldoV) {
        this.SaldoV = SaldoV;
    }
    
    
    
    
}
