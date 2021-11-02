/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Enumeración con las posibles ordenes o excepciones ya definidas
 * @author Alex Hurtado
 */
public enum Order {
    SIGN_IN, SIGN_UP, EXCEPTION_CONNECTION, EXCEPTION_LOGIN_EXIST,
    EXCEPTION_LOGIN_NOT_EXIST, EXCEPTION_PASSWORD_NOT_FOUND,
    CONNECTION_NOT_AVAIABLE, DATABASE_NOT_AVAIABLE_EXCEPTION, OK
}
