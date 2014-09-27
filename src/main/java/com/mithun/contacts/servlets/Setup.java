package com.mithun.contacts.servlets;

import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.marakana.contacts.entities.Address;
import com.marakana.contacts.repositories.AddressRepository;

@WebListener
public class Setup implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//instantiate a AddressRepository
		//init
		//
		try {
			AddressRepository addressRepository = new AddressRepository();
//			addressRepository.init();
			Address address = new Address("1334","Bangalore","Karnataka","560092");
			addressRepository.create(address);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
