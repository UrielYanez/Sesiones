package mx.utng.s30;

import java.util.concurrent.TimeUnit;

public class Reto implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hilo 1: "+i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    } 
}
