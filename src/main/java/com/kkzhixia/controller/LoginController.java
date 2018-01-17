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
	public String hello(Model model,String name) {
        
		model.addAttribute("message", "我是登陆页面");
        
		System.out.println("name:"+name); 
		
        return"login";
         
    }
	
}
