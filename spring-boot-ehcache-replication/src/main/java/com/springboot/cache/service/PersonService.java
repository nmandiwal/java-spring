package com.springboot.cache.service;

import com.springboot.cache.entity.Person;

public interface PersonService {
    Person queryById(Long id);

    Person savePerson(Person person);
}
