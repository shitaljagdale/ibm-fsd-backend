package com.ibm.datetimeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class DatetimeJav8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatetimeJav8 date=new DatetimeJav8();
		date.dateFun();

	}
	public void dateFun() {
		Instant currentTime=Instant.now();
		System.out.println(currentTime);
		
		LocalDate today = LocalDate.now();                          //Today's date
		LocalDate birthday = LocalDate.of(1996, Month.JULY, 21);  //Birth date
		 System.out.println(birthday);
		Period p = Period.between(birthday, today);
		 
		//Now access the values as below
		//System.out.println(period.getDays());
		//System.out.println(period.getMonths());
		System.out.println(p.getYears());
		
	}

}
