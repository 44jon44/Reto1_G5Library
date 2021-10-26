/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *Excepcion que se señala que el formato del nombre del del usuario no es correcto
 * @author Ibai,jon,markel,alex
 */
public class UserFormatException extends Exception {

    /**
     * Creates a new instance of <code>UserFormatException</code> without detail
     * message.
     */
    public UserFormatException() {
    }

    /**
     * Constructs an instance of <code>UserFormatException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UserFormatException(String msg) {
        super("El formato del nombre del usuario no es correcto");
    }
}
