package com.springboot.cache.service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.springboot.cache.entity.Person;
import com.springboot.cache.repository.PersonRepository;
import com.springboot.cache.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    @Cacheable(key = "#id", value = "person")
    public Person queryById(Long id) {
        return personRepository.findById(id).get();
    }

    @Override
    @Cacheable(key = "#person.id", value = "person")
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

}
