package com.bl.linkedlist;

public class SingleLinkedList {
    Node head;

    public void insertFirst(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(head);
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;

        if (index == 0) {
            insertFirst(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void insertLast(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void printNodeElement() {
        Node node = head;

        System.out.println(" Linked List Element ");

        while (node != null) {
            node.display();
            node = node.next;
        }

    }
}