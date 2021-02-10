package com.Iron_Bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.Iron_Bank.model.AccountInfo;
import com.Iron_Bank.util.ConnectionUtil;

public class AccountDAOImpl implements AccountDAO {
   public Logger log = Logger.getLogger(AccountDAOImpl.class);
	public AccountDAOImpl() {
		super();
	}
	@Override
	public int createAccountInformation(AccountInfo accountInfo, Connection connection) throws SQLException {
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
		AccountInfo accinfo = null;
		
		try (Connection connection = ConnectionUtil.getConnection()){
			
			String sql = "select * from iron_bank.accounts_info where user_account_id = (?)";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			
			pstmt.setInt(1,accountNumberId);
			
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				int accountsInfoId= rs.getInt("account_id");
				int accuserid = rs.getInt("user_account_id");
				String accountType = rs.getString("account_type");
				String accountId= rs.getString("account_number_id");
				double debt= rs.getDouble("debt");
				accinfo = new AccountInfo(accountsInfoId,accuserid,accountType,accountId,debt);
			}
		}catch(SQLException e) {
			log.trace(e);
		}
		return accinfo;
		
	}
	

}
