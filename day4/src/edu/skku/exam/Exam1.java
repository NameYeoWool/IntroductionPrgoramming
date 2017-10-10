package edu.skku.exam;

public class Exam1 {
	
	public static void main(String[] args) {
		
		int dan, i ;
		
		for(dan = 2; dan < 10 ; dan++){
			System.out.println(dan+"´Ü");
			for(i = 1; i < 10 ;  i ++){
				System.out.println(dan + " * " + i + " = " +dan*i);
			}
		}
	}

}
