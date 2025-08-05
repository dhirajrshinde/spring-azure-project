package com.amdocs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {

	@GetMapping("/")
	public String  Home() {
		return "Welcome to Jenkins Demo";
	}
}
