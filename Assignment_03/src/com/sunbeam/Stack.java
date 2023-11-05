

public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}
	
	public void push(int data) {
		//a. reposition the top
		top++;
		//b. add data at top index
		arr[top] = data;
	}
	
	public int pop() {
		//a. read data from top index
		int data = arr[top];
		//b. reposition top
		top--;
		//c. return read data
		return data;
	}
	
	public int peek() {
		//a. read/return data of top index
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE -1;
	}

}









