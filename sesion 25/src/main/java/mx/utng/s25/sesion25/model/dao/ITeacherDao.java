package mx.utng.s25.sesion25.model.dao;
import java.util.List;

import mx.utng.s25.sesion25.model.entity.Teacher;



public interface ITeacherDao {
    List<Teacher> list();
    void save(Teacher teacher);
    Teacher getById(long id);
    void delete(long id);
}
