package com.Iron_Bank.menu;

import org.apache.log4j.Logger;

public class AccountFeaturesMenu implements Menu {
	private static Logger log = Logger.getLogger(AccountFeaturesMenu.class);

	@Override
	public void display() {
		 int encounter =0;
		 MainMenu mm = new MainMenu();
		 LoginMenu lm = new LoginMenu();
		 AccountsMenu amu = new AccountsMenu();
		 
		 
		do {
			encounter = Integer.parseInt(sc.next());
			log.info("Here are your current optinion");
			log.info("");
			log.info("1 ). It will dump you back at MainMenu ");
			log.info("2 ). It will put you back at the login screen");
			log.info("3 ). It will allow you to go back to the account main menu");
			
			log.info("4 ). transfer between your accounts");
			log.info("5 ). transfer between someone else accounts and your account");
			log.info("5 .) Will print out your accounts info/ debt / debt");
			switch (encounter) {
			case 1: log.info("You are going back to the main menu");
			mm.display();
			case 2: log.info("You are going back to the login screen");
			lm.display();
			case 3: log.info("You are going back to the account menu");
			amu.display();
			
			}
			
			
		}while(encounter != 1 | encounter != 2 | encounter !=3 );
	}

}
