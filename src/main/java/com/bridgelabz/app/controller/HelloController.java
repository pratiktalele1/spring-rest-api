package com.bridgelabz.app.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.app.model.User;

@RestController
@RequestMapping("/get")
public class HelloController {
	@GetMapping("/hello")
	public String showMsg() {
		return "hello from BridgeLabz";
	}

	//displaying message by query parameters
	@GetMapping("/query")
	public String sayHello(@RequestParam(value = "name" , defaultValue = "") String name) {
		return "Hello " + name + " from BridgeLabz";
	}

	//displaying message by path parameters
	@GetMapping("/param/{name}")
	public String sayHelloByPathParam(@PathVariable String name) {
		return "Hello "+name+" from BridgeLabz";
	}
	
	//displaying message using post method
	@PostMapping("/post")
	public String helloByFullName(@RequestBody User user) {
		return "Hello "+user.getFirstName()+" "+user.getLastName()+" from BridgeLabz";
	}
	
	//displaying message using put method
	@PutMapping("/put/{name}")
	public String updateByFirstNameAndLastName(@PathVariable String name,@RequestParam(value = "lastName") String lastName) {
		return "Hello "+name+" "+lastName+" from Bridgelabz";
	}
}
