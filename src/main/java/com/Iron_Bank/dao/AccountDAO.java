package com.Iron_Bank.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.Iron_Bank.model.AccountInfo;


public interface AccountDAO {
	public int createAccountInformation(AccountInfo accountInfo,Connection connection) throws SQLException;
	public AccountInfo getAccountInfoById(int accountNumberId);

}
