package com.tyrowebdev.E_Banking.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tyrowebdev.E_Banking.dbConnection.DbConnection;
import com.tyrowebdev.E_Banking.model.Transactions;
import com.tyrowebdev.E_Banking.model.Users;

public class TransactionDAO {


	
	private static final String SELECT_BALANCE_SQL = "SELECT balance from transactions WHERE ac = ? ORDER BY tnumber DESC LIMIT 1 ;";
	private static final String DEPOSIT_MONEY_SQL ="INSERT INTO transactions(`ac`,`from`,`type`,`amount`,`balance`)VALUES(?,?,?,?,?);";
	private static final String ALL_TRANSACTIONS_SQL ="SELECT  * FROM transactions where ac = ?   ORDER BY tnumber  DESC LIMIT 10; ;";
	
	public static Transactions selectBalance(String ac)
	{
		Transactions t = null;
		try(Connection con = DbConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(SELECT_BALANCE_SQL)	){
			ps.setString(1, ac);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Double balance = rs.getDouble("balance");
				t = new Transactions(balance);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return t;
		
	}
	
	public static int depositMoney(Transactions trans)
	{
		int status = 0;
		try(Connection con = DbConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(DEPOSIT_MONEY_SQL)){
					ps.setString(1 ,trans.getAc());
					ps.setString(2 , trans.getFrom());
					ps.setString(3 ,trans.getType());
					ps.setDouble(4 , trans.getAmount());
					ps.setDouble(5 ,trans.getBalance());
					 status = ps.executeUpdate();
				 } catch (SQLException e) {
					e.printStackTrace();
				}
		
		return status;
			
	}
	
	public static List<Transactions> selectAllTransactions(String ac) {
		List<Transactions> trans = new ArrayList<>();
		try (Connection con = DbConnection.getConnection(); 
	PreparedStatement ps = con.prepareStatement(ALL_TRANSACTIONS_SQL)) {
			ps.setString(1, ac);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{   
				String ac1 = rs.getString("ac");
				String from =rs.getString("from");
				String type =rs.getString("type");
				Double amount =rs.getDouble("amount");
				Double balance =rs.getDouble("balance");
				String date_time =rs.getString("date_time");
				
				trans.add(new Transactions(ac1, from, type, amount, balance, date_time));

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return trans;
	}
	
	
	
	
	
}
