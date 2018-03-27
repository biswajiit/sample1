package com.action.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class HomeControllerTest {
	private static Logger LOGGER = LogManager.getLogger(HomeController.class.getName());
	private HomeController homeController;

	@Before
	public void init() {
		homeController = new HomeController();
	}

	@Test
	public void getDetailTest() {
		LOGGER.info("inside getDetailTest method call..");
		homeController.getDetail();
	}
}
