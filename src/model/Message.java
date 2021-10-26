/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 * esta clase  sirve para enviar informacion entre el cliente-servidor.
 * @author ibai , jon , alex , markel
 */
public class Message implements Serializable {

    /**
     * @param User = Un objeto Usuario
     */
    private User user;
    /**
     * @param Order = Un objeto orden
     */
    private Order order;

    /**
     *  Constructor definido de la clase message con 2 paremetros
     * @param user
     * @param order
     */
    public Message(User user, Order order) {
        this.user = user;
        this.order = order;
    }
    /**
     * Constructor sin definir de la clase message.
     */
    public Message() {};
   /**
    * @return devuelve el objeto usuario
    */
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

   /**
    * @return devuelve el objeto Order
    */
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    /**
     * @param enum Order = posibles ordenes o excepciones ya definidas
     */
    private enum Order {
        SIGN_IN, SIGN_UP, EXCEPTION_CONNECTION, EXCEPTION_LOGIN_EXIST,
        EXCEPTION_LOGIN_NOT_EXIST, EXCEPTION_PASSWORD_NOT_FOUND,
        CONNECTION_NOT_AVAIABLE,DATABASE_NOT_AVAIABLE_EXCEPTION,OK
    };
}
