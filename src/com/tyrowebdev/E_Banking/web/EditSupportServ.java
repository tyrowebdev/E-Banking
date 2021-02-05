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
 * Servlet implementation class EditSupportServ
 */
@WebServlet("/EditSupportServ")
public class EditSupportServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditSupportServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ac = request.getParameter("ac");
		Users existingUsers = UserManagementDAO.selectAcUser(ac);
		request.setAttribute("user", existingUsers);
		RequestDispatcher rd = request.getRequestDispatcher("editExistingUser.jsp");
		rd.forward(request, response);
	}

}
