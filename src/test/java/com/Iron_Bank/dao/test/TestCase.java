package com.Iron_Bank.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.Iron_Bank.dao.AccountDAO;
import com.Iron_Bank.dao.AccountDAOImpl;
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
		assert((userDao.loginUser("Karatekind").getUsersname() != null));
		
	}
	@Test
	void isDAOConnectionreachedforLoginAndAreTheseUserSimilar() {
		UserDAO userDao = new UserDAOImpl();
		assertEquals(userDao.loginUser("Karatekind").getPassword(),"Pet$wip3s");
	}
	@Test
	void isDAOConnectionbeingReachedforCreationinganewUserandPassword() throws SQLException {
		UserDAO userDao = new UserDAOImpl();
		UserPaU users = new UserPaU("Karatekind","Pet$wip3s");
		assertEquals(userDao.loginUser("Karatekind").getUsersname() ,users.getUsersname());
	}
	@Test
	void isDAOusernametoid() {
		UserDAO userDao = new UserDAOImpl();
		assertEquals(userDao.loginUser("Karatekind").getUsers_id(),1);
	}
	@Test
	void isaccountinformatio() {
		AccountDAO accDao = new AccountDAOImpl();
		assertNull(accDao.getAccountInfoById(1));
	}
}
