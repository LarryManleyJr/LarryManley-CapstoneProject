package org.launchcode.liftOff.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
public class HomeController {
    public String welcomeToThePage(Model model) {
return "gallery";
    }
}
