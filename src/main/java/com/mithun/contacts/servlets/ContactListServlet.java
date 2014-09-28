package com.mithun.contacts.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marakana.contacts.repositories.ContactRepository;

@WebServlet("/contacts")
public class ContactListServlet extends HttpServlet{

	private final ContactRepository contactRepository = new ContactRepository();
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setAttribute("contacts", contactRepository.findAll());
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/hello.jsp");
			requestDispatcher.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	


}
