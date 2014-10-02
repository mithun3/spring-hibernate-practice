package com.mithun.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mithun.contacts.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
