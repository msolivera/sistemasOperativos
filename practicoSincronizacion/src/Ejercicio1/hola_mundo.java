/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Meki
 */
public class hola_mundo {
     public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicio hilos que hablan");
        Runnable r1 = new hilo_que_habla("Hilo 1");
        Thread t1 = new Thread(r1);
        t1.start();
        Runnable r2 = new hilo_que_habla("Hilo 2");
        Thread t2 = new Thread(r2);       
        t2.start();


    }
}
