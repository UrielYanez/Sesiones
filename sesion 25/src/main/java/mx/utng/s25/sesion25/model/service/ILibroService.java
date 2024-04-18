package mx.utng.s25.sesion25.model.service;

import java.util.List;

import mx.utng.s25.sesion25.model.entity.Libro;

public interface ILibroService {
    List<Libro> list();
    void save(Libro libro);
    Libro getById(Long id);
    void delete(long id);
}
