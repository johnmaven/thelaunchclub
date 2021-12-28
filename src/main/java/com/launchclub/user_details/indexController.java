package com.launchclub.user_details;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("show")
	public ModelAndView showUsers() 
	{
		ModelAndView mav = new ModelAndView("Userlist.jsp");
		List<User> listUser = userDao.findAll();
		System.out.println(listUser);
		mav.addObject("listuser",listUser);
		return mav;
	}
}
