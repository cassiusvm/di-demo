package br.eti.cvm.didemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import br.eti.cvm.didemo.services.GreetingService;

/**
 * Created by jt on 5/24/17.
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // Works fine without @Autowired
//    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
