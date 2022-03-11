package org.launchcode.liftOff.controllers;


import org.launchcode.liftOff.models.data.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("title")
public class TitleController {

    @Autowired
    private TitleRepository titleRepository;

}
