package com.kkzhixia.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * 使用@ResponseBody和方法返回字符串的简单例子。
 * @author Pactera
 * 
 * 适合作为ajax查询使用
 *
 */
@Controller
public class ResponseBodyExample1Controller {

	// Simple example, method returns String.
    @RequestMapping(value = "/saveResult")
    @ResponseBody
    public String authorInfo(Model model) {
    	
        return "saved";
    } 
}
