package stackArray;

public class StackArray {
int top;
int capacity;
int []arr;
public StackArray (int capacity) {
	this.capacity =capacity;
	arr=new int[capacity];
	top=-1;
	
}
public void push(int data) {
	if (top==capacity -1) {
		System.out.println("overflow exception");
		return;
		
	}
	arr[++top]=data;
	
}
public int  pop(){
	if(top == -1) {
		System.out.println("stack overflow");
		return -1;
		
	}
	return arr[top--];
}
public int peek() {
	if(top == -1) {
		System.out.println("stack is already empty");
		return -1;
		
	}
	return arr[top];
}
public boolean isEmpty() {
	if(top==-1) {
		return true;
	}
	return false;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StackArray st=new StackArray(5);
st.push(10);
st.push(20);
st.push(30);
st.push(40);
st.push(50);

st.push(60);

// Pop elements
System.out.println("Popped: " + st.pop()); // 50
System.out.println("Popped: " + st.pop()); // 40

// Peek element
System.out.println("Peek: " + st.peek());  // 30

// Pop remaining
System.out.println("Popped: " + st.pop()); // 30
System.out.println("Popped: " + st.pop()); // 20
System.out.println("Popped: " + st.pop()); // 10

// Try popping from empty stack
System.out.println("Popped: " + st.pop());



	}

}
