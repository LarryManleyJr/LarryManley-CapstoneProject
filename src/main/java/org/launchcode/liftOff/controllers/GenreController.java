package org.launchcode.liftOff.controllers;


import org.launchcode.liftOff.models.data.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class GenreController {

    @Autowired
    public GenreRepository genreRepository;
}
