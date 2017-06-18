/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sunzic.net;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;

/**
 *
 * @author martin
 */
public class DatagramServer extends DatagramSocket{

    public DatagramServer(SocketAddress bindaddr) throws SocketException {
        super(bindaddr);
    }

    public DatagramServer(int port) throws SocketException {
        super(port);
    }

    public DatagramServer(int port, InetAddress laddr) throws SocketException {
        super(port, laddr);
    }

    @Override
    public void connect(SocketAddress addr) throws SocketException {
        throw new SocketException("This socket isn't a Client Socket");
    }

    @Override
    public void connect(InetAddress address, int port) {
        throw new SocketException("This socket isn't a Client Socket");
    }
    
    
}
