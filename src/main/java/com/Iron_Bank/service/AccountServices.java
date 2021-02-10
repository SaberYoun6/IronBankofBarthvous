package com.Iron_Bank.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.Iron_Bank.dao.AccountDAO;
import com.Iron_Bank.dao.AccountDAOImpl;
import com.Iron_Bank.exception.AccountNotFoundException;
import com.Iron_Bank.model.AccountInfo;
import com.Iron_Bank.model.User;
import com.Iron_Bank.util.ConnectionUtil;

public class AccountServices {
	private static Logger log = Logger.getLogger(AccountServices.class);
	public AccountDAO accountDao;

	public AccountServices() {
		accountDao = new AccountDAOImpl();
	}

	public int accountCreation(int account_user_id, String accountType ,double debtSaving) {
		int count = 0;
		String savingAccountId = AccountServices.checkingSavingsid();
		AccountInfo accounts = new AccountInfo(0, account_user_id,accountType,savingAccountId, debtSaving);

		try (Connection connection = ConnectionUtil.getConnection()) {
			connection.setAutoCommit(false);

			count = accountDao.createAccountInformation(accounts, connection);

			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;

	}

	private static String checkingSavingsid() {
		Random rand = new Random();
		int[] intarray = new int[12];
		String combine = null;
		int num = 0;
		int upperbound = 9;

		for (int i = 0; i < intarray.length; i++) {
			num = rand.nextInt(upperbound);
			int value = num;
			intarray[i] = value;
		}

		combine = Arrays.stream(intarray).mapToObj(String::valueOf).collect(Collectors.joining(""));
		return combine;
	}

	@SuppressWarnings("unused")
	public AccountInfo getAccInfoFromId(int id) throws AccountNotFoundException {
	
		AccountInfo accInfo = new AccountDAOImpl().getAccountInfoById(id);
		log.trace(accInfo.getAccountType());
		log.trace(accInfo.getAccountNumberId());
		log.trace(accInfo.getDebt());
		if (accInfo != null) { 
		return accInfo;
		} else
			throw new AccountNotFoundException("incorrect id" +id +"!");
		

	}
}
