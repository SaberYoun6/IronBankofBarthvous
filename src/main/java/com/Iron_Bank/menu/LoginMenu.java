package com.Iron_Bank.menu;

import org.apache.log4j.Logger;


import com.Iron_Bank.service.UserService;

public class LoginMenu implements Menu {
	protected String username;

	private static Logger log = Logger.getLogger(LoginMenu.class);

	@Override
	public void display() {
		MainMenu mm = new MainMenu();
		AccountsMenu amu = new AccountsMenu();
		UserService uss = new UserService();
		int elements = 0;
		do {
			log.info("Your choices are as follows");
			log.info("");
			log.info("1 ). go back one page");
			log.info("2 ). go and login to your account");
			try {
				elements = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				log.error(e);
			}
			switch (elements) {
			case 1:
				log.info("You are being returned to the main menu");
				mm.display();
				break;
			case 2:
				log.info("Login requires a username and password");

				int counter = 0;

				String passwords =null; 
				do {
					this.username= sc.nextLine();
					passwords = sc.nextLine();
					if (uss.checkingpasswordLoginInfo(username, passwords)) {
						amu.display();
					} else {
					}
					counter++;
				} while (counter < 3);
			default:
				log.info(" there are no futher options so go back back up to the start of this menu");
			}

		} while (elements != 1);
	}

	public int loginMenuforid() {
		UserService uss = new UserService();
		int number = uss.getUserId(this.username);

		return number;
	}

}
