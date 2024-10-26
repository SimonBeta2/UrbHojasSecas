/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Simon
 */
public class EspacioComun {
    private String lugar, horaApertura, horaCierre;
    private double costoMantenimiento;

    public EspacioComun() {
    }
    
    

    public EspacioComun(String lugar, String horaApertura, String horaCierre, double costoMantenimiento) {
        this.lugar = lugar;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.costoMantenimiento = costoMantenimiento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public double getCostoMantenimiento() {
        return costoMantenimiento;
    }

    public void setCostoMantenimiento(double costoMantenimiento) {
        this.costoMantenimiento = costoMantenimiento;
    }

    @Override
    public String toString() {
        return "EspacioComun{" + "lugar=" + lugar + ", horaApertura=" + horaApertura + ", horaCierre=" + horaCierre + ", costoMantenimiento=" + costoMantenimiento + '}';
    }
    
    
}
