package com.example.jokesgenerator.controller;


import com.example.jokesgenerator.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class JokesController {

    private final JokeService jokesService;

    public JokesController(JokeService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String value(Model model) {
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }

}