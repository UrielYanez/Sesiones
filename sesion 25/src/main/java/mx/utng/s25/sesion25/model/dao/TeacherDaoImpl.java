package mx.utng.s25.sesion25.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mx.utng.s25.sesion25.model.entity.Teacher;

@Repository
public class TeacherDaoImpl implements ITeacherDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void delete(long id) {
        Teacher teacher = getById(id);
        entityManager.remove(teacher);
    }

    @Override
    public Teacher getById(long id) {
        return entityManager.find(Teacher.class, id);
    }

    @Override
    public List<Teacher> list() {
        return entityManager.createQuery("from Teacher", Teacher.class).getResultList();
    }

    @Override
    public void save(Teacher teacher) {
        if (teacher.getId() != null && teacher.getId() > 0) {
            entityManager.merge(teacher);
        } else {
            entityManager.persist(teacher);
        }
    }

    
}