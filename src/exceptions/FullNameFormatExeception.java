/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *Excepcion que se señala que el formato del nombre completo no es correcto
 * @author Ibai,jon,markel,alex
 */
public class FullNameFormatExeception extends Exception {

    /**
     * Creates a new instance of <code>FullNameFormatExeception</code> without
     * detail message.
     */
    public FullNameFormatExeception() {
    }

    /**
     * Constructs an instance of <code>FullNameFormatExeception</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FullNameFormatExeception(String msg) {
        super("El formato del nombre completo no es correcto");
    }
}
