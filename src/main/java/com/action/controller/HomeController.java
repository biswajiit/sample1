package com.action.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	private static Logger LOGGER = Logger.getLogger(HomeController.class); 

	@GetMapping(value="/detail")
	public void getDetail() {
		LOGGER.info("inside getDetail method call..");
	}
}
