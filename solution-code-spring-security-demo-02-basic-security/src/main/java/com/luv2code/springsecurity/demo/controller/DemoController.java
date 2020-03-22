package com.luv2code.springsecurity.demo.controller;

import com.luv2code.springsecurity.demo.config.DemoSecurityConfig;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	final private static Logger logger = Logger.getLogger(DemoController.class);
	@GetMapping("/")
	public String showHome() {
		logger.debug("return home");
		return "home";
	}
}
