package com.seannewby.firstspringportlet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("VIEW")
public class FirstController {
	
	@RequestMapping
	public String showIndex(){
		return "index";
	}

}
