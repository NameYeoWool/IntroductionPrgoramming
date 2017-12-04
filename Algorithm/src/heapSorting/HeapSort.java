package heapSorting;

import java.util.Scanner;

public class HeapSort {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*int n = scan.nextInt();
		
		int[] arr = new int [n];
		for(int i = 0 ; i <arr.length;i++){
			arr[i] = scan.nextInt();
		}
		*/
		int n = 8;
		int[] arr = {10 ,6, 5, 13, 7, 9, 8, 3};
		
		int[] brr = sort(arr,n);
		
		//출력
		
		for(int i =  brr.length-1 ; i >=0;i--){
			System.out.print(brr[i]+ " ");
		}
	}
	
	
	public static int[] sort(int[] arr,int n){
		Heap heap = new Heap();
		int[] brr =  new int[n];
		
		for(int i= 0 ; i < arr.length; i++){
			heap.insert(arr[i]);
		}
		
		for(int i = 0 ; i < arr.length; i++){
			brr[i] = heap.delete();
		}
		
		//출력
		
		return brr;
	}
		/*private int[] element;
		private Heap heap;
		public HeapSort(int[] list){
			element = list;
			heap = new Heap()
		}
		
		public void Sort(){
			for(int i = 0 ; i <element.length; i++){
				
			}
		}	*/
		
}

