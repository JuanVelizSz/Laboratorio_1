/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_1;

/**
 *
 * @author juan_
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    
    //Get y Set del Nombre
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }    
        public String getNombre() {
            return nombre;
        }
        
    //Get y Set del Apellido
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }   
        public String getApellido() {
            return apellido;
        }
        
    //Get y Set del Dni
        public String getDni() {
            return dni;
        }
        public void setDni(String dni) {
            this.dni = dni;
        }
        
        //Get y Set de la Edad
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
}
