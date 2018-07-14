package br.cvm.eti.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	public String hello() {
		System.out.println();
		System.out.println("Hello !!!");
		System.out.println();
		
		return "";
	}
}
