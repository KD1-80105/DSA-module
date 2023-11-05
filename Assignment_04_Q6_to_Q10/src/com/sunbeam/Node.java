package com.sunbeam;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void bubbleSort() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        Node current;
        Node lastSorted = null;

        do {
            swapped = false;
            current = head;

            while (current.next != lastSorted) {
                if (current.data > current.next.data) {
                    // Swap current node and next node
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    swapped = true;
                }
                current = current.next;
            }
            lastSorted = current;
        } while (swapped);
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
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(2);
        list.insert(8);
        list.insert(1);
        list.insert(3);

        System.out.println("Original List:");
        list.displayList();

        list.bubbleSort();

        System.out.println("Sorted List using Bubble Sort:");
        list.displayList();
    }
}
