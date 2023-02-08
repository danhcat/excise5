package com.vti.entity;

public class worked extends staff {

	private String rank;

	public worked() {
		super();
	}

	public worked(String rank, String fullName, int age, gender gender, String adress) {
		super(fullName, age, gender, adress);
		this.rank = rank;
	}

	public String getTask() {
		return rank;
	}

	public void setTask(String task) {
		this.rank = task;
	}

}
