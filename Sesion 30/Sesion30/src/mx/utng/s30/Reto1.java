package mx.utng.s30;

import java.util.concurrent.TimeUnit;

public class Reto1 implements Runnable{

    @Override
    public void run() {
        while (true) { //while true es un ciclo infinito
            System.out.println("Hilo 2: Sigo en ejecucion");

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
