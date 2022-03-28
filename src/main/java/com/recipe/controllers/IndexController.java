package com.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        System.out.println("Hello my name is Joshlan");
        System.out.println("Hello my name is Raposo!");

        return "index";
    }
}
