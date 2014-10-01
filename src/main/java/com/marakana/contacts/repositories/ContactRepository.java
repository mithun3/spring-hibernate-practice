package com.marakana.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marakana.contacts.entities.Contact;

//Database access
//all code removed check addressRepository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
