package com.tyrowebdev.E_Banking.web;

import java.io.IOException;

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
 * Servlet implementation class ViewDetailServ
 */
@WebServlet("/ViewDetailServ")
public class ViewDetailServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewDetailServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		String ac =(String) session.getAttribute("ac");
		try {
		Users existingUser =	UserManagementDAO.selectAcUser(ac);
		session.setAttribute("userDetail", existingUser);
		response.sendRedirect("viewDetails.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
