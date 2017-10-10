package edu.skku.loop2;

public class GuGuDan {
	public static void main(String[] args) {

		int dan;
		int i;
		for (dan = 2; dan < 10; dan++) {
			for (i = 1; i < 10; i++) {
				if(dan*i >= 30) break;
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
			System.out.println();
		}

	}// end main
	
}// end class
