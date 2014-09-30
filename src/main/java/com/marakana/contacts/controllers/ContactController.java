package com.marakana.contacts.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marakana.contacts.entities.Contact;
import com.marakana.contacts.repositories.ContactRepository;

@Controller
public class ContactController {

	@Autowired
	private ContactRepository contactRepository;
	
	@RequestMapping(value="/contacts", method=RequestMethod.GET)
	public void getContactList(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException{
		request.setAttribute("contacts", contactRepository.findAll());
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("view/contact/list");
		requestDispatcher.forward(request, response);
	}
	
	public void getContact(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException{

		if (request.getParameter("add") != null)
			request.getRequestDispatcher("view/addContact.jsp").forward(
					request, response);
		else {
			long id = Long.parseLong(request.getParameter("id"));
				// get contact id from the request parameter and
				// populate model withthe contact and address object
				Contact contact = contactRepository.find(id);
				request.setAttribute("contact", contact);

				// dispatch either to the edit page or to the view page
				if (request.getParameter("edit") != null) {
					request.getRequestDispatcher("view/editContact.jsp")
							.forward(request, response);
				} else {
					request.getRequestDispatcher("view/viewContact.jsp")
							.forward(request, response);
				}
		}
	
	}
}
