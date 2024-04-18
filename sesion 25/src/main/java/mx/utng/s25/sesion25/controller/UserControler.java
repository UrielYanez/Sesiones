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
import mx.utng.s25.sesion25.model.entity.User;
import mx.utng.s25.sesion25.model.service.IUserService;

@Controller
@SessionAttributes("user")
public class UserControler {
    //inyectamos un a dependencias del servicio 
    @Autowired
    private IUserService userService;

    //Manda llamar este metodo en una petición GET
    //Que contenga como final de la querystring "","/", "/list"
    @GetMapping({"","/","/list"})
    public String list(Model model){
        model.addAttribute("Title", "Listado de Usuarios");
        model.addAttribute("users", userService.list());
        return "list";
    }


    @GetMapping("/form")
    public String create (Model model){
        model.addAttribute("title", "Fromulario de usuarios");
        model.addAttribute("user", new User());
        return "form";
    }

    @GetMapping("/user/form/{id}")
    public String update(@PathVariable Long id, Model model){
        return "update_form";
    }

    @PostMapping("/form")
    public String save(@Valid User user, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de usuarios");
            return "form";
        }
        userService.save(user);
        return "redirect:list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if (id>0) {
            userService.delete(id);
        }
        return "redirect:/list";
    }
}