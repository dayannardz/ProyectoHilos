/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
            System.out.println("Hilo " + getName());
        }
        System.out.println("Hilo finalizado");
    }
    
}
