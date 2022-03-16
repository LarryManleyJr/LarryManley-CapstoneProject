package org.launchcode.liftOff.controllers;


import org.launchcode.liftOff.models.Genre;
import org.launchcode.liftOff.models.data.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping ("genres")
public class GenreController {

    @Autowired
    public GenreRepository genreRepository;

    @GetMapping("add")
    public String displayAddGenreForm(Model model){
        model.addAttribute(new Genre());
        return "genres/add";
    }

    @GetMapping("")
    public String index (Model model){
        model.addAttribute("title", "All Genres");
        model.addAttribute("genres", genreRepository.findAll());
        return "index";
    }

    @PostMapping("add")
    public String processAddGenreForm(@ModelAttribute @Valid Genre newGenre,
                                      Errors errors, Model model) {

        if(errors.hasErrors()) {
            return "genres/add";
        }
        genreRepository.save(newGenre);
        return "redirect:";
    }

    @GetMapping("view/{genreId}")
    public String displayViewGenre(Model model, @PathVariable int genreId) {
        Optional optGenre = genreRepository.findById(genreId);
        if (optGenre.isPresent()){
            Genre genre = (Genre) optGenre.get();
            model.addAttribute("genre", genre);
            return "genres/view";
        }else{
            return "redirect:../";
        }
    }
}
