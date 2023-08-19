/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio_1;

/**
 *
 * @author juan_
 */
public class Laboratorio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona personita = new Persona("Juan",
                                         "Perez",
                                            "00001111",
                                                    17);
        
            System.out.println("Nombre: " +personita.getNombre()
                            + "\nApellido: " +personita.getApellido()
                            + "\nDNI: " +personita.getDni()
                            + "\nEdad: " +personita.getEdad());       
    }
    
}
