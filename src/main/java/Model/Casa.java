/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Simon
 */
public class Casa {
    private String numero;
    private Propietario propietario;
    private double saldoActual;
    private int metrosCuadrados;

    public Casa() {
    }
    
    

    public Casa(String numero, Propietario propietario, double saldoActual, int metrosCuadrados) {
        this.numero = numero;
        this.propietario = propietario;
        this.saldoActual = saldoActual;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "Casa{" + "numero=" + numero + ", propietario=" + propietario + ", saldoActual=" + saldoActual + ", metrosCuadrados=" + metrosCuadrados + '}';
    }
    
    
    
}
