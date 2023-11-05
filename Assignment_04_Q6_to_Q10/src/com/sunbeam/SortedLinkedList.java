package com.sunbeam;

class SortedLinkedList {
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    Node head;

    public void insertSorted(int newData) {
        Node newNode = new Node(newData);
        
        // If the list is empty or the new node's data is smaller than the head node's data
        if (head == null || newData < head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < newData) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
        list.insertSorted(3);
        list.insertSorted(1);
        list.insertSorted(4);
        list.insertSorted(2);
        list.insertSorted(5);

        System.out.println("Sorted List:");
        list.displayList();
    }
}

