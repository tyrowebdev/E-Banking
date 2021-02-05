package com.tyrowebdev.E_Banking.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Banking.DAO.TransactionDAO;
import com.tyrowebdev.E_Banking.model.Transactions;

/**
 * Servlet implementation class WithdrawServ
 */
@WebServlet("/WithdrawServ")
public class WithdrawServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WithdrawServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ac = request.getParameter("ac");
		Double old_balance = Double.parseDouble(request.getParameter("old_bal")); 	
		Double amount = Double.parseDouble(request.getParameter("new_amount"));
		if(old_balance<amount)
		{
			PrintWriter out = response.getWriter();
			out.print("Not Sufficient Balance To Withdraw");
		}
		else
		{
		Double balance =  old_balance - amount  ;
		String from ="Self";
		String type = "Withdraw";
		Transactions trans = new Transactions(ac,from, type, amount, balance);
		int status =  TransactionDAO.depositMoney(trans);
		if(status == 1)
		{
			
			response.sendRedirect("UserBalanceServ2");
			
		}
		else 
		{
			PrintWriter out = response.getWriter();
			out.print("Unable To Withdraw");
		}
		}
	}

}
