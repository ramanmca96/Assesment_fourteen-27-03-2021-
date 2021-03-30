package com.SummerCourse;

import java.util.Comparator;

public class PrizeComparator  implements Comparator<SummerCourseDetails>{

	
	@Override
	public int compare(SummerCourseDetails o1, SummerCourseDetails o2) {
		SummerCourseDetails price1=(SummerCourseDetails)o1;
		SummerCourseDetails price2=(SummerCourseDetails)o2;
		
		//Compare With the Prize 
		if (price1.Prize == price2.Prize) {
			return 0;
		}

		else if (price1.Prize < price2.Prize) {
			return 1;
		}

		else {
			return -1;
		}
	}

}
