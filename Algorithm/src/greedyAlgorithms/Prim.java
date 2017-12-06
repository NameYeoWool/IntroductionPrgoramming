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
		
		
		
		//���
		System.out.println(T);
		
	}// end findPath
}//end class
