package com.Iron_Bank.service.test;

import static org.junit.jupiter.api.Assertions.*;


import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.Iron_Bank.service.UserService;
import com.Iron_bank.exception.UserNotFoundException;


class Testing {

	public UserService uss = new UserService();
	//previous had created a user now checking if I can obtain that infromation
	@Test
	void isCreationOfAUserfound() {
		try {
			assertEquals(uss.userLoginInfo("Maco").getUsersname(),"Maco");
		} catch (SQLException | UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void  canIRecievePasswordTokenfromUserLoginInfo() throws SQLException, UserNotFoundException {
		assert(uss.userLoginInfo("Marco").getPassword() != null);
	}
	@Test 
	void canIVerifyLogininfo() {
		assertTrue(uss.checkingpasswordLoginInfo("Maco", "Machin3"));
		
	}
	@Test
	void mistypedpassword() {
		assertFalse(uss.checkingpasswordLoginInfo("Maco", "Machin3)"));
	}
	@Test
	void isretriveingUsenameworking() {
		assertTrue(uss.checkingUsernameLoginInfo("Maco"));
	}
	@Test
	void ifUsernameismistype() {
		assertFalse(uss.checkingUsernameLoginInfo("mAco"));
	}
	@Test
	void createAFullUser() {
		assertEquals("");
	}
}
