package com.examplesvc.demosvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloowController {

	@GetMapping("/hello")
	public String getHellow()
	{
		return "Hello World123";
	}
	
	@PostMapping("/hello/post")
	public String getHellow1(@RequestBody String s)
	{
		System.out.println(s);
		return s;
	}
	
}
