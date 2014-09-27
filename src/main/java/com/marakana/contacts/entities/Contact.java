package com.marakana.contacts.entities;


public class Contact {

	private long id;
	private String name;
	private long addresId;
	
	public Contact(){}
	
	public Contact(String name, long addresId) {
		super();
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
