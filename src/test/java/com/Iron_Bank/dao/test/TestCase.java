package com.Iron_Bank.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.Iron_Bank.dao.UserDAO;
import com.Iron_Bank.dao.UserDAOImpl;
import com.Iron_Bank.model.UserPaU;

class TestCase {
	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}*/
	@Test
	void isDAOConnectionreachedforLogin() {
		UserDAO userDao = new UserDAOImpl();
		assert((userDao.loginUser("fritzsimson") != null));
		
	}
	@Test
	void isDAOConnectionreachedforLoginAndAreTheseUserSimilar() {
		UserDAO userDao = new UserDAOImpl();
		assertEquals(userDao.loginUser("fritzsimson").getPassword(),"P@ssw0rd");
	}
	@Test
	void isDAOConnectionbeingReachedforCreationinganewUserandPassword() throws SQLException {
		UserDAO userDao = new UserDAOImpl();
		UserPaU userpau = new UserPaU("Marco","Machines");
		assertEquals(userDao.loginUser("Marco").getUsersname() ,userpau.getUsersname());
	}
}
