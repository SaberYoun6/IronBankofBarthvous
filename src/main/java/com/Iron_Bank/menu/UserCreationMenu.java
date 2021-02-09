package com.Iron_Bank.menu;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;

import com.Iron_Bank.service.UserService;

public class UserCreationMenu implements Menu {
	private static Logger log = Logger.getLogger(UserCreationMenu.class);

	@Override
	public void display() {
		UserService uss = new UserService();
		AccountCreationMenu acmu = new AccountCreationMenu();
		MainMenu mm = new MainMenu();
		int element =0;
		do {
		/*
		log.trace("Please enter your firstname");
		String givenname = sc.next();
		log.trace(givenname);

		log.trace("Please enter your lastname");
		String surname = sc.next();
		log.trace(surname);
		*/
		element= Integer.parseInt(sc.next());

		switch(element) {
		case 1:
			log.info("going  back to mainmenu");
			mm.display();
			break;
		case 2: log.info("Complete accounts creation");		
		log.info("Please enter your username");
		String usersnames = sc.next();
		log.trace(usersnames);
		int counter = 0;
		String passwd;
		String password;
		boolean passwordlineups;
		do {
			log.info("Please enter a password");
			passwd = sc.next();
			log.trace(passwd);

			log.info("Please renter the same password");
			password = sc.next();
			log.trace(password);

			if (password.equals(passwd)) {
				passwordlineups = true;
				break;

			} else {
				passwordlineups = false;
			}
			counter++;
			log.info(counter);
			log.info(passwordlineups);
			acmu.display();

		} while (passwordlineups | counter < 4);
		if (counter == 4 && (passwordlineups == false)) {
			return;
		} else {
			uss.usernamesCreationandPasswordsService(usersnames, password);
		}
		
		case 3:log.info("Just creating log-able information for today");
		log.info("Please enter your username");
		String usersnames = sc.next();
		log.trace(usersnames);
		int counter = 0;
		String passwd;
		String password;
		boolean passwordlineups;
		do {
			log.info("Please enter a password");
			passwd = sc.next();
			log.trace(passwd);

			log.info("Please renter the same password");
			password = sc.next();
			log.trace(password);

			if (password.equals(passwd)) {
				passwordlineups = true;
				break;

			} else {
				passwordlineups = false;
			}
			counter++;
			log.info(counter);
			log.info(passwordlineups);

		} while (passwordlineups | counter < 4);
		if (counter == 4 && (passwordlineups == false)) {
			return;
		} else {
			uss.usernamesCreationandPasswordsService(usersnames, password);
		}
		break;
		case 4:log.info("I already have any username and password created just want to login in and create a new account");
		counter=0;
		do {
		log.info("Please enter your users info");
		String userString= sc.next();
		log.trace(userString);
		log.info("Please enter your password");
		String passString = sc.next();
		if (uss.checkingUsernameLoginInfo(userString) & uss.checkingpasswordLoginInfo(userString, passString)) {
			break;
		}
		counter++;
		} while(counter <3);
			if (uss.checkingUsernameLoginInfo(userString) & uss.checkingpasswordLoginInfo(userString, passString)& count != 3 ){
				acmu.display();
			}
			else { 
		break;
		
			default: log.info("there are no other options");
				break;
		}
		}while(element != 1);
		/*
		LocalDateTime date = LocalDateTime.now();
		String dateofcreation = date.format(DateTimeFormatter.ISO_DATE_TIME);
		log.info(dateofcreation);

		String lastlogin = dateofcreation;
		// date of birth
		LocalDateTime dateofbirth = null;
		int year, month, day = 0;
		log.info("please input your date of brith in yyyy-mm-dd");
		try {
			year = Integer.parseInt(sc.next());
			month = Integer.parseInt(sc.next());
			day = Integer.parseInt(sc.next());
			dateofbirth = LocalDateTime.of(year, month, day, 0, 0);
		} catch (IndexOutOfBoundsException e) {
			log.trace(e);
		} catch (NumberFormatException e) {
			log.trace(e);
		}
		log.trace(dateofbirth);

		String dob = dateofbirth.format(DateTimeFormatter.ISO_DATE_TIME);
		log.info(dob);

		log.trace("Please enter your email");
		String email = sc.next();
		log.trace(email);

		log.trace("Please enter your Social Secruity Number if). American Citizen");
		String ssn = sc.next();
		log.trace(ssn);

		uss.usersInfoCreationService(givenname, surname, email, ssn, dob, dateofcreation, lastlogin);
		*/
	}

}