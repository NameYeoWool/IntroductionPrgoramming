package °´Ã¼ÁöÇâ2;

import java.util.Scanner;

class Pass{
	static int cnt = 0;
	int num;
	private String name;
	int score;
	
	Pass(String name, int score){
		this.name = name;
		this.score = score;
		if(score >= 80) cnt++;
	}
	
	String getName(){
		return name;
	}
	
	void out(){
		System.out.printf("%s\n",name);
	}
	
	
	
	
}

public class Main639 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pass[] p = new Pass[5];
		
		for( int i =0 ; i < 5 ; i++){
			p[i] = new Pass(scan.next(),scan.nextInt());
		}
		
		
		System.out.println("Passed number : " + Pass.cnt);
		
		for( int i =0 ; i < 5 ; i++){
			if(p[i].score<80)continue;
			System.out.println(p[i].getName());
		}

	}

}
