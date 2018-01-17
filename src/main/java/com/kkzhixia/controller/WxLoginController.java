package com.kkzhixia.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kkzhixia.utils.CheckUtil;


/**
 * 微信登陆
 * @author Pactera
 *
 */
@Controller
public class WxLoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@RequestMapping("/wxlogin")
	protected void doGet(HttpServletRequest request, HttpServletResponse response,Model model) throws ServletException, IOException {
		
		System.out.println("我是日志,我来证明程序启动了");
		String  signature=request.getParameter("signature");
		String  timestamp=request.getParameter("timestamp");
		String  nonce=request.getParameter("nonce");
		String  echostr=request.getParameter("echostr");
		
		if(CheckUtil.checkSignature(signature,timestamp,nonce)){
			System.out.println(echostr);
			model.addAttribute("wxlogininfo","登陆成功!");
			//返回页面
			
		}
		
	}
	
	@RequestMapping("/wxLoginMessage")
	public String hello(Model model) {
        
		
		
        model.addAttribute("message", "我是微信登陆页面");
        
        return "wxlogin";
         
    }
}
