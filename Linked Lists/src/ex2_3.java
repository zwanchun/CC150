
public class ex2_3 {
	
	//Mine
	public static void deleteThisNode(Node n){
		if(n==null) throw new RuntimeException("The node is illegal");
		else if(n.next==null) n=null;
		else{
			n.data=n.next.data;
			n.next=n.next.next;
		}
		
	}

}
