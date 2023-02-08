package com.vti.entity;

public class staff {

	private String fullName;
	private int age;
	private gender gender;
	private String adress;

	public enum gender {
		male, female, unknow
	}

	public staff() {
		super();
	}

	public staff(String fullName, int age, gender gender, String adress) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.adress = adress;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public gender getGender() {
		return gender;
	}

	public void setGender(gender gender) {
		this.gender = gender;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
