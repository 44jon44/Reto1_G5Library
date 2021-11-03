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
public class ConnectionNotAvaiableException extends Exception {


    public ConnectionNotAvaiableException() {
        super("Error, no hay conexiones disponibles");
    }
}
