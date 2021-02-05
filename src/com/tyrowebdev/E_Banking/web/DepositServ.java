package com.tyrowebdev.E_Banking.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Banking.DAO.TransactionDAO;
import com.tyrowebdev.E_Banking.model.Transactions;

/**
 * Servlet implementation class DepositServ
 */
@WebServlet("/DepositServ")
public class DepositServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepositServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ac = request.getParameter("ac");
		Double old_balance = Double.parseDouble(request.getParameter("old_bal")); 	
		Double amount = Double.parseDouble(request.getParameter("new_amount"));
		Double balance = amount + old_balance  ;
		String from ="Self";
		String type = "Deposit";
		Transactions trans = new Transactions(ac,from, type, amount, balance);
		int status =  TransactionDAO.depositMoney(trans);
		if(status == 1)
		{
			
			 response.sendRedirect("UserBalanceServ1");
		}
		else 
		{
			PrintWriter out = response.getWriter();
			out.print("Unable To Deposit");
		}
		
	}

	
}
