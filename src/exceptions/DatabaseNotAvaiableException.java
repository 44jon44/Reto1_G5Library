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
public class DatabaseNotAvaiableException extends Exception {

    /**
     * Creates a new instance of <code>DatabaseNotAvaiableException</code>
     * without detail message.
     */
    public DatabaseNotAvaiableException() {
    }

    /**
     * Constructs an instance of <code>DatabaseNotAvaiableException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public DatabaseNotAvaiableException(String msg) {
        super("La base de datos no se encuentra disponible");
    }
}
