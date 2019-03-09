package com.springboot.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.cache.entity.Person;
import com.springboot.cache.service.PersonService;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/queryById")
    public Person queryById(Long id) {
        Person person = personService.queryById(id);
        return person;
    }

    @RequestMapping("/savePerson")
    public Person savePerson() {
        Person person = new Person();
        person.setId(1L);
        person.setName("Naren");
        person = personService.savePerson(person);
        return person;
    }
}
