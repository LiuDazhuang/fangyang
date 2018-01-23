package com.kkzhixia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 博客
 * @author Pactera
 *
 */
@Controller
public class ArticleController {

	/*
	 * 根据博客类型查询分页博客
	 * 返回 json
	 */
	@ResponseBody
	@RequestMapping("/getArticlePageByType")
	public String getArticlePageByType(Model model) {
        
        model.addAttribute("user", "I am zhangsan ");
         
        return"index";
         
    }
	
	
	/*
	 * 
	 * 查询博客类型和类型下博客篇数
	 * 返回json
	 * 
	 */
	
	@RequestMapping("/getArticleTypeAndNumber")
	@ResponseBody
	public String getArticleTypeAndNumber(Model model) {
        
        model.addAttribute("user", "I am zhangsan ");
         
        return"index";
         
    }
	
}
