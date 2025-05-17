package com.ty;

import java.util.Scanner;

public class Student {
public static void main(String[] args) {
	Scanner s1 =new Scanner(System.in);
	StudentInterface si =new StudentImp();
	while(true) {
		System.err.println("welcome to Student Database Management System");
		System.err.println("-------------------------------------------------");
		System.err.println("This is the option");
		System.err.println("1.Add Student\n 2.Delete Student\n3:Update Student\n4:GetAll Student\n5:GetStudent ByMarks Student\n6:DeleleAll Student\n7:Exit\n");
		System.err.println("Enter your choice");
		int ch =s1.nextInt();
		switch (ch) {
		case 1:
			si.addStudent();
			break;
		case 2:
			si.deleteStudent();
			break;
		case 3:
			si.updateStudent();
			break;
		case 4:
			si.getAllStudent();
			break;
		case 5:
			si.getStudentByMarks();
			break;
		case 6:
			si.deleteAllStudent();
			break;
		case 7:
			System.out.println("thank you");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice");
		}
		
	}
}
}
