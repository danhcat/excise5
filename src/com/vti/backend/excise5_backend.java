package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.employee;
import com.vti.entity.engineer;
import com.vti.entity.staff;
import com.vti.entity.staff.gender;
import com.vti.entity.worked;

public class excise5_backend {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<staff> staffList;

// phương thức thêm mới nhân viên : addStaff();
	public void addStaff() {
// chia ra các trường hợp
		// 1. thêm worker
		// 2. thêm employee
		// 3. thêm engineer
		System.out.println("bạn muốn thêm đối tượng nào?");

		System.out.println("moi ban chon");
		System.out.println("1, thêm engineer");
		System.out.println("2, thêm worker");
		System.out.println("3, thêm employee");

		int choose = scanner.nextInt();
		switch (choose) {

		case 1:
			System.out.println("Nhap vao ten engineer: ");
			String nameengineer = scanner.next();
			System.out.println("nhap vao tuoi engineer: ");
			int ageEngineer = scanner.nextInt();
			System.out.println("nhap vao gioi tinh engineer 1: male, 2: female, 3: unknow");
			int genderEngineer = scanner.nextInt();
			gender genderName1 = null;
			switch (genderEngineer) {
			case 1:
				genderName1 = gender.male;
				break;
			case 2:
				genderName1 = gender.female;
				break;
			case 3:
				genderName1 = gender.unknow;
				break;
			}
			System.out.println("nhap vao dia chi: ");
			String adress = scanner.next();
			System.out.println("nhap vao chuyen nganh engineer: ");
			String specialzedEngineer = scanner.next();
			engineer engineer1 = new engineer(nameengineer, ageEngineer, genderName1, adress, specialzedEngineer);

			System.out.println(nameengineer + ageEngineer + genderName1 + adress + specialzedEngineer);
			break;
		case 2:
			System.out.println("Nhap vao ten Worker: ");
			String nameWorker = scanner.next();
			System.out.println("nhap vao tuoi Worker: ");
			int ageWorker = scanner.nextInt();
			System.out.println("nhap vao gioi tinh Worker 1: male, 2: female, 3: unknow");
			int genderWorker = scanner.nextInt();
			gender genderWorker1 = null;
			switch (genderWorker) {
			case 1:
				genderWorker1 = gender.male;
				break;
			case 2:
				genderWorker1 = gender.female;
				break;
			case 3:
				genderWorker1 = gender.unknow;
				break;
			}
			System.out.println("nhap vao dia chi: ");
			String adressWorker = scanner.next();
			System.out.println("nhap vao chuyen nganh Worker: ");
			String rank = scanner.next();
			worked Worker1 = new worked(nameWorker, rank, ageWorker, genderWorker1, adressWorker);

			System.out.println(
					nameWorker + " \n" + ageWorker + " \n" + genderWorker1 + " \n" + adressWorker + " \n" + rank);

			break;
		case 3:
			System.out.println("thêm Employee");
			System.out.println("nhap vao ten Employee");
			String nameEmployee = scanner.next();
			System.out.println("nhap vao tuoi Employee : ");
			int ageEmployee = scanner.nextInt();
			System.out.println("nhap vao gioi tinh Employee 1: male, 2: female, 3: unknow");
			int genderEmployee = scanner.nextInt();
			gender genderEmployee1 = null;
			switch (genderEmployee) {
			case 1:
				genderEmployee1 = gender.male;
				break;
			case 2:
				genderEmployee1 = gender.female;
				break;
			case 3:
				genderEmployee1 = gender.unknow;
				break;
			}
			System.out.println("nhap vao dia chi: ");
			String adressEmployee = scanner.next();
			System.out.println("nhap vao task: ");
			String task = scanner.next();
			employee employee1 = new employee(task, nameEmployee, ageEmployee, genderEmployee1, adressEmployee);

			System.out.println(nameEmployee + " \n" + ageEmployee + " \n" + genderEmployee1 + " \n" + adressEmployee
					+ " \n" + task);
			break;

		}
	}

// phương thức tìm kiếm theo tên nhân viên : findByName()
	public void findByName() {

	}

// phương thức hiển thị danh sách nhân viên prinliststaff()
	public void prinLitStaff() {

	}

// phương thức xóa nhân viên: deleteByName()
	public void deleteByName() {

	}

}
