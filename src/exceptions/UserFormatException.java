/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *Excepcion que se señala que el formato del nombre del del usuario no es correcto
 * @author Ibai,jon,markel,alex
 */
public class UserFormatException extends Exception {

    public UserFormatException(String msg) {
        super("El formato del nombre del usuario no es correcto");
    }
}
