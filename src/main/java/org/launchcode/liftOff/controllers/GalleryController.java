package org.launchcode.liftOff.controllers;

import org.launchcode.liftOff.models.Inventory;
import org.launchcode.liftOff.models.InventoryData;
import org.launchcode.liftOff.models.data.GenreRepository;
import org.launchcode.liftOff.models.data.InventoryRepository;
import org.launchcode.liftOff.models.data.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
@RequestMapping(value = "gallery")
public class GalleryController {

    @Autowired
    public InventoryRepository inventoryRepository;

    @Autowired
    public StyleRepository styleRepository;

    @Autowired
    public GenreRepository genreRepository;

    static HashMap<String, String> columnChoices = new HashMap<>();

    public GalleryController () {
        columnChoices.put("all", "All");
        columnChoices.put("style", "Style");
        columnChoices.put("genre", "Genre");
    }

    @RequestMapping("")
    public String list(Model model) {
        model.addAttribute("styles", styleRepository.findAll());
        model.addAttribute("genres", genreRepository.findAll());
        return "gallery";
    }

    @RequestMapping(value = "inventories")
    public String listInventoriesColumnAndValue(Model model, @RequestParam String column, @RequestParam String value){
        Iterable<Inventory> inventories;
        if (column.toLowerCase().equals("all")){
            inventories=inventoryRepository.findAll();
            model.addAttribute("title", "All Inventory");
        } else {
            inventories = InventoryData.findByColumnAndValue(column, value, inventoryRepository.findAll());
            model.addAttribute("title", "Inventory with " + columnChoices.get(column) + ": " + value);
        }
        model.addAttribute("inventories", inventories);
        return"list-inventory";
    }
}
