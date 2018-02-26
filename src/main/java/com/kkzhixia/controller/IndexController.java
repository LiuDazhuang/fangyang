package com.kkzhixia.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 * @author Pactera
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/index")
	public String hello(Model model) {
        
		System.out.println("IndexController.hello()");
		model.addAttribute("user", "I am zhangsan ");
         
        return"index";
         
    }
}
