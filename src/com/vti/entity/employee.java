package com.vti.entity;

public class employee extends staff {

	private String task;

	public employee() {

	}

	public employee(String task, String fullName, int age, gender gender, String adress) {
		super(fullName, age, gender, adress);
		this.task = task;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}
