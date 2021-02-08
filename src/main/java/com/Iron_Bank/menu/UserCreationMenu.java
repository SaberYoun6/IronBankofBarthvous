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

		log.trace("Please enter your firstname");
		String givenname = sc.next();
		log.trace(givenname);

		log.trace("Please enter your lastname");
		String surname = sc.next();
		log.trace(surname);

		log.trace("Please enter your username");
		String usersnames = sc.next();
		log.trace(usersnames);
		int counter = 0;
		String passwd;
		String password;
		boolean passwordlineups;
		do {
			log.trace("Please enter a password");
			passwd = sc.next();
			log.trace(passwd);

			log.trace("Please renter the same password");
			password = sc.next();
			log.trace(password);

			if (password.equals(passwd)) {
				passwordlineups = true;

			} else {
				passwordlineups = false;
			}
			counter++;
			log.trace(counter);
			log.trace(passwordlineups);

		} while (passwordlineups || counter < 4);
		if (counter == 4 && (passwordlineups == false)) {
			return;
		}
		LocalDateTime date = LocalDateTime.now();
		String dateofcreation = date.format(DateTimeFormatter.ISO_DATE_TIME);
		log.info(dateofcreation);
		
		String lastlogin = dateofcreation;
		//date of birth
		LocalDateTime dateofbirth = null ;
		int year, month, day =0;
		log.info("please input your date of brith in yyyy-mm-dd");
		try {
			year = Integer.parseInt(sc.next());
			month = Integer.parseInt(sc.next());
			day = Integer.parseInt(sc.next());
			dateofbirth = LocalDateTime.of(year, month, day,0,0);  
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

		UserService.usernamesCreationandPasswordsService(usersnames, password);
		
		
		UserService.usersInfoCreationService(givenname, surname, email, ssn,dob,dateofcreation, lastlogin);

	}

}
