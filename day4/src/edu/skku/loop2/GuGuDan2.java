package edu.skku.loop2;

public class GuGuDan2 {
	public static void main(String[] args) {
		
		int dan;
		int i;
		//label ... ������� ����(������ ��ħ)
		ABC:
		for (dan = 2; dan < 10; dan++) {
			for (i = 1; i < 10; i++) {
				// break label;
				if(dan*i >= 30) break ABC; 
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
			System.out.println();
		}

	}// end main
	
}// end class
