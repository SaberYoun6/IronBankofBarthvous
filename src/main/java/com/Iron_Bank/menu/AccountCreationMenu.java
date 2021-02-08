package com.Iron_Bank.menu;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.apache.log4j.Logger;

import com.Iron_Bank.model.AccountInfo;
import com.Iron_Bank.model.User;
import com.Iron_Bank.service.AccountServices;

public class AccountCreationMenu implements Menu {

	private static Logger log = Logger.getLogger(AccountCreationMenu.class);
	private AccountServices asrv = new AccountServices();
	private MainMenu mm = new MainMenu();
	@Override
	public void display() {
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
				User user = new User();
				String dateofbirth=user.getDob();
				LocalDate dob = LocalDate.parse(dateofbirth,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				LocalDate  curr= LocalDate.now();
				int counter=0;
				if(counter > 2 ) {
				log.info("adding money to your account");
				try {
					debtSaving = Double.parseDouble(sc.next());
					if (ChronoUnit.YEARS.between(dob, curr) >= 18) {
					debtChecking = Double.parseDouble(sc.next());
					}
				} catch (NumberFormatException e) {
					log.trace("Your number is not a number but a letter", e);
				}
				log.info(debtSaving);
				if (ChronoUnit.YEARS.between(dob, curr) >= 18) {
				log.info(debtChecking);
				}
				asrv.accountCreation(debtSaving, debtChecking);
				counter++;
				}else {
					return;
				}
				asrv.accountCreation(debtSaving, debtChecking);
				break;
			case 3: log.trace("");
			}

		} while (element != 1);

	}
	private Period Period(LocalDate dob, LocalDate curr) {
		// TODO Auto-generated method stub
		return null;
	}

}
