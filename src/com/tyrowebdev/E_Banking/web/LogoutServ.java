package com.tyrowebdev.E_Banking.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServ")
public class LogoutServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LogoutServ() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("name");
		session.invalidate();
		response.sendRedirect("login.jsp");
	
	}

}
