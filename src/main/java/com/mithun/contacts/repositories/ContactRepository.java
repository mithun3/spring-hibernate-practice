package com.mithun.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mithun.contacts.entities.Contact;

//Database access
//all code removed check addressRepository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
