package com.tyrowebdev.E_Banking.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Banking.DAO.UserManagementDAO;

/**
 * Servlet implementation class DeleteServ
 */
@WebServlet("/DeleteServ")
public class DeleteServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String ac = request.getParameter("ac");
	try {
		UserManagementDAO.deleteIdUser(ac);
		RequestDispatcher rd = request.getRequestDispatcher("adminHome.jsp");
		rd.forward(request, response);
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
	
	
	}

