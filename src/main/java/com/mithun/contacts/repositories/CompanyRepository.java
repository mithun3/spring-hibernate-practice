package com.mithun.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mithun.contacts.entities.Company;
import com.mithun.contacts.entities.Contact;

//Database access
//all code removed check addressRepository
public interface CompanyRepository extends JpaRepository<Company, Long>{

}
