package com.tyrowebdev.E_Banking.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyrowebdev.E_Banking.DAO.UserManagementDAO;
import com.tyrowebdev.E_Banking.model.Users;

/**
 * Servlet implementation class ViewAllServ
 */
@WebServlet("/ViewAllServ")
public class ViewAllServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Users> users = UserManagementDAO.selectAllUser();
		HttpSession session = request.getSession();
		session.setAttribute("userList", users);
	    RequestDispatcher rd = request.getRequestDispatcher("viewCustomer.jsp");
		rd.forward(request, response);
	}

}
