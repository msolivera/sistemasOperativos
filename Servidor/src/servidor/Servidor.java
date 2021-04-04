/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.net.*;
import java.io.*;

/**
 *
 * @author danie
 */
public class Servidor {

    public static void main (String[] args){
 
        ServerSocket server;
        Socket connection;

        DataOutputStream output;
        BufferedInputStream bis;
        BufferedOutputStream bos;

        byte[] receivedData;
        int in;
        String file;

        try{
            //********************************************************
            //Cambio de dirección para que podamos trabajar desde VB
            InetAddress addr = InetAddress.getByName("192.168.56.1");
            server = new ServerSocket(80, 50, addr);
            //********************************************************
            //Servidor Socket en el puerto 5000
            //Ojo, esto funciona
            //server = new ServerSocket( 5000 );
            //********************************************************
            //Condicional para que acepte una única conección
            boolean acceptConnection = true;
            //********************************************************
            while ( acceptConnection ) {
                //Aceptar conexiones
                connection = server.accept();
                //Buffer de 1024 bytes
                receivedData = new byte[1024];
                bis = new BufferedInputStream(connection.getInputStream());
                DataInputStream dis=new DataInputStream(connection.getInputStream());
                //Recibimos el nombre del fichero
                file = dis.readUTF();
                file = file.substring(file.indexOf('\\')+1,file.length());
                //Para guardar fichero recibido
                bos = new BufferedOutputStream(new FileOutputStream(file));
                while ((in = bis.read(receivedData)) != -1){
                    bos.write(receivedData,0,in);
                }
                bos.close();
                dis.close();
                //********************************************************
                //Cambio el valor del condicional para salir del While
                acceptConnection = false;
                //********************************************************
            }
        }catch (Exception e ) {
            System.err.println(e);
        }
    }    
}
