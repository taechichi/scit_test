package net.datasa.ex_cashbook_prac.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping({"", "/", "home"})
    public String homeEnter() {
        log.debug("homeEnter method called.");
        return "home";
    }
}
