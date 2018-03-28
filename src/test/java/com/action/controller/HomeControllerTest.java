package com.action.controller;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class HomeControllerTest {
	private static Logger LOGGER = Logger.getLogger(HomeController.class);
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
