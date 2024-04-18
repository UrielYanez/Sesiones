package mx.utng.s25.sesion25.model.service;

import java.util.List;

import mx.utng.s25.sesion25.model.entity.Materia;

public interface IMateriaService {
    List<Materia> list();
    void save(Materia materia);
    Materia getById(Long id);
    void delete(long id);    
}
