package greedyAlgorithms;

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
			
		}// for ��
		
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
