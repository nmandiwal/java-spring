package com.springboot.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.cache.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
