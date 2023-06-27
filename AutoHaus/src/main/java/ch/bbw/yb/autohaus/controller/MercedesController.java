package ch.bbw.yb.autohaus.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Yanick Burgermeister
 * @version 30.05.23
 */
@Controller
public class MercedesController {
    @GetMapping("/")
    public String showMercedes(){
        return "MercedesView";
    }

    @GetMapping("/mercedes")
    public String showMercedesAgain(){
        return "MercedesView";
    }
}
