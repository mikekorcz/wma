package pl.mkorcz.wma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    String displayHome() {
        return "main/home";
    }
}
