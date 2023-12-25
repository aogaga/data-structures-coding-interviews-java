package com.aogaga.doublyLinkedList;

public class DoublyLinkedList<T> {
    public Node headNode;
    public int size;

    public DoublyLinkedList() {
        this.headNode = null;
    }

    public boolean isEmpty() {
        return headNode == null;
    }

    public void insertAtHead(T data) {
        Node node = new Node();
        node.data = data;
        Node tempHead = headNode;

        node.nextNode = tempHead;
        node.prevNode = null;
        headNode = node;

        if (headNode != null) {
            headNode.prevNode = node;
            this.headNode = node;
        }
        size++;
    }

    public void deleteAtHead() {
        if (isEmpty()) {
            return;
        }
        headNode = headNode.nextNode;
        headNode.prevNode = null;
        size--;
    }

    public void deleteByValue(T data) {
        if (isEmpty()) {
            return;
        }

        Node<T> node = headNode;

        while (node != null) {
            if (node.data == data) {
                node.prevNode.nextNode = node.nextNode;
                size--;
                return;
            }
            node = node.nextNode;
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }

        Node<T> temp = headNode;
        System.out.print("List : null <- ");

        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " <-> ");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null");
    }
}
