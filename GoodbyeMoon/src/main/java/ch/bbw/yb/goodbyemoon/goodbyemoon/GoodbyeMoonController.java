package ch.bbw.yb.goodbyemoon.goodbyemoon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoodbyeMoonController {

    @GetMapping("/goodbye")
    public String showGoodbyeMoon(){
        System.out.println("GoodbyeMoonController.showGoodbyeMoon");
        return "GoodbyeView.html";
    }
}
