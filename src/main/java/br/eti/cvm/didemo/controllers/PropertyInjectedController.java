package br.eti.cvm.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import br.eti.cvm.didemo.services.GreetingServiceImpl;


/**
 * Created by jt on 5/24/17.
 */
@Controller
public class PropertyInjectedController {
	@Autowired
	@Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
