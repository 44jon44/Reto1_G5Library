/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *Excepcion que se señala que el formato del email no es correcto
 * @author Ibai,jon,markel,alex
 */
public class EmailFormatException extends Exception {

    /**
     * Creates a new instance of <code>EmailFormatException</code> without
     * detail message.
     */
    public EmailFormatException() {
    }

    /**
     * Constructs an instance of <code>EmailFormatException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmailFormatException(String msg) {
        super("El formato del email no es correcto");
    }
}
