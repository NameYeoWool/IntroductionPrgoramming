package bstSorting;

import java.util.Scanner;

public class BstInorder {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*int n = scan.nextInt();
		
		int[] arr = new int [n];
		for(int i = 0 ; i <arr.length;i++){
			arr[i] = scan.nextInt();
		}
		*/
		
		
		// 중간 값이 맨 앞
		//int[] arr = {20, 10, 25, 5, 16, 27, 13, 15};
		
		//중간값이 가운데
		//int[] arr = {10, 25, 5, 27,20,  16, 13, 15};
		
		// 중간값이 마지막
		int[] arr = {10, 25,   16, 13, 15,5, 27,20,};
		
		sort(arr);
		
	}
	
	public static void sort(int[] arr) {
		TreeNode root = new TreeNode();
		root.setData(arr[0]);;
		
		for (int i = 1 ; i < arr.length ; i++){
			root.insert(arr[i]);
		}
		root.inorder();
	}
	
	
}//end class
