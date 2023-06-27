package ch.bbw.yb.helloworld.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String showHello(){
        System.out.println("HelloController.showHello");
        return "HelloView.html";
    }

    @GetMapping("/hello")
    public String showHelloAgain(){
        System.out.println("HelloController.showHelloAgain");
        return "HelloView.html";
    }

}
