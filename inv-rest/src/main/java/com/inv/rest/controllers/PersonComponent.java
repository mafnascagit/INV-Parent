package com.inv.rest.controllers;

import com.inv.core.models.Person;
import com.inv.core.services.PersonDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/person")
public class PersonComponent {

    private PersonDAOImpl personDAOImpl;

    @GetMapping
    public String hello() {
        return "Hello from person controller";
    }

    @RequestMapping(value = "/addPerson", method = RequestMethod.PUT)
    public void addPerson(@RequestBody Person person) {
        personDAOImpl.savePerson(person);
    }

    @RequestMapping(value="/list", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Person> list() {
        return personDAOImpl.findAllPersons();
    }
}
