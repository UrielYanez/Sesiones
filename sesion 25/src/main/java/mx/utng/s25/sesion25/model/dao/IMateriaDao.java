package mx.utng.s25.sesion25.model.dao;

import java.util.List;
import mx.utng.s25.sesion25.model.entity.Materia;

public interface IMateriaDao {
    List<Materia> list();
    void save(Materia materia);
    Materia getById(long id);
    void delete(long id);
}
