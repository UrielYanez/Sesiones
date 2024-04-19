package mx.utng.s30;

public class RetoTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Reto());
        Thread t2 = new Thread(new Reto1());

        t2.setDaemon(false); //si se pone en true el ciclo se termina cuando se termine el primer hilo
        //si se pone en false no se termina el ciclo nunca
        t1.start();
        t2.start();
    }
}
