package com.example.jenkinspractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/jenkins")
public class HelloWorldController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello world for Jenkins!";
	}
}
