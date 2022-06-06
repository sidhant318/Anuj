package LinkedList;

public class PalindromLS {
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	Node head;

	public static void main(String[] args) {
		PalindromLS p=new PalindromLS();
		p.add(3);
		p.add(5);
		p.add(7);
		p.add(5);
		p.add(3);
		p.print();
		System.out.println();
		System.out.println(p.isPalindrom());
	}
//3 5 7 9 11 13
	private boolean isPalindrom() {
		Node middle=findMiddle();
		Node n=reverse(middle.next);
		Node cur=head;
		while(n!=null) {
			if(n.data!=cur.data)
				return false;
			n=n.next;
			cur=cur.next;
		}
		return true;
	}

	private Node reverse(Node n) {
		Node current=n;
		Node prev=null;
		Node next=null;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		
	return prev;
}
	private Node findMiddle() {
		Node slow=head;
		Node fast=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	private void print() {
		Node tmp=head;
		while(tmp!=null) {
			System.out.print(tmp.data+" ");
			tmp=tmp.next;
		}
		
	}

	private void add(int i) {
		Node n=new Node(i);
		if(head!=null) {
			n.next=head;
			
		}
		head=n;
	}

}
