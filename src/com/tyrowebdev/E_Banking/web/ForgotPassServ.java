package com.tyrowebdev.E_Banking.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Banking.DAO.UserManagementDAO;
import com.tyrowebdev.E_Banking.model.EmailSender;
import com.tyrowebdev.E_Banking.model.Users;


@WebServlet("/ForgotPassServ")
public class ForgotPassServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ForgotPassServ() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		Users user = UserManagementDAO.selectPasswordUser(email);
		if(user == null)
		{
			response.sendRedirect("registerFirst.jsp");
		}	
		else
		{
			String Password = user.getPassword();
			  EmailSender e = new EmailSender(); 
			  e.sendEmail(email, Password);
			  response.sendRedirect("emailSent.jsp");
			 	
		}
	
	}

}
