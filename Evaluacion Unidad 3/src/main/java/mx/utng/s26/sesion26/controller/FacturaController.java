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
import mx.utng.s26.sesion26.model.entity.Factura;
import mx.utng.s26.sesion26.model.service.IFacturaService;

@Controller
@SessionAttributes("factura")
public class FacturaController {
    
     @Autowired
    private IFacturaService service;

    @GetMapping({"/factura", "/factura/", "factura/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Facturas");
        model.addAttribute("facturas", service.list());
        return "factura-list";
    }

    @GetMapping("/factura/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de Facturas");
        model.addAttribute("factura", new Factura());
        return "factura-form";
    }

    @PostMapping("/factura/form")
    public String save(@Valid Factura factura, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de Facturas");
            return "factura-form";
        }
        service.save(factura);
        return "redirect:/factura/list";
    }

    @GetMapping("/factura/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Factura factura = null;
        if(id>0){
            factura = service.getById(id);
        }else{
            return "redirect:/factura/list";
        }
        model.addAttribute("title", "Editar Factura");
        model.addAttribute("factura", factura);
        return "factura-form";
    }

    @GetMapping("factura/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id > 0){
            service.delete(id);
        }
        return "redirect:/factura/list";
    }



}