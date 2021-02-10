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
	public int creatAccountInformation(AccountInfo accountInfo, Connection connection) throws SQLException {
		 int count =0;
		 
		 String sql = "insert into iron_bank.accounts_info(user_account_id,account_type,account_number_id,debt) values (?,?,?,?)";
		 PreparedStatement pstmt = connection.prepareStatement(sql);
		 pstmt.setInt(1, accountInfo.getAccountNumberId());
		 pstmt.setString(2, accountInfo.getAccountType());
		 pstmt.setString(3, accountInfo.getNumberId());
		 pstmt.setDouble(4, accountInfo.getDebt());
		 
		 count = pstmt.executeUpdate();
		 
		return count;
	}
	@Override
	public AccountInfo getAccountInfoById(int accountNumberId) {
		return null;
		
	}
	

}
