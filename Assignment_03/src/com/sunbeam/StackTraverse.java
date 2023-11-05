package com.sunbeam;

import java.util.Stack;

public class StackTraverse {

	static class MaxElement {

		private Stack<Integer> mainStack;
		private Stack<Integer> maxStack;

		public MaxElement() {
			mainStack = new Stack<>();
			maxStack = new Stack<>();
		}

		/*
		 * jo bhi data loge use mainstack mein push karo aur maxstack mein vahi data
		 * push krne ke liye condition check karo ki agar maxstack empty hai ya phir
		 * data maxstack mei jo abhi element hai vo data agar liye hue data se bada hai
		 * to maxstack mein value push karo
		 */
		public void push(int data) {
			mainStack.push(data);
			if (maxStack.isEmpty() || data >= maxStack.peek()) {
				maxStack.push(data);
			}
		}

		/* agar mainstack  empty hai to exception throw karo 
		 * ya phir
		 * aur mainstack se jo element pop hua hai int popped main catch karo 
		 * aur vo popped element maxstack mein hai kya check karo aur agar hoga to vo element pop karo
		 * aur use popped element ko return karo
		 * 
		 * 
		 * 
		 */
		public int pop() {
			if (mainStack.isEmpty()) {
				throw new IllegalStateException("Stack is Empty..");
			}

			int popped = mainStack.pop();
			if (popped == maxStack.peek()) {
				maxStack.pop();
			}
			return popped;
		}
/*
 * agar mai stack empty hai to ecxception throw karo
 * maxstack mein jo element hai use return karo
 * 
 * 
 * 
 * 
 */
		public int getMax() {
			if (mainStack.isEmpty()) {
				throw new IllegalStateException("Stack is Empty");
			}
			return maxStack.peek();
		}

		public static void main(String[] args) {
			MaxElement element = new MaxElement();
			element.push(3);
			element.push(69);
			element.push(9);
			element.push(4);
			element.push(3);

			int max = element.getMax();
			System.out.println("Max value in stack: " + max);
		}
	}
}
