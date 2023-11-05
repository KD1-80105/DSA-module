package com.sunbeam;

public class Main1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original List:");
        list.displayList();

        System.out.println("List in Reverse Order:");
        list.displayList();
    }
}
