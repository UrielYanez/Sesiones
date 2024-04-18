package mx.utng.s10;

public class MiembrosEstaticos {
    public static void main(String[] args) {
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();
        Contador contador4 = new Contador();

        System.out.println("Contador.contadorClase: "+contador1.getContadorClase());

        System.out.printf("Contador1.contadorInstancia: %d %n",contador1.getContadorInstancia());

        contador1.setContadorInstancia((short)10);
        contador2.setContadorInstancia((short)30);
        contador3.setContadorInstancia((short)550);
        contador4.setContadorInstancia((short)440);

        System.out.println("Contador 2 Instancia: "+contador2.getContadorInstancia());
        System.out.println("Contador 2 Clase: "+Contador.getContadorClase());
        System.out.println("Contador 3 Instancia: "+contador3.getContadorInstancia());
        System.out.println("Contador 3 Clase: "+Contador.getContadorClase());
        System.out.println("Contador 4 Instancia: "+contador4.getContadorInstancia());
        System.out.println("Contador 4 Clase: "+Contador.getContadorClase());
    }
}
