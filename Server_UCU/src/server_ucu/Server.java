/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_ucu;

import java.net.*;
import java.io.*;

/**
 *
 * @author danie
 */
public class Server {
    private ServerSocket serverSocket;
    
    public void start(int port) {
        try{
            InetAddress addr = InetAddress.getByName("192.168.56.1");
            serverSocket = new ServerSocket(port, 50, addr);            
            //Local
            //serverSocket = new ServerSocket(port);            
            while (true)
            new ClientHandler(serverSocket.accept()).start();
        }catch (Exception e ) {
            System.err.println(e);
        }    
    }
    public void stop() {
        try{         
            serverSocket.close();
        }catch (Exception e ) {
            System.err.println(e);
        }
    }
    
}
