import java.util.Hashtable;

public class ex2_1 {
	//Mine
	public static void deleteDups(Node n){
		Hashtable table=new Hashtable();
		Node prev=null;
		while(n!=null){
			if(table.containsKey(n.data)){
				prev.next=n.next;
			}
			else{
				table.put(n.data, true);
				prev=n;
			}
			n=n.next;
			
		}
		
	}
	
	public static void deleteDups_withoutBuffer(Node head){
		if(head==null) return;
		Node current=head;
		while(current!=null){
			Node runner=current;
			while(runner.next!=null){
				if(runner.next.data==current.data){
					runner.next=runner.next.next;
				}
				else runner=runner.next;
				
			}
			current=current.next;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n=new Node(0);
		for(int i=0;i<=4;i++){
			n.apendToTail(i);
		}
		for(int i=0;i<=4;i++){
			n.apendToTail(i);
		}
		deleteDups_withoutBuffer(n);
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}

	}

}
