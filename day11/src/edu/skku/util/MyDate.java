package edu.skku.util;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public void setYear(int year){
		if( year >2000 && year < 3000){
			this.year = year;
		}else{
			System.out.println("년도 오류");
		}
	}
	
	public void setMonth(int month){
		if(month >=1 && month <= 12){
			this.month=month;
		}else{
			System.out.println("월 오류");
		}
	}
	
	public int getYear(){
		return year;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getDay(){
		return day;
	}
	
	
	public void setDay(int day){
		if(day >=1 && day <=31){
			this.day = day;
		}else{
			System.out.println("일 오류");
		}
	}
	
	public MyDate(){}
	
	public MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public MyDate(int month, int day){
		this.year= 2017;
		this.month= month;
		this.day = day;
	}
	
	
	public String toString(){
		return year + "년" + month + "월" + day + "일";
	}
}
