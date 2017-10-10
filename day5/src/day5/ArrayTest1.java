package day5;

public class ArrayTest1 {

	public static void main(String[] args) {
		int k;
		k = 10;
		int[] ks = new int[10];
		ks[0] = 50;
		ks[1] = 60;
		ks[2] = 88;
		ks[3] = 66;
		ks[4] = 93;
		
		System.out.println("배열의 길이:" + ks.length);

		for (int i = 0; i < ks.length ; i++) {
			System.out.println(ks[i]);
		}
	}

}
