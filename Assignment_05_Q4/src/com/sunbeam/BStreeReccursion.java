package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BStreeReccursion {
	public class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}
	
	private Node root;
	
	public BStreeReccursion() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void addNode(int value) {
		//1. create node with given data
		Node newnode = new Node(value);
		//2. if tree is empty
		if(isEmpty())
			//a. add newnode into root itself
			root = newnode;
		//3. if tree is not empty
		else {
			//3.1 create trav and start at root
			Node trav = root;
			
				//3.2 if value is less than current node data
				if(value < trav.data) {
					//3.2.1 if current node left is empty
					if(trav.left == null) {
						//add value(node) in left of current node
						trav.left = newnode;
						break;
					}
					//3.2.2 if current node left is not empty
					else
						// go into left
//					addNode(root,value);
				}
				//3.3 if value is greater than current node data
				else {	
					//3.3.1 if current node right is empty
					if(trav.right == null) {
						//add value(node) in right of current node
						trav.right = newnode;
						break;
					}
					//3.2.2 if current node right is not empty
					else
						// go into right
						trav = trav.right;
				}
			//3.4 repeat step 3.2 and 3.3 till node is not added
		}
	}
//	public void addNode(int value){
//		addNode(root,value);
//	}
	
	private void preOrder(Node trav) {
		if(trav == null)
			return;
		//1. visit current node
		System.out.print(" " + trav.data);
		//2. go to the left
		preOrder(trav.left);
		//3. go to the right
		preOrder(trav.right);
	}
	
	public void preOrder() {
		System.out.print("Preorder : ");
		preOrder(root);
		System.out.println("");
	}
	
	private void inOrder(Node trav) {
		if(trav == null)
			return;
		//2. go to the left
		inOrder(trav.left);
		//1. visit current node
		System.out.print(" " + trav.data);
		//3. go to the right
		inOrder(trav.right);
	}
	
	public void inOrder() {
		System.out.print("Inorder : ");
		inOrder(root);
		System.out.println("");
	}
	
	private void postOrder(Node trav) {
		if(trav == null)
			return;
		//2. go to the left
		postOrder(trav.left);
		//3. go to the right
		postOrder(trav.right);
		//1. visit current node
		System.out.print(" " + trav.data);
	}
	
	public void postOrder() {
		System.out.print("Postorder : ");
		postOrder(root);
		System.out.println("");
	}
	
	public void DFSTraversal() {
		//0. create stack to push Nodes
		Stack<Node> st = new Stack<>();
		System.out.print("DFS : ");
		//1. push root on stack
		st.push(root);
		while(!st.isEmpty()) {
			//2. pop one node from stack
			Node trav = st.pop();
			//3. visit(print) node
			System.out.print(" " + trav.data);
			//4. if right exist, push it on stack
			if(trav.right != null)
				st.push(trav.right);
			//5. if left exist, push it on stack
			if(trav.left != null)
				st.push(trav.left);
		}//6. while stack is not empty repeat ste 2 to 5
		System.out.println("");
		
	}
	
	public void BFSTraversal() {
		//0. Create queue to push Nodes
		Queue<Node> q = new LinkedList<>();
		System.out.print("BFS : ");
		//1. push root on queue
		q.offer(root);
		while(!q.isEmpty()) {
			//2. pop one node from queue
			Node trav = q.poll();
			//3. visit(print) node
			System.out.print(" " + trav.data);
			//4. if left exist, push it on queue
			if(trav.left != null)
				q.offer(trav.left);
			//5. if right exist, push it on queue
			if(trav.right != null)
				q.offer(trav.right);
		}//6. while queue is not empty repeat ste 2 to 5
		System.out.println("");
	}
	
	public Node binarySearch(int key) {
		//1. start from root
		Node trav = root;
		while(trav != null) {
			//2. if key is equal to current data
			if(key == trav.data)
				//return current node
				return trav;
			//3. if key is less than current data
			else if(key < trav.data)
				// search key into left of current node
				trav = trav.left;
			//4. if key is greater than current data
			else
				// search key into right of current node
				trav = trav.right;
		}//5. repeat step 2 to 4 till leaf nodes 
		return null;
	}
	
	public Node[] binarySearchWithParent(int key) {
		//1. start from root
		Node trav = root;
		Node parent = null;
		while(trav != null) {
			//2. if key is equal to current data
			if(key == trav.data)
				//return current node
				break;
			parent = trav;
			//3. if key is less than current data
			if(key < trav.data)
				// search key into left of current node
				trav = trav.left;
			//4. if key is greater than current data
			else
				// search key into right of current node
				trav = trav.right;
		}//5. repeat step 2 to 4 till leaf nodes 
		if(trav == null)
			parent = null;
		return new Node[] {trav, parent};
	}
	
	public void deleteNode(int key) {
		//1. search node with its parent
		Node arr[] = binarySearchWithParent(key);
		//arr[0] = Node to be deleted
		//arr[1] = parent of node to be deleted
		Node temp = arr[0], parent = arr[1];
		//2. if node is not found
		if(temp == null)
			return;
		//3. if node is found
		//3.1 Node with 2 childs
		if(temp.left != null && temp.right != null){
			//1. find inorder predecessor
			Node trav = temp.left;
			parent = temp;
			while(trav.right != null){
				parent = trav;
				trav = trav.right;
			}
			//2. update data by data of predecessor
			temp.data = trav.data;
			//3. mark trav to be deleted
			temp = trav;	
		}
		//3.2 Node with single child(right)
		if(temp.left == null){
			if(temp == root)
				root = temp.right;
			else if(temp == parent.left)
				parent.left = temp.right;
			else	//if(temp == parent.right)
				parent.right = temp.right;
		}
		//3.3. Node with single child(left)
		else {//if(temp.right == null){
			if(temp == root)
				root = temp.left;
			else if(temp == parent.left)
				parent.left = temp.left;
			else //if(temp == parent.right)
				parent.right = temp.left;
		}
	}
	
	public int height(Node trav) {
		//0. if left or right sub tree is absent 
		if(trav == null)
				//then return 0
			return 0;
		//1. find height of left subtree
		int hl = height(trav.left);
		//2. find height of right subtree
		int hr = height(trav.right);
		//3. find max height
		int max = Integer.max(hl, hr);
		//4. add one into max height(return)
		return max + 1;
	}
	
	public int height() {
		return height(root);
	}
	
	
}








