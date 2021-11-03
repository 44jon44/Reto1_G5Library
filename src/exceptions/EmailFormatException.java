/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *Excepcion que se señala que el formato del email no es correcto
 * @author Ibai,jon,markel,alex
 */
public class EmailFormatException extends Exception {


    public EmailFormatException() {
        super("El formato del email no es correcto");
    }
}
