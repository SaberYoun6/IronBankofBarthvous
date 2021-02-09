package com.Iron_Bank.menu;

import org.apache.log4j.Logger;

import com.Iron_Bank.service.UserService;


public class LoginMenu implements Menu  {

	private static Logger log = Logger.getLogger(LoginMenu.class);
	@Override
	public void display() {
		MainMenu mm = new MainMenu();
		AccountsMenu amu = new AccountsMenu();
		UserService uss = new UserService();
		int elements =0;
		do {
			log.info("Your choices are as follows");
			log.info("");
			log.info("1). go back one page");
			log.info("2). go and login to your account");
			switch(elements) {
			case 1:
				log.info("You are being returned to the main menu");
				mm.display();
				break;
			case 2: log.info("Login requires a username and password");
			String username = sc.next();
			int counter =0;
			String passwords = null;
			do {
			if (uss.checkingUsernameLoginInfo(username)) {
				passwords = sc.next();
			}else if (uss.checkingpasswordLoginInfo(username, passwords)) {
				amu.display();
				break;
			} else { 
				counter++;
			}
			}while(counter < 3);
			default: log.info(" there are no futher options so go back back up to the start of this menu");
			}
			
		}while(elements != 1);
	}

}
