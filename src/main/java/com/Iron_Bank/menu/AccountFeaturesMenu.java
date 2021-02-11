package com.Iron_Bank.menu;

import org.apache.log4j.Logger;

import com.Iron_Bank.exception.AccountNotFoundException;
import com.Iron_Bank.model.AccountInfo;
import com.Iron_Bank.model.UserPaU;
import com.Iron_Bank.service.AccountServices;
import com.Iron_Bank.service.UserService;

public class AccountFeaturesMenu implements Menu {
	private static Logger log = Logger.getLogger(AccountFeaturesMenu.class);

	
	@Override
	public void display() {
		 int encounter =0;
		 MainMenu mm = new MainMenu();
		 LoginMenu lm = new LoginMenu();
		 AccountsMenu amu = new AccountsMenu();
		 AccountServices acse = new AccountServices();
		 UserService users = new UserService();
		 AccountInfo acin = new AccountInfo();
		 UserPaU userp = new UserPaU();
		 
		do {
			log.info("Here are your current optinion");
			log.info("");
			log.info("1 ). It will dump you back at MainMenu ");
			log.info("2 ). It will put you back at the login screen");
			log.info("3 ). It will allow you to go back to the account main menu");
			log.info("4 ). transfer between your accounts");
			log.info("5 ). transfer between someone else accounts and your account");
			log.info("6 ). Will print out your accounts info/ debt / debt");

			try {
				encounter = Integer.parseInt(sc.next());
			}catch(NumberFormatException e) {
				log.error(e);
			}
			switch (encounter) {
			case 1: log.info("You are going back to the main menu");
			mm.display();
			break;
			case 2: log.info("You are going back to the login screen");
			lm.display();
			break;
			case 3: log.info("You are going back to the account menu");
			amu.display();
			break;
			case 6: log.info("We will print out the account inforamtion");
			int num = lm.loginMenuforid();
				try {
					acin = acse.getAccInfoFromId(num);
				} catch (AccountNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			log.info(acin.getAccountType() +acin.getDebt() +acin.getAccountId());
			
			}
			
			
		}while(encounter != 1 | encounter != 2 | encounter !=3 );
	}

}
