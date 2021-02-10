package com.Iron_Bank.service.test;

import static org.junit.jupiter.api.Assertions.*;


import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.Iron_Bank.exception.UserNotFoundException;
import com.Iron_Bank.service.UserService;


class Testing {

	public UserService uss = new UserService();
	//previous had created a user now checking if I can obtain that infromation
	@Test
	void isIdOfAUsersfound() {
		assertEquals(uss.getUserId("Karatekind"),1);
	}
	@Test
	void  canIRecievePasswordTokenfromUserLoginInfo() throws SQLException, UserNotFoundException {
		assert(uss.userLoginInfo("Karatekind").getPassword() != null);
	}
	@Test 
	void canIVerifyLogininfo() {
		assertTrue(uss.checkingpasswordLoginInfo("Karatekind", "Pet$wip3s"));
		
	}
	@Test
	void mistypedpassword() {
		assertFalse(uss.checkingpasswordLoginInfo("Karatekind", "Machin3)"));
	}
	@Test
	void isretriveingUsenameworking() {
		assertTrue(uss.checkingUsernameLoginInfo("Karatekind"));
	}
	@Test
	void ifUsernameisMistype() {
		assertFalse(uss.checkingUsernameLoginInfo("mAco"));
	}
	
}
