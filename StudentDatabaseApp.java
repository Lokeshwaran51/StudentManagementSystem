package com.studentdatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Student obj1 = new Student(); obj1.enroll(); obj1.payTuition();
		 * obj1.viewBalance();
		 */
		System.out.println("Enter the number of new students to enroll:");
		Scanner s3 = new Scanner(System.in);
		int noOfStudents = s3.nextInt();
		Student[] student = new Student[noOfStudents];
		for (int n = 0; n < noOfStudents; n++) {
			student[n] = new Student();
			student[n].enroll();
			student[n].viewBalance();
			student[n].payTuition();
		}
		for (int n = 0; n < noOfStudents; n++) {
			System.out.println(student[n].toString());
		}

	}

}
