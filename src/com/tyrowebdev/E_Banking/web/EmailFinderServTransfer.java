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

/**
 * Servlet implementation class EmailFinderServTransfer
 */
@WebServlet("/EmailFinderServTransfer")
public class EmailFinderServTransfer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailFinderServTransfer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String ac =(String) session.getAttribute("ac");
		Users u =	UserManagementDAO.selectAcUser(ac);
		String email = u.getEmail();
		int otp = GenerateOTP.generateOTP();
		session.setAttribute("otp", otp);
		EmailOTPSender e = new EmailOTPSender();
		e.sendEmail(email, otp);
		response.sendRedirect("transfer_verification.jsp");	
	}

}
