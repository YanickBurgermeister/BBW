package ch.bbw.yb.autohaus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Yanick Burgermeister
 * @version 30.05.23
 */

/*
    Antwort:
    Es gibt einen Konflikt, da beide Anfragen gleichzeitig gemacht werden.
 */
@Controller
public class OpelController {

    @GetMapping("/opel")
    public String showOpel(){
        return "OpelView";
    }
}
