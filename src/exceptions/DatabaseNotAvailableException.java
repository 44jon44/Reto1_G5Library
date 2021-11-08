/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *Excepcion que se señala que la base de datos no esta disponible
 * @author Ibai,jon,markel,alex
 */
public class DatabaseNotAvailableException extends Exception {

    /**
     * Crea una instancia de <code>DatabaseNotAvailableException</code> sin mensaje de
     * detalle.
     */
    public DatabaseNotAvailableException() {
        super("La base de datos no se encuentra disponible");
    }
}
