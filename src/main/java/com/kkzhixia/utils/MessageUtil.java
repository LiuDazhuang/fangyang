package com.kkzhixia.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageUtil {

	/**
	 * 返回页面
	 * @return
	 */
	@RequestMapping("/topage")
	public static String toPage(String PageFileStr,HashMap<String,String> modellist,Model model){
		//拼写参数到model
		model=ForMap(modellist,model);
		return PageFileStr;
	}

	/**
	 * 返回json
	 * 
	 * @return
	 */
	@RequestMapping("/toJson")
	@ResponseBody
	public static String toJson() {

		return "{a:1,b:2}";
	}

	public static Model ForMap(HashMap<String, String> modellist,Model model) {
		Iterator iter = modellist.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			String key = (String) entry.getKey();
			String val = (String) entry.getValue();
			model.addAttribute(key, val);
		}
		return model;
	}
}
