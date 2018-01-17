package com.kkzhixia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户
 * @author Pactera
 *
 */
@Controller
public class UserController {

	
	/**
	 * 查询用户信息
	 * @param model
	 * @param name
	 * @return
	 */
	@RequestMapping("/UserInfo")
	@ResponseBody
	public String getUserInfo(Model model,String name) {
        
		model.addAttribute("UserInfo", "查询用户信息");
        return"login";
         
    }
	
	/**
	 * 判断用户是否存在
	 * @param model
	 * @param name
	 * @return
	 */
	@RequestMapping("/IsUser")
	@ResponseBody
	public Boolean IsUser(Model model,String name) {
        Boolean flag=false;
		model.addAttribute("UserInfo", "查询用户信息");
        return flag;
         
    }
}
