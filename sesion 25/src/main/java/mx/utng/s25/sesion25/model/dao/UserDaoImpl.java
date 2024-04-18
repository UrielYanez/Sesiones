package mx.utng.s25.sesion25.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mx.utng.s25.sesion25.model.entity.User;

@Repository
public class UserDaoImpl implements IUserDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void delete(long id) {
        User user = getById(id);
        em.remove(user);
    }

    @Override
    public User getById(long id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> list() {
        return em.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void save(User user) {
        if (user.getId() != null && user.getId()>0) {
           em.merge(user);
        }else{
            em.persist(user);
        }
    }
    
}
