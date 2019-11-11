package com.inv.rest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greetingMessage() {
        return "Hello from the INV API!";
    }
}
