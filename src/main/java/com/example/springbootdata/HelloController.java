package com.example.springbootdata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String sayHelloAll()
	{
		return "welcome to all";
	}
	@GetMapping("/user")
	public String  sayHelloUser() {
		return "hello user";
	}
	@GetMapping("/admin")
	public String sayHelloAdmin()
	{
		return "hello admin";
	}

}
