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
public interface Receivable {
    public boolean hasData();
    public byte[] getReceivData();
    public default String getReceivMsg(){
        return new String(getReceivData());
    }
    
}
