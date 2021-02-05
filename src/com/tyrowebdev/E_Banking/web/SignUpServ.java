package com.tyrowebdev.E_Banking.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Banking.DAO.UserManagementDAO;
import com.tyrowebdev.E_Banking.model.EmailAccDetailSender;
import com.tyrowebdev.E_Banking.model.Users;


@WebServlet("/SignUpServ")
public class SignUpServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SignUpServ() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		String role = request.getParameter("role");
		
		Users NewUser = new Users(name, email, password, address, contact,role);
		try {
			UserManagementDAO.insertUser(NewUser);
			Users u = UserManagementDAO.selectAcUsingEmailUser(email);
			String ac = u.getAc();
			EmailAccDetailSender e = new EmailAccDetailSender();
			e.sendEmail(email, ac);
			response.sendRedirect("signUpSuccess.jsp");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
