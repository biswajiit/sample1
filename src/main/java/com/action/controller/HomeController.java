package com.action.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	private static Logger LOGGER = LogManager.getLogger(HomeController.class.getName()); 

	@GetMapping(value="/detail")
	public void getDetail() {
		LOGGER.info("inside getDetail method call..");
	}
}
