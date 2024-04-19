package mx.utng.session29.persistence;

import org.springframework.data.repository.CrudRepository;
import mx.utng.session29.model.Equipo;

public interface EquipoRepository extends CrudRepository<Equipo, Long>{ //tomara todas las funciones que tiene crud (crear leer, actualizar y borrar, son las funciones de crud) [despues de CrudRepository, estamos diciendo en donde va a trabajar en este caso sobre equipo, de tipo long]
    
    Iterable<Equipo> findAllByNombre(String nombre);//metodo que se puede ir recorriendo el mismo [quiere decir que quiero un conjunto de equipos, a partir del nombre]
}
