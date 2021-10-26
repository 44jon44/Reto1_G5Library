/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;
/**
 *Excepcion que se señala que la contraseña no existe
 * @author Ibai,jon,markel,alex
 */
public class PasswordNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>PasswordNotFoundException</code> without
     * detail message.
     */
    public PasswordNotFoundException() {
    }

    /**
     * Constructs an instance of <code>PasswordNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PasswordNotFoundException(String msg) {
        super("La contraseña no es correcta");
    }
}
