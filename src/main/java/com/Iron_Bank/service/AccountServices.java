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
import com.Iron_Bank.model.AccountInfo;
import com.Iron_Bank.model.User;
import com.Iron_Bank.util.ConnectionUtil;

public class AccountServices {
	private static Logger log = Logger.getLogger(AccountServices.class);
	public AccountDAO accountDAO;

	public AccountServices() {
		accountDAO = new AccountDAOImpl();
	}

	public int accountCreation(double debtSaving, double debtChecking) {
		int count = 0;
		User user = new User();
		String dateofbirth = user.getDob();
		String checkingAccountId = null;
		LocalDate dob = LocalDate.parse(dateofbirth, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalDate curr = LocalDate.now();
		String savingAccountId = AccountServices.checkingSavingsid();
		if (ChronoUnit.YEARS.between(dob, curr) >= 18) {
			checkingAccountId = AccountServices.checkingSavingsid();
		}
		AccountInfo accounts = new AccountInfo(0, 0, savingAccountId, debtSaving, checkingAccountId, debtChecking);

		try (Connection connection = ConnectionUtil.getConnection()) {
			connection.setAutoCommit(false);

			count = accountDAO.creatAccountName(accounts, connection);

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

	public String lookUpSavingCheckingid() {
		return null;

	}
}
