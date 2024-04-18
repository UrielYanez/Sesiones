package mx.utng.s26.sesion26.model.service;

import java.util.List;
import mx.utng.s26.sesion26.model.entity.TicketSoporte;

public interface ITicketSoporteService {
    List<TicketSoporte> list();
    void save(TicketSoporte ticketSoporte);
    TicketSoporte getById(Long id);
    void delete(Long id);
}
