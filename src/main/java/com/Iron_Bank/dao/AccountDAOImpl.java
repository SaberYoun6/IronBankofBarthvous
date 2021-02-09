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
		 
		 pstmt.setString(1, accountInfo.getSavingNumberId());
		 pstmt.setDouble(2, accountInfo.getDebtSaving());
		 pstmt.setString(3, accountInfo.getCheckingNumberId());
		 pstmt.setDouble(4, accountInfo.getDebtChecking());
		 
		 count = pstmt.executeUpdate();
		 
		return count;
	}
	@Override
	public AccountInfo lookupIdAccountTypesNames(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
