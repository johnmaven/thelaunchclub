package com.launchclub.Calculator;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DateController {

	@Autowired
	public Calculator cal;
	
	@RequestMapping("date")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("getdate")
	public ModelAndView Cal(@RequestParam String month, @RequestParam String day)
	{
		int Month =Integer.parseInt(month);
		int Day =Integer.parseInt(day);
	    ModelAndView mav = new ModelAndView("Date.jsp");
	    List<String> Date = cal.cal(Month, Day);
	    mav.addObject("date", Date);
		return mav;
		
	}

	
	
}
