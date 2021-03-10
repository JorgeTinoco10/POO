/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

/**
 *
 * @author TERNURA
 */
public class Doctor {
    
    
    private String nombre;
    private String apellido;
    private int edad;
    private boolean experiencia;
   
    public Doctor( String valorNombre, String valorApellido, int valorEdad, boolean valorExperiencia) {
        nombre = valorNombre;
        apellido = valorApellido;
        edad = valorEdad;
        experiencia = valorExperiencia;
    }
     
   public Doctor(){
       nombre = "";
       apellido = "";
       edad = 0;
       experiencia = true;
    }
   
    public void setNombre(String valorNombre ) {
        nombre = valorNombre;
    }
    public void setApellido(String valorApellido) {
        apellido = valorApellido ;
    }
    public void setEdad(int valorEdad){
        edad = valorEdad;
    }
    public void setExperiencia(boolean valorExperiencia){
        experiencia = valorExperiencia ;
    }
   
    public String getNombre(){
     return nombre;
    }
    public String getApellido(){
     return apellido;
    }
    public int getEdad(){
     return edad;
    }
    public boolean getExperiencia(){
     return experiencia;
    }
}
