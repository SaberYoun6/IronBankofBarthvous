package com.Iron_Bank.menu;

import org.apache.log4j.Logger;

import com.Iron_Bank.service.UserService;

public class MainMenu implements Menu {

	private static Logger log = Logger.getLogger(MainMenu.class);

	@Override
	public void display() {
		AccountCreationMenu acmu =new AccountCreationMenu();
		int element=0;
		do{
		log.info("Your option will be displayed below");
		log.info("");
		log.info("1.) Will exit the program");
		log.info("2). Will allow your to create a new user");
		log.info("3). Will allow you to login of a users account");
		log.info("4). Will allow you to login under any employee");
		
		try {
		element=Integer.parseInt(sc.next());
		}catch(NumberFormatException e) {
		}
		log.trace(element);
		switch(element){
		case 1: log.info("You are going to be exiting the program");
		break;
		case 2: log.info("Creating a new user");
		UserCreationMenu ucm = new UserCreationMenu();
		ucm.display();
		break;
		case 3: log.info("You will be allowed to access that user account");
		break;
		case 4: log.info("Will allow you to access the employee ");
		break;
		default : log.info("There are no more option but the four above you can only enter 1-4");
		}
		
		}while(element!=1);
		log.info("goodbye");
		// TODO Auto-generated method stub

	}

}
