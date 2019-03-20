package com.ibm.Enum;

public class EnumDemo {

	public enum WeekDays {
		
		MONDAY{
			public String getDisplayName() {
				return "Monday";
			}
		},THUSDAY{
			public String getDisplayName() {
				return "Thusday";
			}
		},WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
		
		private int dayIndex;
		
		private WeekDays() {
			System.out.println("Enum constructor");
		}
		private WeekDays(Integer dayIndex) {
			System.out.println("Enum constructor");
			this.dayIndex=dayIndex;
		}
		public String getDisplayName() {
			return "Enum method test";
		}
		public int getDayIndex() {
			// TODO Auto-generated method stub
			
			return this.dayIndex;
		}
		
	    	
	};
	
	public static void main(String[] args) {
		String day="MONDAY";
		//String comparistion
		if(WeekDays.MONDAY.toString()==day) {
			System.out.println("Given day is monday");
		}
		//enum compare
		if(WeekDays.MONDAY==WeekDays.valueOf(day)) {
			System.out.println("Given day is monday");
		}
		
		//get all enum values
		for(Object weekday:WeekDays.values()) {
			System.out.println(weekday);
		}
		System.out.println(WeekDays.MONDAY.getDisplayName());
		System.out.println(WeekDays.THUSDAY.getDisplayName());
		System.out.println(WeekDays.FRIDAY.getDisplayName());
		
		System.out.println(WeekDays.MONDAY.getDayIndex());
		System.out.println(WeekDays.FRIDAY.getDayIndex());
	}
	}
	

