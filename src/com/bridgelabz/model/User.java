/**
 * @author : Sachin Barpete
 * @purpose : User object for the register.jsp page
 */
package com.bridgelabz.model;

public class User {

	private String username;
	private String name;
	private Long mobileNo;
	private String email;
	private String address;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo2) {
		this.mobileNo = mobileNo2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", address=" + address + ", password=" + password + "]";
	}
}