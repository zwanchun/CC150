
public class ex2_2 {
	
//Mine
	public static int kToLastElement(Node head, int k){
		if(head==null) return 0;
		Node n1=head;
		for(int i=1;i<k;i++){
			n1=n1.next;
		}
		Node n2=head;
		while(n1!=null){
			n1=n1.next;
			n2=n2.next;
		}
		return n2.data;
		
	}
	
	//Solutions
	public static int nthToLast(Node head, int k){
		if(head==null) return 0;
		int i=nthToLast(head.next,k)+1;
		if(i==k){
			System.out.println(head.data);
		}
		return i;
	}
	public static void main(String[] args){
		
	}

}
