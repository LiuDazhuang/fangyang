package com.kkzhixia.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制器中的重定向到Controller
 * @author Pactera
 *
 */

@Controller
public class RedirectExampleController {

	
	
	 @RequestMapping(value = "/redirect", method = RequestMethod.GET)
	    public String authorInfo(Model model) {
	 
	       // Do somethong here
		 model.addAttribute("redirect","使用前缀 'redirect:' ，该方法返回字符串，可以重定向到另一页面。");
	 
	        return "redirect:/hello";
	    }
}
