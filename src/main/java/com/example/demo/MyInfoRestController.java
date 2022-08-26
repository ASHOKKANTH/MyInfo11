package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyInfoRestController {

	@GetMapping("/info11")
	public String myInfo() {

		String str = "spring boot course=5000/-";

		return str;
	}
}
