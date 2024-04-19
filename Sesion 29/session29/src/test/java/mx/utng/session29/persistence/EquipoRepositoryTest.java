package mx.utng.session29.persistence;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import mx.utng.session29.model.Equipo;

@SpringBootTest //significa que es un archivo de pruebas de spring
@ComponentScan(basePackages = "mx.utng.session29") //donde se van a escanear los elementos para poder escanear, aqui le estamos diciendo que escanee en este mismo paquete (en general para el proyecto)
@ExtendWith(SpringExtension.class)//las extensiones que va a utilizar
@TestInstance(TestInstance.Lifecycle.PER_CLASS)//el ciclo de vida que tendria para estar probando
public class EquipoRepositoryTest {

    @Autowired //esto sirve para que autoinicie (inyeccion de dependencias)
    private EquipoRepository repository;

    @BeforeAll //este comando es para que antes que nada borre lo que tiene la base de datos
    void cleanDatabase (){ //este metodo borrar los registros que haya
        repository.deleteAll();
    }

    //prueba que sirve para validar que se pueda guardar, se puede ejecutar con el triangulo verde que esta a un costado izquierdo
    @Test
    void canSave(){
        Equipo equipo = new Equipo();

        equipo.setNombre("America"); //para ingresar el nombre del equipo

        equipo = repository.save(equipo); //para guardar el nombre del equipo en la entidad

        assertNotNull(equipo.getId()); //declara que no sea nulo
        assertNotEquals(0, equipo.getId()); //declara que no sea cero, por que debe de ser un incremento, comenzando en 1
    }

    @Test
    @DisplayName("Buscar por Nombre")
    void canFindByName(){
        String name = "Chivas";

        Equipo equipo = new Equipo();
        equipo.setNombre(name);
        
        repository.save(equipo);

        Iterable<Equipo> listaEquipos = repository.findAllByNombre(name);

        assertTrue(listaEquipos.iterator().hasNext()); //Comprueba que en la lista haya uno o mas elementos
    }
}
