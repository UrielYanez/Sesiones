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
import mx.utng.s26.sesion26.model.entity.Equipo;
import mx.utng.s26.sesion26.model.service.IEquipoService;

@Controller
@SessionAttributes("equipo")
public class EquipoController {
    
     @Autowired
    private IEquipoService service;

    @GetMapping({"/equipo", "/equipo/", "equipo/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Estudiantes");
        model.addAttribute("equipos", service.list());
        return "equipo-list";
    }

    @GetMapping("/equipo/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de Estudiantes");
        model.addAttribute("equipo", new Equipo());
        return "equipo-form";
    }

    @PostMapping("/equipo/form")
    public String save(@Valid Equipo equipo, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de estudiantes");
            return "equipo-form";
        }
        service.save(equipo);
        return "redirect:/equipo/list";
    }

    @GetMapping("/equipo/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Equipo equipo = null;
        if(id>0){
            equipo = service.getById(id);
        }else{
            return "redirect:/equipo/list";
        }
        model.addAttribute("title", "Editar Estudiante");
        model.addAttribute("equipo", equipo);
        return "equipo-form";
    }

    @GetMapping("equipo/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id > 0){
            service.delete(id);
        }
        return "redirect:/equipo/list";
    }



}