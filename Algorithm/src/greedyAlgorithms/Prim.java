package greedyAlgorithms;

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
				
		/*for(int i = 0 ; i < n ; i ++){
			Node node = new Node();
			node.vertex = scan.nextInt();
			
			Node cur = g.headnodes[i];
			
			if (cur == null){
				g.headnodes[i] = node;
			}else{
				while(true){
					if (cur.link == null){
						cur.link = node;
						break;
					}else{
						cur = cur.link;
					}
				}
			}*/
			
		}// for 문
		
		findPath(g);
		
	}//end main
	
	
	public static void findPath(Graph g){
		int n = g.getN();
		
		int[] costToTree = new int[n];
		int[] closestNode = new int[n];
		
		Edge[] T = new Edge[n];
		Node[] TV = new Node[n];
		int v= 0 ;
		
		
		for(int k = 0 ; k < n-1; k++){
			TV[k] = new Node(v);
			for(int i = 0; i < n ; i++){
				if( TV[i] == null && costToTree[i] > g.graph[v][i]){
					
				}
			}
		
	}
}//end class
