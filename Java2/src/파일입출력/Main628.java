package 파일입출력;


import java.util.Scanner;

public class Main628 {
	static Person[] per = new Person[100];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for( int i  = 0 ; i <10 ; i ++){
			per[Person.n++] = new Person(scan.next(),scan.nextInt());
		}
		
		for( int i = 0 ; i < 10 ; i ++){
			per[i].setIndex(i);
		}
		
		sort_rank();
		sort_index();
		
		
		System.out.printf("%4s %5s %4s\n","Name","Score","Rank");
		for( int i= 0; i < Person.n ; i++){
			System.out.printf("%4s %5d %4d\n",per[i].getName(),per[i].getScore(),per[i].getRank());
			
		}
	}
	
	
	static void sort_rank(){
		Person tmp = new Person();
		int i, j;
		for( i = 0 ; i < Person.n-1 ; i ++){
			for( j = i +1 ; j <Person.n ; j ++){
				if(per[i].getScore()<per[j].getScore()){
					tmp = per[i];
					per[i] = per[j];
					per[j] = tmp;
				}
			}
		}
		
		per[0].setRank(1);
		
		for(i = 1 ; i < Person.n; i++ ){
			if(per[i].getScore() ==per[i-1].getScore()){
				per[i].setRank(per[i-1].getRank());
			}else{
				per[i].setRank(i+1);
			}
				
			
		}
	
	}
	
	static void sort_index(){
		Person tmp = new Person();
		int i, j ;
		for(i = 0 ; i < Person.n-1; i ++){
			for( j = i +1 ; j < Person.n; j ++){
				if(per[i].getIndex()>per[j].getIndex()){
					tmp = per[i];
					per[i] = per[j];
					per[j] =tmp;
				}
			}
		}
	}
	/*


	
	
	static void sort_rank(){
		Person tmp = new Person();
		int i , j ;
		for( i = 0 ;  i <Person.n-1 ; i ++){
			for( j = i+1 ;  j < Person.n; j++){
				if(per[i].getScore() < per[j].getScore()){
					tmp = per[i];
					per[i] = per[j];
					per[j] = tmp;
				}
			}
		}
		
		per[0].setRank(1);
		for( i = 1 ; i< Person.n; i++){
			if(per[i].getScore()==per[i-1].getScore()){
				per[i].setRank(per[i-1].getRank());
			}else{
				per[i].setRank(i+1);
			}
		}
		
	}
	static void sort_index(){
		int i, j ;
		Person tmp = new Person();
		for(i = 0 ; i < Person.n -1; i ++){
			for(j = i+1 ; j <Person.n; j++){
				if(per[i].getIndex()<per[j].getIndex()){
					tmp = per[i];
					per[i] = per[j];
					per[j] = tmp;
				}
			}
		}
	}
	
	*/
}



class Person{
	static int n = 0;
	private String name;
	private int score, rank,index;
	
	Person(){}
	Person(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	
	
	int getIndex(){
		return index;
	}
	
	void setRank(int rank){
		this.rank = rank;
	}
	
	void setIndex(int index){
		this.index=index;
	}
	
	String getName(){
		return name;
	}
	
	int getScore(){
		return score;
	}
	
	int getRank(){
		return rank;
	}
}

