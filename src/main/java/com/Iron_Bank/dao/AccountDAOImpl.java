package com.Iron_Bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.Iron_Bank.model.AccountInfo;

public class AccountDAOImpl implements AccountDAO {
    public AccountDAOImpl() {
		super();
	}
	@Override
	public int creatAccountName(AccountInfo accountInfo, Connection connection) throws SQLException {
		 int count =0;
		 
		 String sql = "insert into postgres.accountinfo (accountsavingid,debtsaving,accountcheckingid,debtchecking) values (?,?,?,?)";
		 PreparedStatement pstmt = connection.prepareStatement(sql);
		 
		 pstmt.setString(1, accountInfo.getAccountType());
		 pstmt.setString(2, accountInfo.getNumberId());
		 pstmt.setDouble(3, accountInfo.getDebt());
		 
		 count = pstmt.executeUpdate();
		 
		return count;
	}
	

}
