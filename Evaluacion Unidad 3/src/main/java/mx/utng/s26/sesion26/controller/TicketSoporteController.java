package mx.utng.s26.sesion26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.utng.s26.sesion26.model.entity.TicketSoporte;
import mx.utng.s26.sesion26.model.service.ITicketSoporteService;

@Controller
@SessionAttributes("ticketSoporte")
public class TicketSoporteController {
    
     @Autowired
    private ITicketSoporteService service;

    @GetMapping({"/ticketSoporte", "/ticketSoporte/", "ticketSoporte/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de TicketSoportes");
        model.addAttribute("ticketSoportes", service.list());
        return "ticketSoporte-list";
    }

    @GetMapping("/ticketSoporte/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de TicketSoportes");
        model.addAttribute("ticketSoporte", new TicketSoporte());
        return "ticketSoporte-form";
    }

    @PostMapping("/ticketSoporte/form")
    public String save(@Valid TicketSoporte ticketSoporte, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de TicketSoportes");
            return "ticketSoporte-form";
        }
        service.save(ticketSoporte);
        return "redirect:/ticketSoporte/list";
    }

    @GetMapping("/ticketSoporte/form/{id}")
    public String update(@PathVariable Long id, Model model){
        TicketSoporte ticketSoporte = null;
        if(id>0){
            ticketSoporte = service.getById(id);
        }else{
            return "redirect:/ticketSoporte/list";
        }
        model.addAttribute("title", "Editar TicketSoporte");
        model.addAttribute("ticketSoporte", ticketSoporte);
        return "ticketSoporte-form";
    }

    @GetMapping("ticketSoporte/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id > 0){
            service.delete(id);
        }
        return "redirect:/ticketSoporte/list";
    }



}