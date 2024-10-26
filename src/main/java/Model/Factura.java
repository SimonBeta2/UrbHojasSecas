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
public class Factura {
    private String idFactura;
    private LocalDate fechaExpedicionFactura;
    private Casa casa;
    private double valorMetroCuadrado;
    private double valorFactura;
    private int numCuentasVencidas;
    private double valorCuentasVacias;
    private Multa multas;
    private double totalFactura;
    private LocalDate fechaDePago;
    private String mensaje;
    private double valorPagado;
    private LocalDate fechaCuandoPago;

    public Factura() {
    }

    public Factura(String idFactura, LocalDate fechaExpedicionFactura, Casa casa, double valorMetroCuadrado, double valorFactura, int numCuentasVencidas, double valorCuentasVacias, Multa multas, double totalFactura, LocalDate fechaDePago, String mensaje, double valorPagado, LocalDate fechaCuandoPago) {
        this.idFactura = idFactura;
        this.fechaExpedicionFactura = fechaExpedicionFactura;
        this.casa = casa;
        this.valorMetroCuadrado = valorMetroCuadrado;
        this.valorFactura = valorFactura;
        this.numCuentasVencidas = numCuentasVencidas;
        this.valorCuentasVacias = valorCuentasVacias;
        this.multas = multas;
        this.totalFactura = totalFactura;
        this.fechaDePago = fechaDePago;
        this.mensaje = mensaje;
        this.valorPagado = valorPagado;
        this.fechaCuandoPago = fechaCuandoPago;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public LocalDate getFechaExpedicionFactura() {
        return fechaExpedicionFactura;
    }

    public void setFechaExpedicionFactura(LocalDate fechaExpedicionFactura) {
        this.fechaExpedicionFactura = fechaExpedicionFactura;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }

    public int getNumCuentasVencidas() {
        return numCuentasVencidas;
    }

    public void setNumCuentasVencidas(int numCuentasVencidas) {
        this.numCuentasVencidas = numCuentasVencidas;
    }

    public double getValorCuentasVacias() {
        return valorCuentasVacias;
    }

    public void setValorCuentasVacias(double valorCuentasVacias) {
        this.valorCuentasVacias = valorCuentasVacias;
    }

    public Multa getMultas() {
        return multas;
    }

    public void setMultas(Multa multas) {
        this.multas = multas;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
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

    public double getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(double valorPagado) {
        this.valorPagado = valorPagado;
    }

    public LocalDate getFechaCuandoPago() {
        return fechaCuandoPago;
    }

    public void setFechaCuandoPago(LocalDate fechaCuandoPago) {
        this.fechaCuandoPago = fechaCuandoPago;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", fechaExpedicionFactura=" + fechaExpedicionFactura + ", casa=" + casa + ", valorMetroCuadrado=" + valorMetroCuadrado + ", valorFactura=" + valorFactura + ", numCuentasVencidas=" + numCuentasVencidas + ", valorCuentasVacias=" + valorCuentasVacias + ", multas=" + multas + ", totalFactura=" + totalFactura + ", fechaDePago=" + fechaDePago + ", mensaje=" + mensaje + ", valorPagado=" + valorPagado + ", fechaCuandoPago=" + fechaCuandoPago + '}';
    }
    
    
}
