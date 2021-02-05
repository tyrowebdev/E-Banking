package com.tyrowebdev.E_Banking.web;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Banking.dbConnection.DbConnection;

/**
 * Servlet implementation class JdbcCsvFile
 */
@WebServlet("/JdbcCsvFile")
public class JdbcCsvFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JdbcCsvFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ac = request.getParameter("ac");
		String filename = "c:\\csv\\Transactions.csv";
		Connection conn = null;
		  String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "e-banking";
		  String driver = "com.mysql.jdbc.Driver";
		  String userName = "root"; 
		  String password = "admin";
		  Statement stmt;
		  try
		  {
		  PrintWriter out = response.getWriter();
		  FileWriter fw = new FileWriter(filename);
		  fw.append("Account Number");
		  fw.append(',');
		  fw.append("Transaction To/From");
		  fw.append(',');
		  fw.append("Type");
		  fw.append(',');
		  fw.append("Amount");
		  fw.append(',');
		  fw.append("Balance");
		  fw.append(',');
		  fw.append("Time_Date");
		  fw.append('\n');

		  Class.forName(driver).newInstance();
		  conn = DriverManager.getConnection
		   (url+dbName,userName,password);
		  String query  = "select * from transactions ;";
		  stmt = conn.createStatement();
		  ResultSet rs = stmt.executeQuery(query);
		  while(rs.next())
		  {
		  fw.append(rs.getString(2));
		  fw.append(',');
		  fw.append(rs.getString(3));
		  fw.append(',');
		  fw.append(rs.getString(4));
		  fw.append(',');
		  fw.append(rs.getString(5));
		  fw.append(',');
		  fw.append(rs.getString(6));
		  fw.append(',');
		  fw.append(rs.getString(7));
		  fw.append('\n');
		  }
		  fw.flush();
		  fw.close();
		  conn.close();
		  out.println
		   ("<b>You  Successfully Created Csv file.</b>");
		  } catch (Exception e) {
		  e.printStackTrace();
	}
	}
}
