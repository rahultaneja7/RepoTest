package com.examplesvc.demosvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloowController {

	@GetMapping("/hello")
	public String getHellow()
	{
		return "Hello World123";
	}
	
}
