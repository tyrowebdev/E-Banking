package com.tyrowebdev.E_Banking.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyrowebdev.E_Banking.DAO.UserManagementDAO;
import com.tyrowebdev.E_Banking.model.EmailOTPSender;
import com.tyrowebdev.E_Banking.model.GenerateOTP;
import com.tyrowebdev.E_Banking.model.Users;


@WebServlet("/EmailFinderServ")
public class EmailFinderServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public EmailFinderServ() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String ac =(String) session.getAttribute("ac");
		Users u =	UserManagementDAO.selectAcUser(ac);
		String email = u.getEmail();
		int otp = GenerateOTP.generateOTP();
		session.setAttribute("otp", otp);
		EmailOTPSender e = new EmailOTPSender();
		e.sendEmail(email, otp);
		response.sendRedirect("withdraw_verification.jsp");	
	}

}
