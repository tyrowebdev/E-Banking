package com.tyrowebdev.E_Banking.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Banking.DAO.UserManagementDAO;
import com.tyrowebdev.E_Banking.model.Users;

/**
 * Servlet implementation class AddCustomerServ
 */
@WebServlet("/AddCustomerServ")
public class AddCustomerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCustomerServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		String role = request.getParameter("role");

		Users NewUser = new Users(name, email, password, address, contact, role);
		System.out.println(NewUser);
		try {
			UserManagementDAO.insertUser(NewUser);
			response.sendRedirect("AddedCustomer.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
