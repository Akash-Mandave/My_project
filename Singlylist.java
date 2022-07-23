package Linked_List;

public class Singlylist {
	static class Node{
		int data;
		Node next;
		public Node(int val) {
			data = val;
			next=null;
			
		}
		public Node() {
		
		}
		
	}
	Node head=null;
	public void display() {
		Node trav=head;
		System.out.println("List :");
		while(trav!=null) {
			System.out.print(trav.data+",");
			trav=trav.next;
		}
	}
	public void addLast(int val) {
		Node newnode=new Node(val);
		Node trav=head;
		if(head==null) {
			head=newnode;
		}else {
		while(trav.next!=null) {
			trav=trav.next;
		}
		trav.next=newnode;}
	}
	public void addFirst(int val) {
		Node newnode=new Node(val);
		newnode.next=head;
		head=newnode;
	}
}
class mmain{
	public static void main(String[] args) {
		Singlylist ll=new Singlylist();
		ll.addLast(11);
		ll.addLast(22);
		ll.addLast(33);
		ll.addLast(44);
		ll.addFirst(10);
		ll.display();
	}
}


