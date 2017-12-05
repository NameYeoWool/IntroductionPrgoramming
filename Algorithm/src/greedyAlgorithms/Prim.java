package greedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;


// prim������ cycle check�� �ʿ䰡 �����Ƿ�, linked list�� ���������س���
// cost �� �����Ÿ� ã�Ƽ� graph ����� �ȴ�. �ϴ� �迡 �ּ� ���� �������� ������
// graph �� ���鸸 ��ġ�� �Ǵϱ� �����Ѱ��̶�� ����ȴ�.

// ó�� graph�� linked list�� ����� �ִ� ���̾���.
// graph �׸� �� cost�� ���� �־�� ���� �ʳ� - Ư�� vertex�� ������ �ִ°� ���� �˷���
// �ٵ� graph�� cost ���� �ִ� �͵� �̻��ѵ� ��... ����
public class Prim {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// vertex ����
		int n = scan.nextInt();
		// graph ����.
		Graph g = new Graph(n);
		
		int s;
		for(int i= 0 ; i < n; i++){
			for( int j= 0 ; j <n; j++){
				s = scan.nextInt();
				g.graph[i][j] = s;
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
				if(g.graph[v][i] != 0 && TV.nodeAt(i) == null){
					if( min > g.cost[v][i]){
						min = g.cost[v][i];
						vertex = i;
					}
				}
			}
			
			min = Integer.MAX_VALUE;
			TV.insert(vertex);
			T.insert(v, vertex);
			v = vertex;
		}
		
		
		
		//���
		
		for(int i = T.length()-1; i>=-1; i--){
			System.out.print(" ( "+T.nodeAt(i).data + " , " + T.nodeAt(i).data2 + " ) ");
		}
		
		/*
		int[] costToTree = new int[n];
		int[] closestNode = new int[n];
		
		//Initialize all elements of costToTree[]
		Arrays.fill(costToTree, Integer.MAX_VALUE);
		
		
		Edge[] T = new Edge[n];
		Node[] TV = new Node[n];
		int v= 0 ;
		
		int min;
		int index=0;
		
		for(int k = 0 ; k < n-1; k++){
			for(int i = 0; i < n ; i++){
				if( TV[i] == null && costToTree[i] > g.cost[v][i]){
					costToTree[i] = g.cost[v][i];
					closestNode[v] = i;
				}
			}//end for i
			
			TV[k] = new Node(v);
			
			//select the minimum in the costToTree[]
			min = Integer.MAX_VALUE;
			for(int i = 0 ; i<n; i++){
				if( min > costToTree[i]){
					min = costToTree[i];
					index = i;
				}
				
			}
			T[index] = new Edge(closestNode[index],index);
			v=index;
			
		}//end for k
		
		for(int i = 0 ; i < n; i ++){
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 0 ; i < n ; i ++){
			System.out.print(costToTree[i] + " ");
		}
		System.out.println();
		
		for(int i = 0 ; i<n; i++){
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 0 ; i<n; i++){
			System.out.print(closestNode[i]+ " ");
		}
		System.out.println();*/
		
	}// end findPath
}//end class
