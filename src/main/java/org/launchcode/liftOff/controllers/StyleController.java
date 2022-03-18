package org.launchcode.liftOff.controllers;


import org.launchcode.liftOff.models.Style;
import org.launchcode.liftOff.models.data.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping ("styles")
public class StyleController {

    @Autowired
    private StyleRepository styleRepository;

    @GetMapping("add")
    public String displayAddStyleForm(Model model) {
        model.addAttribute(new Style());
        return "styles/add";
    }

    @GetMapping("")
    public String index (Model model){
        model.addAttribute("title", "All Genres");
        model.addAttribute("styles", styleRepository.findAll());
        return "styles/index";
    }

    @PostMapping("add")
    public String processAddStyleForm(@ModelAttribute @Valid Style newStyle,
                                      Errors errors, Model model){
        if (errors.hasErrors()) {
            return "styles/add";
        }
        styleRepository.save(newStyle);
        return "redirect:";
    }

    @GetMapping("view/{styleId}")
    public String displayViewStyle(Model model, @PathVariable int styleId) {
        Optional optStyle = styleRepository.findById(styleId);
        if (optStyle.isPresent()){
            Style style = (Style) optStyle.get();
            model.addAttribute("style", style);
            return "styles/view";
        } else{
            return "redirect:../";
        }
    }
}
