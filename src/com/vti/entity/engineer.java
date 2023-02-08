package com.vti.entity;

public class engineer extends staff {

	private String speciallized;

	public engineer() {
		super();
	}

	public engineer(String fullName, int age, gender gender, String adress, String speciallized) {
		super(fullName, age, gender, adress);
		this.speciallized = speciallized;
	}

	public String getSpeciallized() {
		return speciallized;
	}

	public void setSpeciallized(String speciallized) {
		this.speciallized = speciallized;
	}

}
