package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.excise5_backend;

public class Program {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		excise5_backend exbackend = new excise5_backend();
		while (true) {
			System.out.println("moi ban chon");
			System.out.println("1, them moi can bo");
			System.out.println("2, tim kiem theo ho ten");
			System.out.println("3, hien thi thong tin ve danh sach can bo");
			System.out.println("4, nhap vao ten cua can bo va delete can bo do");
			System.out.println("5, thoat khoi chuong trinh");
			int choosemenu = scanner.nextInt();
			switch (choosemenu) {

			case 1:
				exbackend.addStaff();
				break;
			case 2:
				exbackend.findByName();
				break;
			case 3:
				exbackend.prinLitStaff();
				break;
			case 4:
				exbackend.deleteByName();
				break;
			case 5:

				break;

			default:
				System.out.println("ban chon chu dung");
				break;
			}
		}
	}

}
