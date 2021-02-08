package com.Iron_Bank.menu;

import org.apache.log4j.Logger;

import com.Iron_Bank.service.UserService;

public class MainMenu implements Menu {

	private static Logger log = Logger.getLogger(MainMenu.class);

	@Override
	public void display() {
		int element=0;
		do{
		log.trace("Your option will be displayed below");
		log.debug("");
		log.trace("1.) Will exit the program");
		log.trace("2). Will allow your to create a new user");
		log.trace("3). Will allow you to login of a users account");
		log.trace("4). Will allow you to login under any employee");
		
		try {
		element=Integer.parseInt(sc.next());
		}catch(NumberFormatException e) {
		}
		log.trace(element);
		switch(element){
		case 1: log.trace("You are going to be exiting the program");
		break;
		case 2: log.trace("Creating a new user");
		UserCreationMenu ucm = new UserCreationMenu();
		ucm.display();
		log.trace("Now allowing the user to create a Bank account");
		AccountCreationMenu acm = new AccountCreationMenu();
		acm.display();
		break;
		case 3: log.trace("You will be allowed to access that user account");
		break;
		case 4: log.trace("Will allow you to access the employee ");
		break;
		default : log.trace("There are no more option but the four above you can only enter 1-4");
		}
		
		}while(element!=1);
		log.trace("goodbye");
		// TODO Auto-generated method stub

	}

}
