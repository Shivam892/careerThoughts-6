package com.career.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.career.entity.Vikash;
import com.career.service.VikashService;

@Controller
public class VikashController {
	
	@Autowired
	private VikashService vika;
	
	@RequestMapping("/lvikash")
	public String loadVikash() {
		return "niraj";
	}
	
	@RequestMapping("/lCvikash")
	public String vikashC(@ModelAttribute("biku") Vikash vikash, ModelMap modelMap) {
		vika.sharma(vikash);
		modelMap.addAttribute("msg", "Record is saved!!");
		return "niraj";
	}

}
