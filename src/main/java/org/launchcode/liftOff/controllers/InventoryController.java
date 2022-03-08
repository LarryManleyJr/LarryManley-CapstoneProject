package org.launchcode.liftOff.controllers;


import org.launchcode.liftOff.models.data.GenreRepository;
import org.launchcode.liftOff.models.data.StyleRepository;
import org.launchcode.liftOff.models.data.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InventoryController {

    @Autowired
    public GenreRepository genreRepository;

    @Autowired
    public StyleRepository styleRepository;

    @Autowired
    public TitleRepository titleRepository;


}
