/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Simon
 */
public class Empleado extends Persona {
    private String cargo;

    public Empleado() {
    }

    public Empleado(String id, String cargo, String nombre, String correo, String telefono) {
        super(id, nombre, correo, telefono);
        this.cargo = cargo;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }   
    
}
