package com.Iron_Bank.menu;

import org.apache.log4j.Logger;

public class AccountsMenu implements Menu {
	private static Logger log = Logger.getLogger(AccountsMenu.class);

	@Override
	public void display() {
		// TODO Auto-generated method stub
		AccountFeaturesMenu afmu = new AccountFeaturesMenu();
		AccountCreationMenu acmu = new AccountCreationMenu();
		LoginMenu lm = new LoginMenu();
		MainMenu mm = new MainMenu();
		int element = 0;
		do {
			log.info("Here are your current optinion");
			log.info("");
			log.info("1 ). It will dump you back at MainMenu ");
			log.info("2 ).It will put you back at the login screen");
			log.info("3 ). It will allow you create an account");
			switch (element) {

			case 1:
				log.info(" We will be put you back to the users login ");
				mm.display();
			case 2:
				log.info("We will be put you back at the the main menu");
				lm.display();

			case 3:
				log.info("You will be allowed to create a new account");
				acmu.display();
				
			case 4:
				log.info("You can have access to the accounts features");
				afmu.display();
			}

		} while (element != 1 | element != 2);

	}

}
