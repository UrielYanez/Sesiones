import mx.utng.s07.Lector;
import mx.utng.s07.ListaTareas;
import mx.utng.s07.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Crear objetos necesarios
        Menu menu = new Menu();
        Lector lector = new Lector();
        ListaTareas lista = new ListaTareas();

        byte opcionSeleccionada = 0;

        do {
            menu.muestraOpciones();
            opcionSeleccionada = lector.leerOpcion();
            System.out.printf("%n%nLa opcion seleccionada fué: %d%n", opcionSeleccionada);

            switch (opcionSeleccionada) {
                case 1:
                    lista.crearNuevaLista();
                    break;
                case 2:
                    lista.verListaTareas();
                    break;
                case 3:
                    lista.verTareasLista();
                    break;
                case 4:
                    lista.actualizarListaTareas();
                    break;
                case 5:
                    lista.eliminarListaTareas();
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicacion");
                    break;

                default:
                    System.out.println("Opcion desconocida");
                    break;
            }
        } while (opcionSeleccionada != 6);
    }
}
