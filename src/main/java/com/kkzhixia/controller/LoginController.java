package com.kkzhixia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登陆
 * @author Pactera
 *
 */
@Controller
public class LoginController {
	@RequestMapping("/login")
	public String hello(Model model) {
        
        model.addAttribute("user", "I am zhangsan ");
         
        return"login";
         
    }
	
}
