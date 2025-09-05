package com.in.dsa;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	Node head;
	void print_LL() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	//add last
	public void add_last(int data) {
		Node temp=new Node(data);
		if(head==null) {
			head=temp;
		}
		else {
			Node curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=temp;
		}
	}
	//add first
	public void add_first(int data) {
		Node temp=new Node(data);
		temp.next=head;
		head=temp;
	}
	//delete last
	public void delete_last() {
		if(head==null) {
			System.out.println("ll is empty");
		}
		else if(head.next==null) {
			head=null;
		}
		else {
			Node curr=head;
			while(curr.next.next!=null) {
				curr=curr.next;
			}
			curr.next=null;
		}
	}
	//Deleate first 
	public void delete_first() {
		if(head==null) {
			System.out.println("ll is empty");
		}//only 1 element
		else {
			//head=head.next;
			Node curr=head;
			head=curr.next;
			curr.next=null;
		}
	}
	//reverse
	public void reverse() {
	    Node prev = null;
	    Node curr = head;
	    Node next = null;

	    while (curr != null) {
	        next = curr.next;   // save next
	        curr.next = prev;   // reverse link
	        prev = curr;        // move prev
	        curr = next;        // move curr
	    }

	    head = prev; // finally update head to new first node
	}

	
	public void print_LL(Node head) {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}

	
	//add at index	
	public void add_at_index(int index,int data) {
		if(index<0||index>size()) {
			System.out.println("invalid index");
			return;
		}
		if (index == 0) {
            add_first(data);
        } 
        else if (index == size()) {
            add_last(data);
        } 
        else {
            Node curr = head;
            Node temp = new Node(data);

            for (int i = 0; i < index - 1; i++) { // move to node before index
                curr = curr.next;
            }

            temp.next = curr.next;
            curr.next = temp;
            }
	}
	//delete_at_index
	public void delete_at_index(int index) {
		if(index<0||index >= size()) {
			System.out.println("invalid index");
			return;
		}
		if (index == 0) {
			delete_first();
        } 
        else if (index == size()-1) {
            delete_last();
        } 
        else {
        	Node curr=head;
        	for(int i=0;i<index-1;i++) {
        		curr=curr.next;
        	}
        	Node temp=curr.next;
        	curr.next=curr.next.next;
        	temp.next=null;
        	}
        }
	
	// get first
	public int get_first() {
		if(head==null) {
			System.out.println("no ele in the linked list");
			return -1;
		}
		return head.data;
	}
	
	// get lst
		public int get_last() {
			if(head==null) {
				System.out.println("no ele in the linked list");
				return -1;
			}
			Node curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			return curr.data;
		}
		
		// get index
		public int get_at_index(int index) {
			if(index<0||index>=size()) {
				System.out.println("inv index");
				return -1;
				
			}
		if(index==0) {
			return get_first();
		}
		else if(index==size()-1) {
			return get_last();
		}
		else {
			Node curr=head;
			for(int i=0;i<index;i++) {
				curr=curr.next;
			}
			return curr.data;
		}
		}
		
	//size
	public int size() {
		Node curr=head;
		int count=0;
		
		while(curr!=null) {
			
			curr=curr.next;
			count++;
		}
			return count;
		
		
	}
	}
	
public class first{
	public static void main(String[]args) {
		LinkedList ll=new LinkedList();
		ll.add_last(10);
		ll.add_last(20);
		ll.add_last(30);
		ll.add_last(40);
		ll.add_first(5);
		ll.add_first(1);
		//ll.print_LL();
		
		/*System.out.println("size is"+" "+ll.size());
		
		ll.delete_last();
		ll.print_LL();
		
		ll.delete_first();
		ll.print_LL();
		
		ll.add_at_index(2, 15);
	    ll.print_LL();
			
		ll.delete_at_index(3);
		ll.print_LL();
		
		System.out.println(ll.get_at_index(2));*/
			
		
	      //  ll.print_LL( ll.reverse());
		
		System.out.println("Original List:");
        ll.print_LL();

        // reverse
        ll.reverse();
        System.out.println("Reversed List:");
        ll.print_LL();

	}

}
