package com.SummerCourse;

import java.util.HashSet;
import java.util.Scanner;

public class SummerCourse {

	
	public static void main(String[] args) {
		HashSet<Integer> studentId=new HashSet<>();
		studentId.add(101);
		studentId.add(102);
		studentId.add(103);
		studentId.add(104);
		
		String Course = "";
		System.out.println("WelCome To SummerCamp For Kids");
		
		System.out.println("Summer Course List");
		
		System.out.println("Music");
		System.out.println("Swimming");
		System.out.println("Computer Class");
		System.out.println("Cricket");
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter The Course Name:");
		String list = scan.nextLine();
		
		switch (list) {
		case "music":
			System.out.println("Music Course for Kids: RS.25000");
			break;

		case "swimming":
			System.out.println("Swimming Course for Kids: RS.20000");
			break;
			
		case "computerclass":
			System.out.println("computerclass Course for Kids: RS.25000");
			break;
			
		case "cricket":
			System.out.println("cricket Course for Kids: RS.20000");
			break;
		default:
			break;
		}
		
		System.out.println("Enter Student ID To Check He is Eligible Or Not");
		int studenId = scan.nextInt();
		System.out.println("As You Entered Student Id:"   +studenId);
		
		if (studentId.contains(studenId)) {
			System.out.println("Given This Id Student Eligible For Joining Course");
			
		}
		else
		{
			System.out.println("Given This Id Student Not Eligible For Joining Course");
		}
		}
}
