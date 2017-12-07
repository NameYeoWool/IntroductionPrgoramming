package dijkstraAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Dijkstra {

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
			
			
			int[] distance = new int[n];
			
			distance = dijstra(g);
			
			for(int i= 0; i <n; i ++){
				System.out.print(i + " ");
			}
			
			System.out.println();
			
			for(int i = 0 ; i <n; i ++){
				if( distance[i] == Integer.MAX_VALUE){
					System.out.print(0 + " ");
					continue;
				}
				System.out.print(distance[i] + " ");
			}
			
		}
		
		public static int[] dijstra(Graph g){
			int n = g.getN();
			
			int[] distance = new int[n];
			
			Arrays.fill(distance, Integer.MAX_VALUE);
			
			LinkedListHN s = new LinkedListHN();
			
			s.insert(0);
			
			for(int i =0 ; i < n; i ++){
				if(s.search(i) == false){
					distance[i] = g.cost[0][i];
				}
			}
			
			
			int min = Integer.MAX_VALUE;
			int index=0;
			for(int k= 0; k <n-2; k++){
				// distance 에서 최소값 찾기
				for(int i= 0 ; i<n; i ++){
					if(s.search(i) == false){
						if( distance[i] < min ){
							min = distance[i];
							index = i;
							
						}
					}
				}
				min = Integer.MAX_VALUE;
				if( s.search(index) == false) s.insert(index);
				
				
				for(int i = 0 ; i < n; i ++){
					if (s.search(i) == false){
						if( distance[i] > distance[index] + g.cost[index][i]){
							distance[i] = distance[index] + g.cost[index][i];
						}
					}
				}
			}
			
			
	
			return distance;
		}
}
