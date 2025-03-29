/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itses.drs.hilos;

/**
 *
 * @author pamel
 */
public class HiloR {

    public static void main(String[] args) throws InterruptedException{
        Thread main = Thread.currentThread();
        
        Runnable hilo =() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println( i + " " + Thread.currentThread().getName());
                try{
                    Thread.sleep((long) (Math.random()*1000));
            }catch(Exception e){
                    System.out.println(e);
            }
                System.out.println("Estado: " + Thread.currentThread().getName());
           }
            
        };
        
  /*      Runnable hilo = new Runnable(){
            @Override
            public void run() {
                System.out.println("se inicia el metodo de: " 
                + Thread.currentThread().getName());
                for (int i = 0; i < 10; i++) {
                    try{
                        Thread.sleep(long) (Math.random()*1000));
                    }catch (InterruptedException ex){
                        Logger.getLogger(ThreadSimple.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("hilo" + Thread.currentThread().getName());
                }
                System.out.println("hilo finalizado" + Thread.currentThread().getName());
                System.out.println("Estado: " + Thread.currentThread().getState());
            }
            
        };*/
        
        Thread.currentThread().getState();
        
        System.out.println(Thread.currentThread().getName());
        
        //metodo main
        Thread hilo1 = new Thread(hilo, "carrera de caballos 1");
        
        Thread hilo2 = new Thread(hilo, "carrera de caballos 2");
        
        Thread hilo3 = new Thread(hilo, "carrera de caballos 3");
        
        Thread hilo4 = new Thread(hilo, "carrera de caballos 4");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();
        
        System.out.println(hilo1.getState());
        System.out.println(hilo2.getState());
        System.out.println(hilo3.getState());
        System.out.println(hilo4.getState());
        
        Thread.sleep(10000);
    }
}
