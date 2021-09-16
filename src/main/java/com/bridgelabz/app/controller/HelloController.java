package com.bridgelabz.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String showMsg() {
		return "hello from BridgeLabz";
	}

	//displaying message by query parameters
	@RequestMapping("/hello/query")
	public String sayHello(@RequestParam(value = "name" , defaultValue = "") String name) {
		return "Hello " + name + " from BridgeLabz";
	}

	
	//displaying message by path parameters
	@RequestMapping("/hello/param/{name}")
	public String sayHelloByPathParam(@PathVariable String name) {
		return "Hello "+name+" from BridgeLabz";
	}
}
