package com.marakana.contacts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Contact {

	@Id
	@GeneratedValue
	private long id;
	@Column
	private String name;
	@OneToOne
	private Address address;

	public Contact() {
	}

	public Contact(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	

	public Contact(long id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



}
