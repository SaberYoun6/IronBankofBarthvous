package com.Iron_Bank.menu;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.Iron_Bank.exception.NegativeNumberException;
import com.Iron_Bank.service.AccountServices;

public class AccountCreationMenu implements Menu {

	private static Logger log = Logger.getLogger(AccountCreationMenu.class);
	@Override
	public void display() {
		MainMenu mm = new MainMenu();
		AccountServices asrv = new AccountServices();
		double debtSaving = 0.00;
		int element=0;
		double debtChecking = 0.00;
		try {
			element= Integer.parseInt(sc.next());
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		log.trace(element);
		do {
			log.info("Here are your options");
			log.info("");
			log.info("1.) Going back one menu option");
			log.info("2.) Allows you to add money to your account");

			log.info("3.) Allows you to look up your saving account id and checking account id");
			switch (element) {
			case 1:
				log.info("booting you back to the menu without adding money to your newly created account");
				mm.display();
			case 2:
				int counter=0;
				while(counter > 2 ) {
					String accountype = sc.next();
				log.info("adding money to your account");
				try {
					debt = Double.parseDouble(sc.next());
				} catch (NumberFormatException e) {
					log.trace("Your number is not a number but a letter", e);
				} catch (NegativeNumberException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				log.info(debtSaving);
				Double num = 0.0;
				asrv.accountCreation( ,accountype,debt);
				counter++;
				} 
				if (counter > 2 ){
					return;
				} else {
					asrv.accountCreation(debtSaving, debtChecking);
					break;
				}
				
				
			case 3: log.info("Your id of the account based on the Username");
			}

		} while (element != 1);
	}
	public Double isnonNegative(double debt) throws NegativeNumberException{
		
		if (debt > 0) {
			throw new NegativeNumberException();
		}else {
			;
		}
		return debt;
		
	}

}
