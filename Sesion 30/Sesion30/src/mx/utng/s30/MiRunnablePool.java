package mx.utng.s30;

import java.util.concurrent.TimeUnit;

public class MiRunnablePool implements Runnable{
    private String nombre;

    public MiRunnablePool(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run(){
        while (true) { //while true es un ciclo infinito
            System.out.println(nombre+" Sigo en ejecucion");

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(nombre+" fue interrumpido");
                System.out.println(nombre+" Thread.currentThread().isInterrupted()="+Thread.currentThread().isInterrupted());
            }
        }
    }
}
