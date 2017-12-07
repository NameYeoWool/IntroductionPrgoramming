package heapSorting;


public class Heap {
	private final int SIZE = 200;
	private int num;
	private int[] element;
	
	public Heap(){
		element = new int[SIZE];
		num = 0;
	}

	
	public boolean isHeapEmpty(){
		return num == 0 ;
	}
	public boolean isHeapFull(){
		return num == SIZE-1;
	}
	
	public void insert(int item){
		int pos, par;
		if(isHeapFull()) System.exit(1);
		
		if(num == 0){
			element[num++] = item;
		}else{
			pos = num;
			par = (pos-1)/2;
			
			while (item > element[par]){
				element[pos] = element[par];
				pos = par;
				if(pos == 0) break;
				par = (par-1)/2;
			}
			
			element[pos] = item;
			num++;
		}
	}
	
	
	public int delete(){
		if(isHeapEmpty()) System.exit(1);
		
		int value = element[0];
		int pos = 0 ;
		num--;
		if(isHeapEmpty()) return value;
		
		int last = num;
		element[pos] = element[num];

		int child=pos;
		int temp;
		while( pos*2+1 <=last){
			//one child
			if( pos*2+2 > last) child = pos*2+1;
				
			//two children
			if(pos*2+2 <=last){
				child = (element[pos*2+1] > element[pos*2+2]) ? pos*2+1 : pos*2+2;
			}
			
			if(element[pos] <element[child]){
				//swap elements at pos and at child
				temp = element[pos];
				element[pos] = element[child];
				element[child]=temp;
			}else{
				break;
			}
			
			pos = child;

		}
		return value;
	}
	
	
	
}//end class	
	