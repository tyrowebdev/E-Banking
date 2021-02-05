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

@WebServlet("/TransferServ")
public class TransferServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TransferServ() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acSender = request.getParameter("acs");
		Double old_balance_sender = Double.parseDouble(request.getParameter("old_bal"));
		Double transfer_amount = Double.parseDouble(request.getParameter("amount"));
		String acReceiver = request.getParameter("acr");
		Transactions t = TransactionDAO.selectBalance(acReceiver);
		PrintWriter out = response.getWriter();

		if (old_balance_sender >= transfer_amount) {
			 if (t == null) {
				Transactions transR = new Transactions(acReceiver, acSender, "Received", transfer_amount,
						transfer_amount);
				int status = TransactionDAO.depositMoney(transR);
				if (status == 1) {
					Double balance = old_balance_sender - transfer_amount;
					Transactions transS = new Transactions(acSender, acReceiver, "Transfer", transfer_amount, balance);
					status = TransactionDAO.depositMoney(transS);
					if (status == 1) {
						/*
						 * RequestDispatcher rd = request.getRequestDispatcher("UserBalanceServ3");
						 * rd.forward(request, response);
						 */
						response.sendRedirect("UserBalanceServ3");
					} else {
						out.print("Try after sometime");
					}
				} else {
					out.print("Try after sometime");
				}
			} else {
				Double old_balance_receiver = t.getBalance();
				Double new_balance_receiver = old_balance_receiver + transfer_amount;
				Transactions transR = new Transactions(acReceiver, acSender, "Received", transfer_amount,
						new_balance_receiver);
				int status = TransactionDAO.depositMoney(transR);
				if (status == 1) {
					Double balance = old_balance_sender - transfer_amount;
					Transactions transS = new Transactions(acSender, acReceiver, "Transfer", transfer_amount, balance);
					status = TransactionDAO.depositMoney(transS);
					if (status == 1) {
						/*
						 * RequestDispatcher rd = request.getRequestDispatcher("UserBalanceServ3");
						 * rd.forward(request, response);
						 */
						response.sendRedirect("UserBalanceServ3");
					} else {
						out.print("Try after sometime");
					}
				} else {
					out.print("Try after sometime");
				}

			}

		}

		else {
			out.print("Not Sufficient Balance To Transfer");
		}

	}

}
