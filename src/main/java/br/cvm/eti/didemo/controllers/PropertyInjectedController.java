package br.cvm.eti.didemo.controllers;

import br.cvm.eti.didemo.services.GreetingServiceImpl;


/**
 * Created by jt on 5/24/17.
 */

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
