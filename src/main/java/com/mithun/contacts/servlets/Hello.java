package com.mithun.contacts.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello-servlet")
public class Hello extends HttpServlet{

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().println("<html><body>hello</body><html>");
		String[] names = request.getParameter("names").split("\\|");
		request.setAttribute("names", names);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/hello.jsp");
		requestDispatcher.forward(request,response);
		
	}
	
	

}
