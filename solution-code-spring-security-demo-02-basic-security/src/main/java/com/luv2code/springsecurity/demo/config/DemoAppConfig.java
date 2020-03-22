package com.luv2code.springsecurity.demo.config;

import com.luv2code.springsecurity.demo.controller.FrontController;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.luv2code.springsecurity.demo")
public class DemoAppConfig {
	final private static Logger logger = Logger.getLogger(DemoAppConfig.class);
	// define a bean for ViewResolver

	@Bean
	public ViewResolver viewResolver() {
		logger.info(getClass());
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	@Bean(initMethod = "init")
	public FrontController frontController()
	{
		return new FrontController();
	}
	
}









