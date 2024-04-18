import mx.utng.ej001.Autor;
import mx.utng.ej001.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        mx.utng.ej001.Autor autor = new Autor();
        autor.setName("Panchito");
        autor.setApellido("Torres");
        autor.setEdad(18);

        Libro libro = new Libro();
        libro.setTitulo("Reglas para seducir");
        libro.setAutor(autor);
        libro.setNumeroPaginas(0);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor().getName()
        +" "+libro.getAutor().getApellido());
    }
}
