package com.tyrowebdev.E_Banking.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyrowebdev.E_Banking.DAO.TransactionDAO;
import com.tyrowebdev.E_Banking.model.Transactions;



@WebServlet("/TransactionServ")
public class TransactionServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public TransactionServ() {
        super();
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String ac = (String) session.getAttribute("ac");
		List<Transactions> trans = TransactionDAO.selectAllTransactions(ac);
		session.setAttribute("transactionList", trans);
		response.sendRedirect("transactionDetails.jsp");
	}

}
