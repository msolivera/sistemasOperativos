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
public class Tortuga implements Runnable {

    private int vueltas;
    private int vueltas_dadas;
    
    public Tortuga(int vueltas){
        this.vueltas = vueltas;
        this.vueltas_dadas =0 ;
    }
    
     public void darLaVuelta(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        vueltas_dadas ++;
        
        System.out.println("La tortuga completo la vuelta "+ vueltas_dadas);
        
    }

    @Override
    public void run() {
       for (int i = 0; i < this.vueltas; i++) {
            darLaVuelta();
        }
    }

}
