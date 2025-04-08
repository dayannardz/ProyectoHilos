/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Executor;

import java.util.concurrent.Executor;

/**
 *
 * @author pamel
 */
public class EjemploExecutor {
    public static void main(String[] args) {
        Executor ex = new Executor(){
            @Override
            public void execute(Runnable command) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        }
    }
}
