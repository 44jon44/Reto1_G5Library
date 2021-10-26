/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *Excepcion que se señala que las contraseñas no coinciden
 * @author Ibai,jon,markel,alex
 */
public class RepeatPasswordException extends Exception {

    /**
     * Creates a new instance of <code>RepeatPasswordException</code> without
     * detail message.
     */
    public RepeatPasswordException() {
    }

    /**
     * Constructs an instance of <code>RepeatPasswordException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public RepeatPasswordException(String msg) {
        super("Las contraseñas no coinciden");
    }
}
