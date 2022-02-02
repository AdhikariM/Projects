package com.urs.bean;

public class User {
	int id;
	String fname;
	String lname;
	String email;
	String pw;
	public User(int id, String fname, String lname, String email, String pw) {
		
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	
		this.email = email;
		this.pw = pw;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	

}
