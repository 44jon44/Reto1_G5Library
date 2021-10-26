/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;
/**
 *Excepcion que se señala que el usuario no esta registrado
* @author Ibai,jon,markel,alex
 */
public class LoginNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>LoginNotFoundException</code> without
     * detail message.
     */
    public LoginNotFoundException() {
    }

    /**
     * Constructs an instance of <code>LoginNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LoginNotFoundException(String msg) {
        super("El usuario introducido no existe");
    }
}
