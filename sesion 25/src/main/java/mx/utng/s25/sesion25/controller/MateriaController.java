package mx.utng.s25.sesion25.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.utng.s25.sesion25.model.entity.Materia;
import mx.utng.s25.sesion25.model.service.IMateriaService;

@Controller
@SessionAttributes("materia")
public class MateriaController {
    @Autowired
    private IMateriaService materiaService;

    @GetMapping({"","/","/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Materias");
        model.addAttribute("materias", materiaService.list());
        return "list";
    }

    @GetMapping("/form")
    public String create (Model model){
        model.addAttribute("title", "Formulario de Materias");
        model.addAttribute("materia", new Materia());
        return "form";
    }

    @GetMapping("/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Materia materia = null;
        if(id>0){
            materia = materiaService.getById(id);
        }else{
            return "redirect:list";
        }
        model.addAttribute("title", "Editar Materia");
        model.addAttribute("materia", materia);
        return "form";
    }

    @PostMapping("/form")
    public String save(@Valid Materia materia, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de Materias");
            return "form";
        }
        materiaService.save(materia);
        return "redirect:list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if (id>0) {
            materiaService.delete(id);
        }
        return "redirect:/list";
    }
}
