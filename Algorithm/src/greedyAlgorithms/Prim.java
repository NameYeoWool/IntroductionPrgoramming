package greedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;


// prim에서는 cycle check할 필요가 없으므로, linked list로 관계정립해놓고
// cost 값 작은거만 찾아서 graph 만들면 된다. 하는 김에 최소 값이 얼마인지도 구하자
// graph 의 값들만 합치면 되니까 간달한것이라고 예상된다.

// 처음 graph를 linked list로 만들고 있는 중이었다.
// graph 그릴 때 cost를 갖고 있어야 하지 않나 - 특정 vertex랑 가까이 있는게 뭔지 알려면
// 근데 graph가 cost 갖고 있는 것도 이상한데 하... ㅅㅂ
public class Prim {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// vertex 개수
		int n = scan.nextInt();
		// graph 만듦.
		Graph g = new Graph(n);
		
		int s;
		for(int i= 0 ; i < n; i++){
			for( int j= 0 ; j <n; j++){
				s = scan.nextInt();
				g.graph[i][j] = s;
				if( s == 0 ) continue;
				g.cost[i][j] = s;
			}
		}
		

		
		findPath(g);
		
	}//end main
	
	
	public static void findPath(Graph g){
		int n = g.getN();
		
		LinkedListHN T = new LinkedListHN();
		LinkedListHN TV = new LinkedListHN();
		
		int v = 0;
		TV.insert(v);
		int vertex = v;
		int min = Integer.MAX_VALUE;
		
		while( T.length() <= n-1){
			for(int i = 0 ; i < n; i ++){
				if(g.graph[v][i] != 0 && TV.search(i) == false){
					if( min > g.cost[v][i]){
						min = g.cost[v][i];
						vertex = i;
					}
				}
			}
			if( vertex == v)  break;
			min = Integer.MAX_VALUE;
			TV.insert(vertex);
			T.insert(v, vertex);
			System.out.print(T.length() + " ");
			v = vertex;
		}
		
		
		
		//출력
		System.out.println(T);
		
	}// end findPath
}//end class
