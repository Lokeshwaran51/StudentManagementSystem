package com.studentdatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 10001;

	Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student firstName:");
		this.firstName = sc.nextLine();
		System.out.println("Enter the Student lastName:");
		this.lastName = sc.nextLine();
		System.out.println("1-fresher \n2-Experienced \n3-Junior \n4-Senior \nEnter class level:");
		this.gradeYear = sc.nextInt();
		setStudentId();
	//	System.out.println("firstName:" + firstName + "\nlastname:" + lastName + "\ngradeYear:" + gradeYear
			//	+ "\nstudentId:" + studentId);

	}

	private void setStudentId() {
		id++;
		this.studentId = gradeYear + "" + id;

	}

	public void enroll() {
		do {
			System.out.println("Enter the course to enroll(Q for Quit)");
			Scanner s1 = new Scanner(System.in);
			String course = s1.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;

			} else {
				System.out.println("BREAK___");
				break;

			}
		} while (1 != 'Q');
	}

	public void viewBalance() {
		System.out.println("Your Tuition fee(Total/Pending) is:" + tuitionBalance);
	}

	public void payTuition() {
		viewBalance();
		System.out.println("Enter Your Payment:$");
		Scanner s2 = new Scanner(System.in);
		int payment = s2.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment" + payment);
		viewBalance();
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gradeYear=" + gradeYear
				+ ", studentId=" + studentId + ", courses=" + courses + ", tuitionBalance=" + tuitionBalance + "]";
	}
	 
		
	
}
