/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itses.drs.hilos;

import threads.ThreadSimple;

/**
 *
 * @author pamel
 */
public class Hilos {

    public static void main(String[] args) throws InterruptedException {
        
        Thread hilo = new ThreadSimple("juan");
        hilo.start();
        
        Thread hilo2 = new ThreadSimple("jose");
        hilo2.start();
        
        System.out.println(hilo.getState());
        
    }
}
