package cn.edu.sxgkd.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstSpringDemo {
    @RequestMapping("/firstSpringMVC")
    public String welcomeToSpringMVC() {
        return "success";
    }
}
