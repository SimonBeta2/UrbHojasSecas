/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Simon
 */
public class Urbanizacion {
    ArrayList<Casa>casas = new ArrayList();
    ArrayList<EspacioComun>espaciosComunes = new ArrayList();
    ArrayList<Empleado>empleados = new ArrayList();
    ArrayList<Empleado>empleadosRecuperados = new ArrayList();
    ArrayList<Propietario>propietarios = new ArrayList();
    ArrayList<Propietario>propietariosRecuperados = new ArrayList();

    
    
    public void agregarEmpleado(Empleado empleado){
    if(verificarEmpleado(empleado.getId(),empleado.getCargo(),empleado.getNombre(),empleado.getCorreo(),empleado.getTelefono())==false){
       empleados.add(empleado);
       guardarArchivo();
       JOptionPane.showMessageDialog(null, "El empleado ha sido agregado");
    }else{
        JOptionPane.showMessageDialog(null, "El empleado no ha podido ser agregado");
    }
    }
    
    public String listarEmpleados(){
        String lista ="";
        if(!empleadosRecuperados.isEmpty()){
            for(Empleado empleado : empleadosRecuperados) {
                lista = lista + empleado.getId()+ "\t" + empleado.getCargo() + "\t" + empleado.getNombre() + 
                    "  " + empleado.getCorreo() + "\t" + empleado.getTelefono() + "\n";
            }
        }
        return lista;
    }
    
    public boolean verificarAdmin(String id, String cargo, String nombre, String correo, String telefono) {
        ArrayList<Empleado> listaEmpleados1 = leerArchivo();
         boolean adminEncontrado= false;
        if (listaEmpleados1 == null) {
            System.out.println("No se pudieron recuperar los usuarios registrados.");
            return false;
        }

        // Recorremos la lista para buscar el admin
            if (id.equals("1") && cargo.equals("Admin") && nombre.equals("SimonBeta") && correo.equals("s@gmail.com") && telefono.equals("314862")) {
                return adminEncontrado = true;  // Credenciales correctas
            }
        
        return adminEncontrado = false;  // Si no encuentra coincidencias
    }
    
   public boolean verificarAdmin1(String id, String nombre) {
        ArrayList<Empleado> listaEmpleados1 = leerArchivo();
         boolean adminEncontrado= false;
        if (listaEmpleados1 == null) {
            System.out.println("No se pudieron recuperar los usuarios registrados.");
            return false;
        }

        // Recorremos la lista para buscar el admin
            if (id.equals("1") && nombre.equals("SimonBeta")) {
                return adminEncontrado = true;  // Credenciales correctas
            }
        
        return adminEncontrado = false;  // Si no encuentra coincidencias
    }
    
    public boolean verificarEmpleado(String id, String cargo, String nombre, String correo, String telefono) {
        ArrayList<Empleado> listaEmpleados1 = leerArchivo();
         boolean usuarioEncontrado= false;
        if (listaEmpleados1 == null) {
            System.out.println("No se pudieron recuperar los usuarios registrados.");
            return false;
        }

        // Recorremos la lista para buscar si el empleado esta registrado
        for (Empleado empleado : listaEmpleados1) {
            if (empleado.getId().equals(id) && empleado.getCargo().equals(cargo) && empleado.getNombre().equals(nombre) && empleado.getCorreo().equals(correo) && empleado.getTelefono().equals(telefono)) {
                return usuarioEncontrado = true;  // Credenciales correctas
            }
        }
        return usuarioEncontrado = false;  // Si no encuentra coincidencias
    }
    
    public boolean verificarEmpleado1(String id, String nombre) {
        ArrayList<Empleado> listaEmpleados1 = leerArchivo();
         boolean usuarioEncontrado= false;
        if (listaEmpleados1 == null) {
            System.out.println("No se pudieron recuperar los usuarios registrados.");
            return false;
        }

        // Recorremos la lista para buscar si el empleado esta registrado
        for (Empleado empleado : listaEmpleados1) {
            if (empleado.getId().equals(id) && empleado.getNombre().equals(nombre)) {
                return usuarioEncontrado = true;  // Credenciales correctas
            }
        }
        return usuarioEncontrado = false;  // Si no encuentra coincidencias
    }
    
    public Empleado verificarEmpleado2(String id, String nombre) {
        ArrayList<Empleado> listaEmpleados1 = leerArchivo();
        
        if (listaEmpleados1 == null) {
            System.out.println("No se pudieron recuperar los usuarios registrados.");
            return null;
        }

        // Recorremos la lista para buscar si el empleado esta registrado
        for (Empleado empleado : listaEmpleados1) {
            if (empleado.getId().equals(id) || empleado.getNombre().equals(nombre)) {
                return empleado;  // Credenciales correctas
            }
        }
        return null;  // Si no encuentra coincidencias
    }
    
    public void guardarArchivo(){
        try (PrintWriter pw = new PrintWriter(new FileWriter("Empleados.csv", true))) {
            for (Empleado empleado : empleados) {
                if(verificarEmpleado(empleado.getId(),empleado.getCargo(),empleado.getNombre(),empleado.getCorreo(),empleado.getTelefono())){
                    break;
                }
                else{
                pw.println(empleado.getId()+","+empleado.getCargo()+","+empleado.getNombre()+","+empleado.getCorreo()+","+empleado.getTelefono());
                }
            }
        } catch (IOException e) { 
            System.out.println(e.getMessage());
        }
    
    }
    
    public ArrayList<Empleado> leerArchivo() {
        
        try (BufferedReader br = new BufferedReader(new FileReader("Empleados.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String id = datos[0];
                String cargo = datos[1];
                String nombre = datos[2];
                String correo = datos[3];
                String telefono = datos[4];
                empleadosRecuperados.add(new Empleado(id,cargo,nombre,correo,telefono));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return empleadosRecuperados;
    }
    
    public void eliminarEmpleado(String indice, String cargo){
        for(Empleado empleado : empleados){
            if(empleado.getId().equals(indice) && empleado.getCargo().equals(cargo)){
                empleados.remove(empleado);}
        }
        actualizarCsv(indice,cargo);
    }
    
    public void actualizarCsv(String indice, String cargo){
        ArrayList<String[]> filas =new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader("Empleados.csv")) ) {
            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                if(!datos[0].equals(indice) || !datos[1].equals(cargo)){
                    filas.add(datos);
                }
            }
        } catch (IOException e) {
            System.out.println( e.getMessage() );
        }
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Empleados.csv"))){
            for(String[] fila : filas){
                bw.write(String.join(",", fila));
                bw.newLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    //**************************
    //Manejo de los propietarios.
    //**************************
    
    
    public void agregarPropietario(Propietario propietario){
        if(verificarPropietario(propietario.getId(),propietario.getSalario(),propietario.getProfesion(),propietario.getNombre(),propietario.getCorreo(),propietario.getTelefono())==false){
            propietarios.add(propietario); 
            guardarArchivoPropietario();
            JOptionPane.showMessageDialog(null, "El propietario ha sido agregado");
        }else{
            JOptionPane.showMessageDialog(null, "El propietario no ha podido ser agregado");
        }
    }
    
    public String listarPropietarios(){
        String lista ="";
        if(!propietariosRecuperados.isEmpty()){
            for(Propietario propietario : propietariosRecuperados) {
                lista = lista + propietario.getId()+ "  " + propietario.getSalario() + "  " + propietario.getProfesion() + "\t" + propietario.getNombre() + 
                    "  " + propietario.getCorreo() + "  " + propietario.getTelefono() + "\n";
            }
        }
        return lista;
    }
    
    public String listarPropietarios1(){
        String lista ="";
        if(!propietariosRecuperados.isEmpty()){
            for(Propietario propietario : propietariosRecuperados) {
                lista = lista + propietario.getProfesion() + "\t" + propietario.getNombre() + "\n";
            }
        }
        return lista;
    }
    
    
    
    public boolean verificarPropietario(String id, String salario, String profesion, String nombre, String correo, String telefono) {
        ArrayList<Propietario> listaPropietarios1 = leerArchivoPropietario();
         boolean propietarioEncontrado= false;
        if (listaPropietarios1 == null) {
            System.out.println("No se pudieron recuperar los usuarios registrados.");
            return false;
        }

        
        for (Propietario propietario : listaPropietarios1) {
            if (propietario.getId().equals(id) && propietario.getSalario().equals(salario) && propietario.getProfesion().equals(profesion) && propietario.getNombre().equals(nombre) && propietario.getCorreo().equals(correo) && propietario.getTelefono().equals(telefono)) {
                return propietarioEncontrado = true;  // Credenciales correctas
            }
        }
        return propietarioEncontrado = false;  // Si no encuentra coincidencias
    }
    
    public boolean verificarPropietario1(String id, String nombre) {
        ArrayList<Propietario> listaPropietarios1 = leerArchivoPropietario();
         boolean propietarioEncontrado= false;
        if (listaPropietarios1 == null) {
            System.out.println("No se pudieron recuperar los usuarios registrados.");
            return false;
        }

        
        for (Propietario propietario : listaPropietarios1) {
            if (propietario.getId().equals(id) && propietario.getNombre().equals(nombre)) {
                return propietarioEncontrado = true;  // Credenciales correctas
            }
        }
        return propietarioEncontrado = false;  // Si no encuentra coincidencias
    }
    
    public Propietario verificarPropietario2(String id, String salario) {
        ArrayList<Propietario> listaPropietarios1 = leerArchivoPropietario();
        
        if (listaPropietarios1 == null) {
            System.out.println("No se pudieron recuperar los usuarios registrados.");
            return null;
        }

        // Recorremos la lista para buscar si el empleado esta registrado
        for (Propietario propietario : listaPropietarios1) {
            if (propietario.getId().equals(id) || propietario.getSalario().equals(salario)) {
                return propietario;  // Credenciales correctas
            }
        }
        return null;  // Si no encuentra coincidencias
    }
    
    
    public void guardarArchivoPropietario(){
        try (PrintWriter pw = new PrintWriter(new FileWriter("Propietarios.csv", true))) {
            for (Propietario propietario : propietarios) {
                if(verificarPropietario(propietario.getId(),propietario.getSalario(),propietario.getProfesion(),propietario.getNombre(),propietario.getCorreo(),propietario.getTelefono())){
                    break;
                }
                else{
                pw.println(propietario.getId()+","+propietario.getSalario()+","+propietario.getProfesion() +","+propietario.getNombre()+","+propietario.getCorreo()+","+propietario.getTelefono());
                }
            }
        } catch (IOException e) { 
            System.out.println(e.getMessage());
        }
    
    }
    
    public ArrayList<Propietario> leerArchivoPropietario() {
        
        try (BufferedReader br = new BufferedReader(new FileReader("Propietarios.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String id = datos[0];
                String salario = datos[1];
                String profesion = datos[2];
                String nombre = datos[3];
                String correo = datos[4];
                String telefono = datos[5];
                propietariosRecuperados.add(new Propietario(id,salario,profesion,nombre,correo,telefono));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return propietariosRecuperados;
    }
    
    public void limpiarListaPropietarios(){
        propietariosRecuperados.clear();
    }
    
    public void eliminarPropietario(String indice, String salario){
        for(Propietario propietario : propietarios){
            if(propietario.getId().equals(indice) && propietario.getSalario().equals(salario)){
                propietarios.remove(propietario);}
        }
        actualizarCsvPropietarios(indice,salario);
    }
    
    public void actualizarCsvPropietarios(String indice, String salario){
        ArrayList<String[]> filas =new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader("Propietarios.csv")) ) {
            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                if(!datos[0].equals(indice) || datos[1].equals(salario)){
                    filas.add(datos);
                }
            }
        } catch (IOException e) {
            System.out.println( e.getMessage() );
        }
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Propietarios.csv"))){
            for(String[] fila : filas){
                bw.write(String.join(",", fila));
                bw.newLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    //******************
    //Casas************
    //******************
    
    
}
