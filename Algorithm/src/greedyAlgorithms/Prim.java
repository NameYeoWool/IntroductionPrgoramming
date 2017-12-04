package greedyAlgorithms;

import java.util.Scanner;


// prim에서는 cycle check할 필요가 없으므로, linked list로 관계정립해놓고
// cost 값 작은거만 찾아서 graph 만들면 된다. 하는 김에 최소 값이 얼마인지도 구하자
// graph 의 값들만 합치면 되니까 간달한것이라고 예상된다.

// 처음 graph를 linked list로 만들고 있는 중이었다.
public class Prim {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Graph g = new Graph();
		
		int n = scan.nextInt();
		
		for(int i = 0 ; i < n ; i ++){
			Node node = new Node();
			node.cost = scan.nextInt();
			
			Node cur = g.headnodes[i];
			while(true){
				if ( cur == null ) {
					 = node;
					
				}
				else{
					cur = cur.link;
					
				}
			}
			
		}
		
		
	}
	
}
