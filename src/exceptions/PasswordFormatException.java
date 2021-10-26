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

    /**
     * Creates a new instance of <code>PasswordFormatException</code> without
     * detail message.
     */
    public PasswordFormatException() {
    }

    /**
     * Constructs an instance of <code>PasswordFormatException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PasswordFormatException(String msg) {
        super("El formato de la contraseña no es correcto");
    }
}
