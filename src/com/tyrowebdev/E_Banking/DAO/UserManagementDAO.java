package com.tyrowebdev.E_Banking.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tyrowebdev.E_Banking.dbConnection.DbConnection;
import com.tyrowebdev.E_Banking.model.Users;

public class UserManagementDAO {

	private static final String INSERT_USERS_SQL = "INSERT INTO users(name,email,password,address,contact,role)VALUES(?,?,?,?,?,?);";
	private static final String CHECK_USER = "SELECT ac,name,password,role FROM users  WHERE ac = ? AND password = ? ;" ;
	private static final String SELECT_ALL_USER = "SELECT  * from users where role = 'user' ;";	
	private static final String SELECT_AC_USERS_SQL = "SELECT ac,name,email,address,contact FROM users WHERE ac =?;";
	private static final String SELECT_AC_ROLE_USERS_SQL = "SELECT ac,name,email,address,contact FROM users WHERE ac =? AND role = 'user'  ;";
	private static final String UPDATE_USERS_SQL = "UPDATE users SET name= ? ,email = ?,address = ?,contact = ? WHERE ac= ? ; ";
	private static final String DELETE_ID_USERS_SQL = "DELETE FROM users WHERE ac =?;";
	private static final String SELECT_PASSWORD_SQL ="SELECT password FROM users WHERE email = ? ;";
	private static final String SELECT_AC_UING_EMAIL_SQL ="SELECT ac,password FROM users WHERE email = ? ;";
	
	public static void insertUser(Users user) {
		try (Connection con = DbConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(INSERT_USERS_SQL)) {
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getContact());
			ps.setString(6, user.getRole());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static boolean checkUser1(String ac , String pass) 
	{
		
		try (Connection con = DbConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(CHECK_USER)) {
		ps.setString(1, ac);
		ps.setString(2, pass);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			return true;
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	public static Users checkUser2(String ac , String pass) 
	{
		Users user =null;
		try (Connection con = DbConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(CHECK_USER)) {
		ps.setString(1, ac);
		ps.setString(2, pass);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			String ace = rs.getString("ac");
			String name = rs.getString("name");
			String password = rs.getString("password");
			String role = rs.getString("role");
			user = new Users(ace, name, password, role);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	

	public static List<Users> selectAllUser() {
		List<Users> users = new ArrayList<>();
		try (Connection con = DbConnection.getConnection(); 
	PreparedStatement ps = con.prepareStatement(SELECT_ALL_USER)) {
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{   
				String ac = rs.getString("ac");
				String name =rs.getString("name");
				String email =rs.getString("email");
				String address =rs.getString("address");
				String contact =rs.getString("contact");
				
				users.add(new Users(ac, name, email, address, contact));
			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public static Users selectAcUser(String ac) {
		Users user = null;
		try (Connection con = DbConnection.getConnection(); 
	PreparedStatement ps = con.prepareStatement(SELECT_AC_USERS_SQL)) {
			ps.setString(1, ac);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{ 
				String name =rs.getString("name");
				String email =rs.getString("email");
				String address =rs.getString("address");
				String contact =rs.getString("contact");
				
				user = new Users(ac,name, email, address, contact);
			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public static Users selectAcRoleUser(String ac) {
		Users user = null;
		try (Connection con = DbConnection.getConnection(); 
	PreparedStatement ps = con.prepareStatement(SELECT_AC_ROLE_USERS_SQL)) {
			ps.setString(1, ac);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{ 
				String name =rs.getString("name");
				String email =rs.getString("email");
				String address =rs.getString("address");
				String contact =rs.getString("contact");
				
				user = new Users(ac,name, email, address, contact);
			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public static void updateUser(Users user) {
		try (Connection con = DbConnection.getConnection(); PreparedStatement ps = con.prepareStatement(UPDATE_USERS_SQL)) {
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getAddress());
			ps.setString(4, user.getContact());
			ps.setString(5, user.getAc());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void deleteIdUser(String ac) throws SQLException {
		try (Connection con = DbConnection.getConnection(); PreparedStatement ps = con.prepareStatement(DELETE_ID_USERS_SQL)) {
			ps.setString(1, ac);
			ps.executeUpdate();

		}
	}
	
	
	public static Users selectPasswordUser(String Email) {
		Users user = null;
		try (Connection con = DbConnection.getConnection(); 
	PreparedStatement ps = con.prepareStatement(SELECT_PASSWORD_SQL)) {
			ps.setString(1, Email);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{ 
				String password =rs.getString("password");
				user = new Users(password);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public static Users selectAcUsingEmailUser(String Email) {
		Users user = null;
		try (Connection con = DbConnection.getConnection(); 
	PreparedStatement ps = con.prepareStatement(SELECT_AC_UING_EMAIL_SQL)) {
			ps.setString(1, Email);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{ 
				String ac = rs.getString("ac");
				String password =rs.getString("password");
				user = new Users(ac, password);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}	

}
