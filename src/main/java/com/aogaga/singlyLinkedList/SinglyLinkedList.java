package com.aogaga.singlyLinkedList;

public class SinglyLinkedList<T> {

    public Node headNode;
    public int size;

    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (headNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    public void insertAtHead(Node newNode) {
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }
        System.out.print("List : ");
        Node tempNode = headNode;

        while (tempNode.nextNode != null) {
            System.out.print(tempNode.data.toString() + " -> ");
            tempNode = tempNode.nextNode;
        }
        System.out.println(tempNode.data.toString() + " -> null");
    }

    public void insertAtEnd(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;

        Node tempNode = headNode;

        while (tempNode.nextNode != null) {
            tempNode = tempNode.nextNode;
        }

        tempNode.nextNode = newNode;
        size++;
    }

    public void insertAtEnd(Node newNode) {
        Node tempNode = headNode;
        newNode.nextNode = null;
        while (tempNode.nextNode != null) {
            tempNode = tempNode.nextNode;
        }
        tempNode.nextNode = newNode;
        size++;
    }

    public Node findNode(T data) {
        Node tempNode = headNode;

        while (tempNode.nextNode != null) {
            if (tempNode.data == data) {
                return tempNode;
            }
            tempNode = tempNode.nextNode;
        }
        return null;
    }

    public Node findNode(Node node) {
        Node tempNode = headNode;

        while (tempNode.nextNode != null) {
            if (tempNode.data == node.data) {
                return tempNode;
            }
            tempNode = tempNode.nextNode;
        }
        return null;
    }

    boolean searchNode(T data) {
        Node tempNode = headNode;

        while (tempNode.nextNode != null) {
            if (tempNode.data == data) {
                return true;
            }
            tempNode = tempNode.nextNode;
        }
        return false;
    }

    public void insertAfter(T data, T previous) {
        Node tempNode = headNode;

        Node newNode = new Node();
        newNode.data = data;

        while (tempNode.nextNode != null && tempNode.data != previous) {
            tempNode = tempNode.nextNode;
        }
        newNode.nextNode = tempNode.nextNode;
        tempNode.nextNode = newNode;
        size++;
    }

    public void deleteAtHead() {
        if (isEmpty()) {
            return;
        }
        headNode = headNode.nextNode;
        size--;
    }

    public void deleteByValue(T data) {
        if (isEmpty()) {
            return;
        }
        Node currentNode = headNode;
        Node prevNode = null;

        while (currentNode != null) {
            if (currentNode.data == data) {
                prevNode.nextNode = currentNode.nextNode;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.nextNode;
        }
    }
}
