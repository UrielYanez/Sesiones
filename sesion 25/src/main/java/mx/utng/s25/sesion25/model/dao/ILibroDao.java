package mx.utng.s25.sesion25.model.dao;

import java.util.List;
import mx.utng.s25.sesion25.model.entity.Libro;

public interface ILibroDao {
    List<Libro> list();
    void save(Libro libro);
    Libro getById(long id);
    void delete(long id);
}
