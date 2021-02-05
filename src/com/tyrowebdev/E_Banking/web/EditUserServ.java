package com.tyrowebdev.E_Banking.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Banking.DAO.UserManagementDAO;
import com.tyrowebdev.E_Banking.model.Users;


/**
 * Servlet implementation class EditUserServ
 */
@WebServlet("/EditUserServ")
public class EditUserServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUserServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ac = request.getParameter("ac");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");

		Users user = new Users(ac, name, email, address, contact);
		try {
			UserManagementDAO.updateUser(user);
			RequestDispatcher rd = request.getRequestDispatcher("adminHome.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}


