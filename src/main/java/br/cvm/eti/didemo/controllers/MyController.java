package br.cvm.eti.didemo.controllers;

import org.springframework.stereotype.Controller;

import br.cvm.eti.didemo.services.GreetingService;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!! ");

        return greetingService.sayGreeting();
    }
}
