package com.mithun.contacts.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marakana.contacts.entities.Address;
import com.marakana.contacts.entities.Contact;
import com.marakana.contacts.repositories.AddressRepository;
import com.marakana.contacts.repositories.ContactRepository;

@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
	public final AddressRepository addressRepository = new AddressRepository();
	public final ContactRepository contactRepository = new ContactRepository();

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
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

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			if (request.getParameter("add") != null) {
				// create new contact and address from the form using request
				// parameters and persist
				Address address = new Address(request.getParameter("street"),
						request.getParameter("city"),
						request.getParameter("state"),
						request.getParameter("zip"));
				address = addressRepository.save(address);
				Contact contact = new Contact(request.getParameter("name"),
						address);
				contact = contactRepository.save(contact);
				//redirect ot contact page
				response.sendRedirect("contact?id=" + contact.getId());
			} else if (request.getParameter("edit") != null) {
				// look up exiting contact and address fields and persist
				long id = Long.parseLong(request.getParameter("id"));
				Contact contact = contactRepository.find(id);
				Address address = contact.getAddress();
				contact.setName(request.getParameter("name"));
				address.setStreet(request.getParameter("street"));
				address.setCity(request.getParameter("city"));
				address.setState(request.getParameter("state"));
				address.setZip(request.getParameter("zip"));
				contactRepository.save(contact);
				addressRepository.save(address);
				response.sendRedirect("contact?id=" + contact.getId());
			} else if (request.getParameter("delete") != null) {
				// look up exiting contact and address fields and delete
				long id = Long.parseLong(request.getParameter("id"));
				Contact contact = contactRepository.find(id);
				Address address = contact.getAddress();
				contactRepository.delete(contact);
				addressRepository.delete(address);
				response.sendRedirect("contacts");
			} else
				super.doPost(request, response);

	}

}
