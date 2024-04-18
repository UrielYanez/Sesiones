package mx.utng.s11;

public class Triangulo extends FiguraPlana {
    private final String ESTILO;
    
    public Triangulo(double base, double altura, String estilo){
        super(base, altura);
        this.ESTILO = estilo;
    }

    public String getESTILO(){
        return ESTILO;
    }

    public double area(){
        return getBASE() * getALTURA() / 2;
    }

    public void mostrarEstilo(){
        System.out.println("Es te triangulo es de estilo: "+ESTILO);
    }
}
