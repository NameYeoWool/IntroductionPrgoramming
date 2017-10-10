package edu.skku.java6;

public class Araay2Test1 {
	
	public static void main(String[] args) {
		int[][] s = new int[3][5];
		s[0][0] = 10;
		s[1][2] = 20;
		s[2][3] = 30;
		s[2][2] = 50;
		
		for(int row = 0 ; row < s.length; row++){
			int sum = 0;
			for(int col=0; col< s[row].length; col++){
				System.out.print(s[row][col]+" ");
				sum = sum + s[row][col];
			}
			System.out.println(sum);
		}
		
		
	}

}
