/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sunzic.net.interfaces;

/**
 *
 * @author martin
 */
public interface Transferible {
    public void send(byte[] bytes);
    public default void send(String str){
        send(str.getBytes());
    }
}
