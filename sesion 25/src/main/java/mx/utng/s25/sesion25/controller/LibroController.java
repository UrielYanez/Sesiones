package mx.utng.s25.sesion25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mx.utng.s25.sesion25.model.entity.Libro;
import mx.utng.s25.sesion25.model.service.ILibroService;

@Controller
@RequestMapping("/libro")
public class LibroController {

    @Autowired
    private ILibroService libroService;

    @GetMapping("/list")
    public String listBooks(Model model) {
        List<Libro> libros = libroService.list();
        model.addAttribute("libros", libros);
        return "list-books";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model model) {
        Libro libro = new Libro();
        model.addAttribute("libro", libro);
        return "book-form";
    }

    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("libro") Libro libro, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "book-form";
        }
        libroService.save(libro);
        return "redirect:/libro/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("bookId") long id, Model model) {
        Libro libro = libroService.getById(id);
        model.addAttribute("libro", libro);
        return "book-form";
    }

    @GetMapping("/delete")
    public String deleteBook(@RequestParam("bookId") long id) {
        libroService.delete(id);
        return "redirect:/libro/list";
    }
}
