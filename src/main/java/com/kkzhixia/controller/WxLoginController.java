package com.kkzhixia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 微信登陆
 * @author Pactera
 *
 */
@Controller
public class WxLoginController {

	@RequestMapping("/wxlogin")
	public String hello(Model model) {
        
        model.addAttribute("user", "I am zhangsan ");
         
        return"login";
         
    }
}
