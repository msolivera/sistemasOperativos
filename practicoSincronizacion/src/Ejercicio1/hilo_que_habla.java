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
public class hilo_que_habla implements Runnable {
    
    private String nombreHilo;
    
    public hilo_que_habla(String nombreHilo){
        this.nombreHilo = nombreHilo;
    }
    
    public String getNombre(){
        return this.nombreHilo;
    }
    public void saludar(){
        System.out.println("hola, mi nombre es:"+getNombre());
    }
    
        public void contestar(){
        System.out.println("hola, "+getNombre());
    }
    @Override
    public void run() {
           saludar();
           contestar();
        
    }
    
}
