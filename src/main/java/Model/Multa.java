/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.time.LocalDate;
/**
 *
 * @author Simon
 */
public class Multa {
    private String idMulta;
    private LocalDate fechaExpedicionMulta, fechaIncidente;
    private EspacioComun espacioComun;
    private Casa casa;
    private String incidente;
    private double valorMulta;
    private LocalDate fechaDePago;
    private String mensaje;

    public Multa() {
    }

    public Multa(String idMulta, LocalDate fechaExpedicionMulta, LocalDate fechaIncidente, EspacioComun espacioComun, Casa casa, String incidente, double valorMulta, LocalDate fechaDePago, String mensaje) {
        this.idMulta = idMulta;
        this.fechaExpedicionMulta = fechaExpedicionMulta;
        this.fechaIncidente = fechaIncidente;
        this.espacioComun = espacioComun;
        this.casa = casa;
        this.incidente = incidente;
        this.valorMulta = valorMulta;
        this.fechaDePago = fechaDePago;
        this.mensaje = mensaje;
    }

    public String getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(String idMulta) {
        this.idMulta = idMulta;
    }

    public LocalDate getFechaExpedicionMulta() {
        return fechaExpedicionMulta;
    }

    public void setFechaExpedicionMulta(LocalDate fechaExpedicionMulta) {
        this.fechaExpedicionMulta = fechaExpedicionMulta;
    }

    public LocalDate getFechaIncidente() {
        return fechaIncidente;
    }

    public void setFechaIncidente(LocalDate fechaIncidente) {
        this.fechaIncidente = fechaIncidente;
    }

    public EspacioComun getEspacioComun() {
        return espacioComun;
    }

    public void setEspacioComun(EspacioComun espacioComun) {
        this.espacioComun = espacioComun;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public String getIncidente() {
        return incidente;
    }

    public void setIncidente(String incidente) {
        this.incidente = incidente;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public LocalDate getFechaDePago() {
        return fechaDePago;
    }

    public void setFechaDePago(LocalDate fechaDePago) {
        this.fechaDePago = fechaDePago;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Multa{" + "idMulta=" + idMulta + ", fechaExpedicionMulta=" + fechaExpedicionMulta + ", fechaIncidente=" + fechaIncidente + ", espacioComun=" + espacioComun + ", casa=" + casa + ", incidente=" + incidente + ", valorMulta=" + valorMulta + ", fechaDePago=" + fechaDePago + ", mensaje=" + mensaje + '}';
    }
    
    
}
