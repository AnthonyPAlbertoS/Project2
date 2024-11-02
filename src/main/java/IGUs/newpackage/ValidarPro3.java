/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IGUs.newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author UserA
 */
class ValidarPro3 {
     //Creando las variable de la clase
    private String apellido,nombre,cedula;
    
    //Metodo constructor
    ValidarPro3(String apellido, String nombre, String cedula) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.cedula = cedula;
              
    }
    //Metodo para Validar el Nombre
    public boolean validarNombre(){
        return nombre.matches("[a-zA-Z]+");
    }
    
    //Metodo para validar el apellido
    public boolean validarApellido() {
        //Validando que solo tenga letras el apellido 
        return apellido.matches("[a-zA-Z]+");
    } 
    
    
    //Metodo para validar la cedula
    public boolean ValidarCedula(){
        // Verificar que la cédula no esté vacía
        if (cedula == null || cedula.trim().isEmpty()) {
            return false;
        }
        // Validar que contenga solo dígitos
        if (!cedula.matches("\\d+")) {
            return false; // Contiene caracteres no numéricos
        }
        // Verificar que la longitud de la cédula sea 10
        if (cedula.length() != 7) {
            return false; // Longitud incorrecta
        }
    return true; // La cédula es válida
    }
    
    
}
