package com.onkyarity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
	
	@RequestMapping("/add")
	public ModelAndView add() {
		return new ModelAndView("display");
	}

}
