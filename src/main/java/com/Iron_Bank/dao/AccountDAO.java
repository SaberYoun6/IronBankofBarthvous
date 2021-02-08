package com.Iron_Bank.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.Iron_Bank.model.AccountInfo;


public interface AccountDAO {
	public int creatAccountName(AccountInfo accountInfo,Connection connection) throws SQLException;
	
}
