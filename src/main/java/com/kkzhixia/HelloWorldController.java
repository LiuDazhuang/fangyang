package com.kkzhixia;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 

/**
 * 返回网页 传model到前台
 * @author Pactera
 *
 */




@Controller
@RequestMapping("/")
public class HelloWorldController {
 
    @RequestMapping("/hello")
    public String hello(Model model) {
         
        model.addAttribute("greeting", "Hello Spring MVC");
         
        return"helloworld";
         
    }
 
}