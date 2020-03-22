package com.luv2code.springsecurity.demo.controller;

import com.luv2code.springsecurity.demo.config.DemoSecurityConfig;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	final private static Logger logger = Logger.getLogger(LoginController.class);

	@GetMapping("/showLoginPage")
	public String showMyLoginPage() {
		logger.debug(getClass());
		logger.debug("return : fancy-login");
		return "fancy-login";
		
	}
}
