package br.cvm.eti.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.cvm.eti.didemo.services.GreetingServiceImpl;


/**
 * Created by jt on 5/24/17.
 */
@Controller
public class PropertyInjectedController {
	@Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
