package com.ibm.datetimeapi;

import java.util.Calendar;
import java.util.Date;

public class DateTimeTraditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//traditional way of working with date 
		
		Date today=new Date();
		System.out.println(today);
        Date yesterday=new Date("2019/02/14 14:30:00");
        System.out.println(yesterday);
       ;
        
        Calendar calender=Calendar.getInstance();
        System.out.println(calender.getTimeInMillis());
        System.out.println(calender.getTime());
        System.out.println(calender.getWeekYear());
	}

}
