package edu.skku.method;

public class MethodTest2 {
	
	public static void main(String[] args) {
		int[] su = {45,76,2,6,786,87,34,54,56,63};
		int total = sum(su);
		System.out.println("합계:"+total);
		avg(total,su.length);
		max(su);
		
	}
	
	public static int sum(int[] su){
		int total = 0 ;
		for(int i = 0 ;  i <su.length; i++){
			total = total + su[i];
			//total += su[i]   위랑 동일 의미
		}
		//System.out.println("합계:"+total);
		return total;
	}
	
	public static void avg(int s,int len){
		System.out.println((double)s/len);
	}
	public static void max(int[] s){
		int m = s[0];
		for(int i = 1; i < s.length; i++){
			if(m < s[i]) m = s[i];
		}
		System.out.println("최대값은:"+m);
	}

}//end class
