package com.tyrowebdev.E_Banking.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/OTPCheckerServ")
public class OTPCheckerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public OTPCheckerServ() {
        super();
      
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int otp =(int) session.getAttribute("otp");
		int otpe = Integer.parseInt(request.getParameter("otpe"));
		if(otp == otpe)
		{
			response.sendRedirect("UserBalanceServ2");
		}
		else
		{
			response.sendRedirect("unauthorizedUserPage.jsp");
		}
	}

}
