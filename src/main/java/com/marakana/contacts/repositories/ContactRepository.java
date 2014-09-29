package com.marakana.contacts.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.marakana.contacts.entities.Contact;

//Database access
//all code removed check addressRepository
public class ContactRepository extends Repository<Contact>{

	public ContactRepository() {
		super(Contact.class);
		// TODO Auto-generated constructor stub
	}
	
}
