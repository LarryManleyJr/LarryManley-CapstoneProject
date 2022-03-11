package org.launchcode.liftOff.controllers;


import org.launchcode.liftOff.models.data.StyleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class StyleController {
    private StyleRepository styleRepository;
}
