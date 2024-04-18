package mx.utng.s25.sesion25.model.service;

import java.util.List;

import mx.utng.s25.sesion25.model.entity.Teacher;

public interface ITeacherService {
        List<Teacher> list();
    void save(Teacher teacher);
    Teacher getById(Long id);
   void delete(long id);
    
}
