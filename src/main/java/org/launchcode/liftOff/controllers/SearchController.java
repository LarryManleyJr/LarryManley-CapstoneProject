package org.launchcode.liftOff.controllers;


import org.launchcode.liftOff.models.Inventory;
import org.launchcode.liftOff.models.InventoryData;
import org.launchcode.liftOff.models.data.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;
import static org.launchcode.liftOff.controllers.GalleryController.columnChoices;


@Controller
@RequestMapping("search")
public class SearchController {
    
    @Autowired
    private InventoryRepository inventoryRepository;
    
    @RequestMapping("")
    public String search (Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }
    
    @PostMapping ("results")
    public String displaySearchResults(Model model, @RequestParam String searchType, @RequestParam String searchTerm) {
        Iterable<Inventory> inventories;
        if (searchTerm.toLowerCase().equals("all") || searchTerm.equals("")){
            inventories = inventoryRepository.findAll();
        } else {
            inventories = InventoryData.findByColumnAndValue(searchType, searchTerm, inventoryRepository.findAll());
        }
        model.addAttribute("columns", columnChoices);
        model.addAttribute("title", "Gallery Work with " + columnChoices.get(searchTerm) + ": " + searchTerm);
        model.addAttribute("inventory", inventories);

        return "search";
    }
}

