/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *Excepcion que se señala que el formato de la contraseña no es correcto
 * @author Ibai,jon,markel,alex
 */
public class PasswordFormatException extends Exception {

    public PasswordFormatException() {
        super("El formato de la contraseña no es correcto");
    }
}
