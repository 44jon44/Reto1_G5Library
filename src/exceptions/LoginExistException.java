/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *Excepcion que se señala que el usuario ya existe en la base de datos
* @author Ibai,jon,markel,alex
 */
public class LoginExistException extends Exception {

    /**
     * Creates a new instance of <code>LoginExitException</code> without detail
     * message.
     */
    public LoginExistException() {
    }

    /**
     * Constructs an instance of <code>LoginExitException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LoginExistException(String msg) {
        super("El usuario ya existe");
    }
}
