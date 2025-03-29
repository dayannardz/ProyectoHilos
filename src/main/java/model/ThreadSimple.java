/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pamel
 */
public class ThreadSimple extends Thread{

    public ThreadSimple(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        System.out.println("Se inicia el metodo run del hilo: " + getName());
        for (int i = 0; i < 100; i++) {
            try{
                Thread.sleep((long) (Math.random()*10));
            }catch (InterruptedException ex){
                Logger.getLogger(ThreadSimple.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("hilo"+ getName());
        }
        System.out.println("Hilo finalizado" + getName());
    }
    
}
