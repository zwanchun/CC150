
public class ex2_4 {
	//Solutions
	public Node partition(Node n, int x){
		Node beforeStart=null;
		Node beforeEnd=null;
		Node afterStart=null;
		Node afterEnd=null;
		
		while(n!=null){
			Node next = n.next;
			n.next = null;
			if (n.data < x) {
				if (beforeStart == null) {
					beforeStart = n;
					beforeEnd = n;
				} 
				else 
				{
				beforeEnd.next=n;
				beforeEnd=n;
				}
			}
			else{
				if(afterStart==null){
					afterStart=n;
					afterEnd=n;
				}
				else{
					afterEnd.next=n;
					afterEnd=n;
				}
			}
			n=next;	
		}
		if(beforeStart==null){
			return afterStart;
		}
		beforeEnd.next=afterStart;
		return beforeStart;
	}
	
		

}
