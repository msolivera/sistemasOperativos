/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Meki
 */
public class Carrera {
     public static void main(String[] args) {
        // TODO code application logic here
        //aplicando sleep
        Runnable r1 = new Liebre(5);
        Thread t1 = new Thread(r1);
        Runnable r2 = new Tortuga(5);
        Thread t2 = new Thread (r2);
        t1.start();
        t2.start();
        
    }
    
    
}
