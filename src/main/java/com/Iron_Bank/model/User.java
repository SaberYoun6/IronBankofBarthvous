package com.Iron_Bank.model;


public class User {

	
	private int userId;
	private String givenname;
	private String surname;
	private String email;
	private String ssn;
	private String dob;
	private String dateofcreation;
	private String lastlogin;

	public User() {
		super();
	}
	
	public User(int userId,String givenname,String surname ) {
		super();
		this.userId =userId;
		this.givenname =givenname;
		this.surname=surname;
		
	}
	public User(int userId ,String givename, String surname, String email,String ssn) {
		this(userId,givename,surname);
		this.email= email;
		this.ssn = ssn;
	}
	public User(int userId,String givenname, String surname, String email, String ssn,String dob ,String lastlogin) {
		this(userId,givenname,surname,email,ssn);
		this.dob=dob;
		this.lastlogin= lastlogin;
	}
	public User(int userId ,String givenname , String surname, String email,String ssn, String dob, String dateofcreation, String lastlogin ) {
		this(userId,givenname,surname,email,ssn,dob,lastlogin);
		this.dateofcreation=dateofcreation;
	}
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDateofcreation() {
		return dateofcreation;
	}

	public void setDateofcreation(String dateofcreation) {
		this.dateofcreation = dateofcreation;
	}

	public String getLastlogin() {
		return lastlogin;
	}

	public void setLastlogin(String lastlogin) {
		this.lastlogin = lastlogin;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getGivenname() {
		return givenname;
	}
	public void setGivenname(String givenname) {
		this.givenname = givenname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public User getGivenName() {
		User user = new User();
		return user;
	}

}
