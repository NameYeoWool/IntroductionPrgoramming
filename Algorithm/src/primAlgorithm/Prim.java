package primAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

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
			v = vertex;
		}
		
		
		if( T.length() < n-1){
			System.out.println("no spanning tree");
			System.exit(1);
		}
		
		
		//출력
		System.out.println(T);
		
	}// end findPath
}//end class
