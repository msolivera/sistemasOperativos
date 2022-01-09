/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_hilos;

import  java.lang.Thread;
import  java.lang.Runnable;

/**
 *
 * @author danie
 */
public class MiClase implements Runnable {
    @Override
    public void run(){
        System.out.println("Hola Hilo 1" + "\n");
    }
    
}
