package com.Iron_Bank.service;

import com.Iron_Bank.model.User;
import com.Iron_Bank.model.UserPaU;
import com.Iron_Bank.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.Iron_Bank.dao.UserDAO;
import com.Iron_Bank.dao.UserDAOImpl;
import com.Iron_Bank.exception.UserNotFoundException;

public class UserService {

	private static Logger log = Logger.getLogger(UserService.class);
	public UserDAO userDao;

	public UserService() {
		super();
		userDao = new UserDAOImpl();
	}

	public int usernamesCreationandPasswordsService(String usersname, String password) {
		int count = 0;

		UserPaU user = new UserPaU(0, usersname, password);

		try (Connection connection = ConnectionUtil.getConnection()) {

			connection.setAutoCommit(false);

			count = userDao.usernameCreationandPasswords(user, connection);

			connection.commit();
		} catch (SQLException e) {
			// TODO: handle exception
			log.trace(e);
		}

		return count;

	}

	/*
	 * public int usersInfoCreationService(String givenname, String surname, String
	 * email, String ssn, String dob, String dateofcreation, String lastlogin) { int
	 * count = 0; User user = new User(0, givenname, surname, email, ssn, dob,
	 * dateofcreation, lastlogin); try (Connection connection =
	 * ConnectionUtil.getConnection()) { connection.setAutoCommit(false); count =
	 * userDao.infoCreation(user, connection); connection.commit(); } catch
	 * (SQLException e) { log.trace(e); }
	 * 
	 * return count; }
	 */

	@SuppressWarnings("unused")
	public UserPaU userLoginInfo(String usersname) throws UserNotFoundException{

		UserPaU useru = userDao.loginUser(usersname);
		log.trace(useru.getUsersname());
		log.trace(useru.getPassword());
		if (useru != null) {
			return useru;
		} else
			throw new UserNotFoundException("A User was not found your "+ usersname+"with that name" );
	}

	public boolean checkingUsernameLoginInfo(String username) {
		UserService uservice = new UserService();
		UserPaU user = null;
		try {
			user = uservice.userLoginInfo(username);

		} catch ( UserNotFoundException e) {
			// TODO Auto-generated catch block
			return e.getMessage() != null;
		}
		if (user.getUsersname().equals(username)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean checkingpasswordLoginInfo(String username, String password) {
		UserService uss = new UserService();
		UserPaU user = null;
		try {
			user = uss.userLoginInfo(username);
		} catch ( UserNotFoundException e) {
			return e.getMessage() != null;

		}
		if (user.getUsersname().equals(username) & user.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}

	}

	public int getUserId(String username) {
		UserService uss = new UserService();
		UserPaU user = null;
		try {
			user = uss.userLoginInfo(username);

		} catch ( UserNotFoundException e) {
			e.printStackTrace();
		}
		return user.getUsers_id();
	}
}
