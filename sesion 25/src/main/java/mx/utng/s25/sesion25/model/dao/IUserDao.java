package mx.utng.s25.sesion25.model.dao;
import java.util.List;
import mx.utng.s25.sesion25.model.entity.User;


public interface IUserDao {
    //Listar usuarios
   List<User> list();
   //Guardar un usuario
   void save(User user);
   User getById(long id);
   void delete(long id);
}
