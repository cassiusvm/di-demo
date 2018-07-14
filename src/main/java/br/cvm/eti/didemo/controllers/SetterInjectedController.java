package br.cvm.eti.didemo.controllers;

import br.cvm.eti.didemo.services.GreetingService;

/**
 * Created by jt on 5/24/17.
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
