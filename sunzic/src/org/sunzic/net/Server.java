/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sunzic.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import org.sunzic.net.threads.TClient;
import org.martin.electroList.structure.ElectroList;
import static org.sunzic.system.SysInfo.DEFAULT_BUFF_SIZE;
import static org.sunzic.system.SysInfo.DEFAULT_PORT;

/**
 *
 * @author martin
 */
public class Server extends Thread{
    private DatagramSocket serverSock;
    private final DatagramPacket receivPacket;
    private ElectroList<TClient> listConnectedClients;
    
    private static Server thisServer;
    
    public static void newInstance() throws SocketException{
        thisServer = new Server();
    }
    
    public static Server getInstance(){
        return thisServer;
    }
    
    private Server() throws SocketException{
        this(DEFAULT_PORT);
    }

    private Server(short port) throws SocketException {
        serverSock = new DatagramSocket(port);
        receivPacket = new DatagramPacket(new byte[DEFAULT_BUFF_SIZE], DEFAULT_BUFF_SIZE);
        listConnectedClients = new ElectroList<>();
    }
    
    
    
    @Override
    public void run(){
        byte[] receivBytes;
        while (true) {
            
        }
    }
    
}
