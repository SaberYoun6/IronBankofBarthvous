package com.Iron_Bank.menu;

import org.apache.log4j.Logger;

import com.Iron_Bank.service.UserService;

public class UserCreationMenu implements Menu {
	private static Logger log = Logger.getLogger(UserCreationMenu.class);

	@Override
	public void display() {
		UserService uss = new UserService();
		MainMenu mm = new MainMenu();
		String password = null;
		String usersnames = null;
		String passwd = null;
		boolean passwordlineups;
		int element = 0;
		/*
		 * 
		 * 
		*/
		
		do {
			try {
			element = Integer.parseInt(sc.next());
			}catch (NumberFormatException e) {
				log.trace(e);
			}
			log.info("Here are you options for user creation menu");
			log.info(" ");
			log.info("1 ). will return you to the main Menu");
			log.info("2 ). Will allow you to create a account");
			
			switch (element) {
			case 1:
				log.info(" You are going  back to mainmenu");
				mm.display();
			case 2:
				log.info("Complete accounts creation");
				log.info("Please enter your username");
				usersnames = sc.next();
				log.trace(usersnames);
				int counter = 0;
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
					mm.display();
				}
				/*
			case 3:
				log.info("Just creating log-able information for today");
				log.info("Please enter your username");
				usersnames1 = sc.next();
				log.trace(usersnames1);
				int counter1 = 0;
				do {
					log.info("Please enter a password");
					passwd1 = sc.next();
					log.trace(passwd1);

					log.info("Please renter the same password");
					password1 = sc.next();
					log.trace(password1);

					if (password1.equals(passwd1)) {
						passwordlineups1 = true;
						break;

					} else {
						passwordlineups1 = false;
					}
					counter1++;
					log.info(counter1);
					log.info(passwordlineups1);

				} while (passwordlineups1 | counter1 < 4);
				if (counter1 == 4 && (passwordlineups1 == false)) {
					return;
				} else {
					uss.usernamesCreationandPasswordsService(usersnames1, password1);
					
				}
				break;
			case 4:
				log.info(
						"I already have any username and password created just want to login in and create a new account");
				counter1 = 0;
				do {
					log.info("Please enter your users info");
					userString = sc.next();
					log.trace(userString);
					log.info("Please enter your password");
					passString = sc.next();
					log.trace(passString);
					if (uss.checkingUsernameLoginInfo(userString)
							& uss.checkingpasswordLoginInfo(userString, passString)) {
						break;
					}
					counter1++;
				} while (counter1 < 3);
				if (uss.checkingUsernameLoginInfo(userString) & uss.checkingpasswordLoginInfo(userString, passString)
						& counter1 != 3) {
					acmu.display();
				} else {
					mm.display();
				}*/
			default:
				log.info("there are no other options");
				break;
			}
		} while (element != 1);
	}
}
/*Additional features to be add later
 * log.trace("Please enter your firstname"); String givenname = sc.next();
 * log.trace(givenname);
 * 
 * log.trace("Please enter your lastname"); String surname = sc.next();
 * log.trace(surname); LocalDateTime date = LocalDateTime.now(); String
 * dateofcreation = date.format(DateTimeFormatter.ISO_DATE_TIME);
 * log.info(dateofcreation);
 * 
 * String lastlogin = dateofcreation; // date of birth LocalDateTime dateofbirth
 * = null; int year, month, day = 0;
 * log.info("please input your date of brith in yyyy-mm-dd"); try { year =
 * Integer.parseInt(sc.next()); month = Integer.parseInt(sc.next()); day =
 * Integer.parseInt(sc.next()); dateofbirth = LocalDateTime.of(year, month, day,
 * 0, 0); } catch (IndexOutOfBoundsException e) { log.trace(e); } catch
 * (NumberFormatException e) { log.trace(e); } log.trace(dateofbirth);
 * 
 * String dob = dateofbirth.format(DateTimeFormatter.ISO_DATE_TIME);
 * log.info(dob);
 * 
 * log.trace("Please enter your email"); String email = sc.next();
 * log.trace(email);
 * 
 * log.trace("Please enter your Social Secruity Number if). American Citizen");
 * String ssn = sc.next(); log.trace(ssn);
 * 
 * uss.usersInfoCreationService(givenname, surname, email, ssn, dob,
 * dateofcreation, lastlogin);
 */