package com.tyrowebdev.E_Banking.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class OTPCheckerServTransfer
 */
@WebServlet("/OTPCheckerServTransfer")
public class OTPCheckerServTransfer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OTPCheckerServTransfer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int otp =(int) session.getAttribute("otp");
		int otpe = Integer.parseInt(request.getParameter("otpe"));
		if(otp == otpe)
		{
			response.sendRedirect("UserBalanceServ3");
		}
		else
		{
			response.sendRedirect("unauthorizedUserPage.jsp");
		}
	}

}
