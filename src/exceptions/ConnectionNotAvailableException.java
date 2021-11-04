/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;
/**
 *Excepcion que se señala que no hay conexiones disponibles
 * @author Ibai,jon,markel,alex
 */
public class ConnectionNotAvailableException extends Exception {

    /**
     * Creates a new instance of <code>ConnectionNotAvaiableException</code>
     * without detail message.
     */
    public ConnectionNotAvailableException() {
    }

    public ConnectionNotAvailableException(String msg) {
        super("Error, no hay conexiones disponibles");
    }
}
