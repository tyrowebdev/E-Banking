package com.tyrowebdev.E_Banking.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyrowebdev.E_Banking.DAO.UserManagementDAO;
import com.tyrowebdev.E_Banking.model.Users;


@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServ() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ac = request.getParameter("ac");
		String password = request.getParameter("password");
		
		boolean status = UserManagementDAO.checkUser1(ac,password);
		
		if(status)
		{	
		Users existing = UserManagementDAO.checkUser2(ac, password);	

		if(( existing.getPassword().equals(password))&&(existing.getRole().equals("user") ))
		{
			HttpSession session = request.getSession();
			session.setAttribute("user",existing);
			session.setAttribute("role", existing.getRole());
			session.setAttribute("ac", existing.getAc());
			response.sendRedirect("customerHome.jsp");
		}
		else if(( existing.getPassword().equals(password))&&(existing.getRole().equals("admin") ))
		{
			HttpSession session = request.getSession();
			session.setAttribute("user",existing);
			session.setAttribute("role", existing.getRole());
			response.sendRedirect("adminHome.jsp");
		}
		}
		
		else
		{
			response.sendRedirect("loginFailed.jsp");
		}
		
		
		
	}

}
