package com.tyrowebdev.E_Banking.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyrowebdev.E_Banking.DAO.TransactionDAO;
import com.tyrowebdev.E_Banking.DAO.UserManagementDAO;
import com.tyrowebdev.E_Banking.model.Transactions;
import com.tyrowebdev.E_Banking.model.Users;

/**
 * Servlet implementation class UserBalanceServ1
 */
@WebServlet("/UserBalanceServ1")
public class UserBalanceServ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserBalanceServ1() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		String ac = (String) session.getAttribute("ac");
		try {
			Transactions trans = TransactionDAO.selectBalance(ac);
			if(trans == null)
			{
				RequestDispatcher rd = request.getRequestDispatcher("depositMoney0.jsp");
				rd.forward(request, response);
			}
			else
			{
			session.setAttribute("bal", trans);
			RequestDispatcher rd = request.getRequestDispatcher("depositMoney.jsp");
			rd.forward(request, response);
			}	
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

}
