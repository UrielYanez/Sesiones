package mx.utng.s26.sesion26.model.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.s26.sesion26.model.entity.Equipo;
/*
 * Clase repositorio o dao, utilizare la 
 * anotacion @Repository
 */

@Repository
public class EquipoDaoImpl implements IEquipoDao {
    //Entity Manager y contexto de persistencia
    //Guarda internamente todas las entidads y
    //utiliza como una cache datos de BD
    //@PersistenceContext
    @Autowired
    private EntityManager em;


    @SuppressWarnings("unchecked")
    @Override
    public List<Equipo> list() {
        return em.createQuery("from Equipo").getResultList();
    }

    @Override
    public void save(Equipo equipo) {
        System.out.println("Equipo id="+equipo.getId());
        if(equipo.getId() != null && equipo.getId() >0){
            //Actualizo estudiante
            em.merge(equipo);
        }else{
            //Creamos nuevo estudiante en la base
            em.persist(equipo);
        }
    }

    @Override
    public Equipo getById(Long id) {
        return em.find(Equipo.class, id);
    }

    @Override
    public void delete(Long id) {
        Equipo equipo = getById(id);
        em.remove(equipo);
    }

    
}