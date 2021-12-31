package com.launchclub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/")
	public ModelAndView home() {
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		ModelAndView mav = new ModelAndView("index.html");
		return mav;
	}

}
