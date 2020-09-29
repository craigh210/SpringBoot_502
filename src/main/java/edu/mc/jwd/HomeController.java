package edu.mc.jwd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.PortUnreachableException;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
