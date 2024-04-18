package mx.utng.s25.sesion25.model.service;

import java.util.List;

import mx.utng.s25.sesion25.model.entity.User;

public interface IUserService {
    List<User> list();
    void save(User user);
    User getById(Long id);
   void delete(long id);
    
}
