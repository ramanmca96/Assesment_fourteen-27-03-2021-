package com.SummerCourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import com.SummerCourse.SummerCourseDetails.Course;

class SummerCourseDetails {
	
	// To be Initialize the Variable
	int studentId;
	String studentName;
	float Prize;
	Course Course;

	// Create a enum for course
	enum Course {
		PIONO, GUITOR, VIOLIN, CHESS, COMPUTER, CRICKERT, FOOTBALL, VOLLEYBALL, SWIMMINGCLASS
	}
	
	// Create a Constructor for a SummercourseDetails
	public SummerCourseDetails(int studentId, String studentName, Course Course, float Prize) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.Prize = Prize;
		this.Course = Course;
	}

}

class StudentInfo {

	public static void main(String[] args) {

		// Creating a HashSet
		HashSet<SummerCourseDetails> set = new HashSet<SummerCourseDetails>();
		
		
		
		//Pass The Value 
		SummerCourseDetails info = new SummerCourseDetails(181461, "Rishi", Course.CRICKERT, 12300.57f);
		SummerCourseDetails info1 = new SummerCourseDetails(181462, "Aadhi", Course.PIONO, 14230.80f);
		SummerCourseDetails info2 = new SummerCourseDetails(181463, "Bala", Course.COMPUTER, 10000.80f);
		SummerCourseDetails info3 = new SummerCourseDetails(181464, "Suresh", Course.FOOTBALL, 14003.80f);
		SummerCourseDetails info4 = new SummerCourseDetails(181465, "Owshy", Course.VIOLIN, 13000.80f);
		SummerCourseDetails info5 = new SummerCourseDetails(181470, "Zee", Course.VOLLEYBALL, 1000.80f);
		
		set.add(info);
		set.add(info1);
		set.add(info2);
		set.add(info3);
		set.add(info4);
		set.add(info5);

		List<SummerCourseDetails> list = new ArrayList<>(set);
		
		
		// Sorting By StudentID
		Collections.sort(list, new StudentIDComparator());

		for (SummerCourseDetails summerCourseDetails : list) {
			System.out.println("StudentID :" +"   " +summerCourseDetails.studentId + "   " +"StudentName:" + "   " +summerCourseDetails.studentName + "   "
					+"   " +"SummerCourseDetails:" +"   " +summerCourseDetails.Course + "   " +"SummerCoursePrize:" + "   "+summerCourseDetails.Prize);
		}
		
		System.out.println(" ");
		
		// Sorting By StudentName
		Collections.sort(list, new StudentNameComparator());
		for (SummerCourseDetails summerCourseDetails : list) {
			System.out.println("StudentID :" +"   " +summerCourseDetails.studentId + "   " +"StudentName:" + "   " +summerCourseDetails.studentName + "   "
					+"   " +"SummerCourseDetails:" +"   " +summerCourseDetails.Course + "   " +"SummerCoursePrize:" + "   "+summerCourseDetails.Prize);
		}
		System.out.println(" ");
		
		// Sorting By CoursePrize
		Collections.sort(list, new PrizeComparator());
		for (SummerCourseDetails summerCourseDetails : list) {
			System.out.println("StudentID :" +"   " +summerCourseDetails.studentId + "   " +"StudentName:" + "   " +summerCourseDetails.studentName + "   "
					+"   " +"SummerCourseDetails:" +"   " +summerCourseDetails.Course + "   " +"SummerCoursePrize:" + "   "+summerCourseDetails.Prize);
		}
	}
}
