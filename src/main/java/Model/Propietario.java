/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Simon
 */
public class Propietario extends Persona {
    private String salario, profesion;

    public Propietario() {
    }

    public Propietario(String id, String salario, String profesion, String nombre, String correo, String telefono) {
        super(id, nombre, correo, telefono);
        this.salario = salario;
        this.profesion = profesion;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
