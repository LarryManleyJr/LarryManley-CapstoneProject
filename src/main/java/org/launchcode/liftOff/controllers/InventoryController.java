package org.launchcode.liftOff.controllers;


import org.launchcode.liftOff.models.Genre;
import org.launchcode.liftOff.models.Inventory;
import org.launchcode.liftOff.models.Style;
import org.launchcode.liftOff.models.data.GenreRepository;
import org.launchcode.liftOff.models.data.InventoryRepository;
import org.launchcode.liftOff.models.data.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class InventoryController {

    @Autowired
    public GenreRepository genreRepository;

    @Autowired
    public StyleRepository styleRepository;

    @Autowired
    public InventoryRepository inventoryRepository;

    @RequestMapping("")
    public String displayNewInventory (Model model) {
        model.addAttribute(new Inventory());
        return "admin";
    }

    @GetMapping("add")
    public String displayAddInventoryForm (Model model) {
        model.addAttribute("title", "Add Inventory");
        model.addAttribute(new Inventory());
        model.addAttribute("genres", genreRepository.findAll());
        model.addAttribute("styles", styleRepository.findAll());
        return "add";
    }

    @PostMapping("add")
    public String processAddInventoryForm (@ModelAttribute @Valid Inventory newInventory,
                                           Errors errors, Model model, @RequestParam int genreId, @RequestParam List<Integer> styles) {
        Optional<Genre> optionalGenre = genreRepository.findById(genreId);
        if (optionalGenre.isPresent()){
            Genre genre = optionalGenre.get();
            newInventory.setGenre(genre);
        }
        List<Style> styleObjs = (List<Style>) styleRepository.findAllById(styles);
            newInventory.setStyles(styleObjs);

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Inventory");
            return "add";
        }
        inventoryRepository.save(newInventory);

        return "redirect:";
    }
    @GetMapping("view/{inventoryId}")
    public String displayViewInventory(Model model, @PathVariable int inventoryId) {
        return "view";
    }
}
