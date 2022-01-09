/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_ucu;

/**
 *
 * @author danie
 */
public class Server_UCU {
     /**
     * @param args the command line arguments
     */
     public static void main (String[] args){
        Server server = new Server();
        server.start(80);
    }
    
}
