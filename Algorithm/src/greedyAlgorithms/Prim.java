package greedyAlgorithms;

import java.util.Scanner;


// prim������ cycle check�� �ʿ䰡 �����Ƿ�, linked list�� ���������س���
// cost �� �����Ÿ� ã�Ƽ� graph ����� �ȴ�. �ϴ� �迡 �ּ� ���� �������� ������
// graph �� ���鸸 ��ġ�� �Ǵϱ� �����Ѱ��̶�� ����ȴ�.

// ó�� graph�� linked list�� ����� �ִ� ���̾���.
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
