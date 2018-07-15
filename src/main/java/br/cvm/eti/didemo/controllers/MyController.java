package br.cvm.eti.didemo.controllers;

import org.springframework.stereotype.Controller;

import br.cvm.eti.didemo.services.GreetingService;

@Controller
public class MyController {
	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String hello() {
		System.out.println("Hello !!!");
		
		return greetingService.sayGreeting();
	}
}
