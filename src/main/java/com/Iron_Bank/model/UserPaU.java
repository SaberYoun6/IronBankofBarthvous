package com.Iron_Bank.model;

public class UserPaU {

	public UserPaU() {
		super();
	}
	public UserPaU(int users_id ) {
		this.users_id = users_id;
	}
	public UserPaU(String usersname) {
		this.usersname=usersname;
		
	}
	public UserPaU(String usersname, String password) {
		this(usersname);
		this.password= password;
	}
	public UserPaU(int users_id, String usersname, String password) {
		this(users_id);
		this.usersname= usersname;
		this.password= password;
	}
	
	private int users_id;
	private String usersname;
	private String password;

	public int getUsers_id() {
		return users_id;
	}

	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}

	public String getUsersname() {
		return usersname;
	}

	public void setUsersname(String usersname) {
		this.usersname = usersname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
