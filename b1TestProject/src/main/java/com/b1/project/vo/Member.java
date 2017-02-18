package com.b1.project.vo;

public class Member {
	private String id;
	private String password;
	private String name;
	private String email;
	private String division;
	private String num;
	private String address;

	public Member() {
	}

	public Member(String id, String password, String name, String email, String division, String num,
			String address) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.division = division;
		this.num = num;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", email=" + email + ", division="
				+ division + ", num=" + num + ", address=" + address + "]";
	}
	
}
