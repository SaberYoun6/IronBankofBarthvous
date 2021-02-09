package com.Iron_Bank.dao;



import java.sql.Connection;
import java.sql.SQLException;

import com.Iron_Bank.model.User;
import com.Iron_Bank.model.UserPaU;

public interface UserDAO {

	public int usernameCreationandPasswords(UserPaU user,Connection connection) throws SQLException;
	//public int infoCreation(User users,Connection connection) throws SQLException;
	public UserPaU loginUser(String username);
}
