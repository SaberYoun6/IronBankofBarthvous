package com.Iron_Bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.Iron_Bank.exception.DataBaseConnectionException;
import com.Iron_Bank.model.User;
import com.Iron_Bank.model.UserPaU;
import com.Iron_Bank.util.ConnectionUtil;

public class UserDAOImpl implements UserDAO {

	private static Logger log = Logger.getLogger(UserDAOImpl.class);
	public UserDAOImpl() {
		super();
	}
	/*
	@Override
	public int infoCreation(User users, Connection connection) throws SQLException {
		int creationCOunt = 0;

		String sql = "INSERT INTO iron_bank.UsersInfo(firstname,lastname,email,ssn,dob,created_On,last_login) VALUES (?,?,?,?,?,?,?)";

		PreparedStatement pstmt = connection.prepareStatement(sql);

		pstmt.setString(1, users.getGivenname());
		pstmt.setString(2, users.getSurname());
		pstmt.setString(3, users.getEmail());
		pstmt.setString(4, users.getSsn());
		pstmt.setString(5, users.getDateofcreation());
		pstmt.setString(6, users.getLastlogin());

		return creationCOunt;
	}
	public User informationAboutUser(int id, int userId) {
		
		return null;
		
	}
    */
	@Override
	public int usernameCreationandPasswords(UserPaU user, Connection connection) throws SQLException {
		int creationCount = 0;

		String sql = "Insert into iron_bank.accountPaU(usersnames,userspassword) values (?,?)";

		PreparedStatement pstmt = connection.prepareStatement(sql);

		pstmt.setString(1, user.getUsersname());

		pstmt.setString(2, user.getPassword());

		creationCount = pstmt.executeUpdate();

		return creationCount;
	}
	@Override
	public UserPaU loginUser(String username){
		UserPaU userd =  null ;
		try (Connection connection = ConnectionUtil.getConnection()) {
			log.trace(connection);
			String sql = "SELECT userspassword , usersnames  from iron_bank.accountPaU where usersnames = (?)";

			PreparedStatement pstmt = connection.prepareStatement(sql);
			log.trace(pstmt);
			
			pstmt.setString(1, username);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				String usernames = rs.getString("usersnames");
				String password = rs.getString("userspassword");
				userd = new UserPaU(usernames, password);
				log.trace(userd);
				log.trace(usernames);
				log.trace(password);
			} 
			}catch (  SQLException  e) {
				log.trace(e);
			}
			return userd;
		}

}
