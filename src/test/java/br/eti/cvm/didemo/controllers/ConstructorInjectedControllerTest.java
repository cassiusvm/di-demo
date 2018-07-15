package br.eti.cvm.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.eti.cvm.didemo.controllers.ConstructorInjectedController;
import br.eti.cvm.didemo.services.GreetingServiceImpl;

/**
 * Created by jt on 5/24/17.
 */
public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}