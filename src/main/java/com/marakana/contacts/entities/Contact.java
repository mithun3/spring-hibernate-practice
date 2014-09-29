package com.marakana.contacts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	@GeneratedValue
	private long id;
	@Column
	private String name;
	@Column
	private long addresId;

	public Contact() {
	}

	public Contact(String name, long addresId) {
		super();
		this.name = name;
		this.addresId = addresId;
	}
	

	public Contact(long id, String name, long addresId) {
		super();
		this.id = id;
		this.name = name;
		this.addresId = addresId;
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

	public long getAddresId() {
		return addresId;
	}

	public void setAddresId(long addresId) {
		this.addresId = addresId;
	}

}
