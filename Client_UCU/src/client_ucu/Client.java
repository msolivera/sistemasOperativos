/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_ucu;

import java.net.*;
import java.io.*;

/**
 *
 * @author danie
 */
public class Client {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(String ip, int port) {
        try{
            clientSocket = new Socket(ip, port);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        }catch ( IOException e ) {
            System.err.println(e);
        }
    }

    public String sendMessage(String msg) {        
        out.println(msg);
        try{
            String resp = in.readLine();
            return resp;
        }catch ( IOException e ) {
            System.err.println(e);
            return "Error en el envío de Mensaje";
        }
        
    }

    public void stopConnection() {
        try{
            in.close();
            out.close();
            clientSocket.close();
        }catch ( IOException e ) {
            System.err.println(e);
        }
    }
    
}
