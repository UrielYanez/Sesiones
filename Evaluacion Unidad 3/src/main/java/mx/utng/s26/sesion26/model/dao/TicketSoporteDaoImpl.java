package mx.utng.s26.sesion26.model.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.s26.sesion26.model.entity.TicketSoporte;
/*
 * Clase repositorio o dao, utilizare la 
 * anotacion @Repository
 */

@Repository
public class TicketSoporteDaoImpl implements ITicketSoporteDao {
    //Entity Manager y contexto de persistencia
    //Guarda internamente todas las entidads y
    //utiliza como una cache datos de BD
    //@PersistenceContext
    @Autowired
    private EntityManager em;


    @SuppressWarnings("unchecked")
    @Override
    public List<TicketSoporte> list() {
        return em.createQuery("from TicketSoporte").getResultList();
    }

    @Override
    public void save(TicketSoporte ticketSoporte) {
        System.out.println("TicketSoporte id="+ticketSoporte.getId());
        if(ticketSoporte.getId() != null && ticketSoporte.getId() >0){
            //Actualizo estudiante
            em.merge(ticketSoporte);
        }else{
            //Creamos nuevo estudiante en la base
            em.persist(ticketSoporte);
        }
    }

    @Override
    public TicketSoporte getById(Long id) {
        return em.find(TicketSoporte.class, id);
    }

    @Override
    public void delete(Long id) {
        TicketSoporte ticketSoporte = getById(id);
        em.remove(ticketSoporte);
    }

    
}