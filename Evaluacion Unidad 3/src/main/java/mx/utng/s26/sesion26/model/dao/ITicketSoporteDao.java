package mx.utng.s26.sesion26.model.dao;

import java.util.List;

import mx.utng.s26.sesion26.model.entity.TicketSoporte;

public interface ITicketSoporteDao {
    List<TicketSoporte> list();
    void save(TicketSoporte ticketSoporte);
    TicketSoporte getById(Long id);
    void delete(Long id);
    
} 
