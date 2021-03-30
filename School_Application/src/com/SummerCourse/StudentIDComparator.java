package com.SummerCourse;

import java.util.Comparator;

public class StudentIDComparator implements Comparator<SummerCourseDetails> {

	@Override
	public int compare(SummerCourseDetails o1, SummerCourseDetails o2) {
		SummerCourseDetails std1 = (SummerCourseDetails) o1;
		SummerCourseDetails std2 = (SummerCourseDetails) o2;
		
		// Compare With the Student ID
		if (std1.studentId == std2.studentId) {
			return 0;
		}

		else if (std1.studentId > std2.studentId) {
			return 1;
		}

		else {
			return -1;
		}

	}

}
