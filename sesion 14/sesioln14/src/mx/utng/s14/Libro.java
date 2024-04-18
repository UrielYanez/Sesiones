package mx.utng.s14;

public class Libro {
    private final String TITULO;
    private int prioridad;

    public Libro (String titulo, int prioridad){
        this.TITULO = titulo;
        this.prioridad = prioridad;
    }

    public String getTITULO(){
        return TITULO;
    }

    @Override
    public int compareTO(Libro libro){
        return libro;
    }

}
