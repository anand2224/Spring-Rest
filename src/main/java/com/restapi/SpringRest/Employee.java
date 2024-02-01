package com.restapi.SpringRest;

import jakarta.persistence.Id;

public class Employee{
	
	private @Id int id;
	private String name;
	private String mail;
	private String contact;
	private String address;
	
	
	public Employee() {
		
	}
	public Employee(int id, String name, String mail, String contact,String address) {
		this.id= id;
		this.name= name;
		this.mail= name;
		this.contact = contact;
		this.address = address;
	}
	public int get_id() {
		return id;
	}
	public String get_name() {
		return name;
	}
	public String get_mail() {
		return mail;
	}
	public String get_contact() {
		return contact;
	}
	public String address() {
		return address;
	}
	public void set_id(int id) {
		this.id = id;
	}
	public void set_name(String name) {
		this.name = name;
	}
	public void set_mail(String mail) {
		this.mail =mail;
	}
	public void set_contact(String contact) {
		this.contact = contact;
	}
	
}
