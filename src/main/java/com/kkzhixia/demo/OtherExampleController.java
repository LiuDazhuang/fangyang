package com.kkzhixia.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HttpServletRequest & HttpServletResponse
 * @author Pactera
 *
 */

@Controller
public class OtherExampleController {

	
	  @RequestMapping("/somePath")
	   public String requestResponseExample(HttpServletRequest request,
	           HttpServletResponse reponses, Model model) {
	 
	       // Todo something here
	 
		  model.addAttribute("somstr", "可以使用 HttpServletRequest, HttpServletResponse 在控制器的方法中。OtherExampleController.java");
	       return "someView";
	   }
	
}
