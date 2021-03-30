package com.SummerCourse;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<SummerCourseDetails> {

	@Override
	public int compare(SummerCourseDetails o1, SummerCourseDetails o2) {
		SummerCourseDetails stname=(SummerCourseDetails)o1;
		SummerCourseDetails stname1=(SummerCourseDetails)o2;
		
		//Compare With The Student Name
		return stname.studentName.compareTo(stname1.studentName);
	}

}
