package com.kkzhixia.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用@RequestParam 注解将请求参数绑定到你的控制器方法参数。下面的代码片段显示了这个用法：
 * @author Pactera
 *
 */


@Controller
public class RequestParamExampleController {

	
	@RequestMapping("/user")
    public String userInfo(Model model,
            @RequestParam(value = "name", defaultValue = "Guest") String name) {
 
        model.addAttribute("name", name);
 
        if("admin".equals(name)) {
            model.addAttribute("email", "admin@yiibai.com");
        } else{
            model.addAttribute("email", "Not set");
        }
        return "userInfo";
    }
}
