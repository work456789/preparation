package caching;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private int capacity;
    private Map<Integer, Node> data;
    private Node head;
    private Node end;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.data = new HashMap<>();
    }

    private void add(Node node) {//always add to the beginning
        if (null == this.head) {
            this.head = node;
            this.end = node;
            return;
        }

        this.head.previous = node;
        node.next = this.head;
        this.head = node;
    }

    private void remove(Node node) {
        if (this.head == null || null == node) {
            return;
        }

        //the only one item
        if (this.head == this.end && this.head == node) {
            this.head = null;
            this.end = null;
            return;
        }

        //remove from head
        if (this.head == node) {
            this.head.next.previous = null;
            this.head = this.head.next;
            return;
        }

        //remove from end
        if (this.end == node) {
            this.end.previous.next = null;
            this.end = this.end.previous;
            return;
        }

        //remove in the middle
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }

    //if we have a hit in the cache, move element to the head
    private void moveFirst(Node node) {
        this.remove(node);
        //reset references
        node.next = null;
        node.previous = null;
        this.add(node);
    }

    //if the cache is full. remove last
    private void removeLast(){
        this.remove(this.end);
    }

    public int get(int key) {
        if (this.data.containsKey(key)) {
            Node node = this.data.get(key);
            this.moveFirst(node);

            return node.data;
        }

        return -1;
    }

    public void set(int key, int value){
        //for existing slot
        if (this.data.containsKey(key)) {
            Node node = this.data.get(key);
            this.moveFirst(node);
            node.data = value;
            return;
        }

        //Out of capacity, cleaning the oldest slot
        if (this.data.size() >= this.capacity) {
            int id = this.end.key;
            this.removeLast();
            this.data.remove(id);
        }

        //for a new slot
        Node node = new Node();
        node.key = key;
        node.data = value;
        this.add(node);
        this.data.put(key, node);
    }
}

class Node {
    int key;
    int data;
    Node previous;
    Node next;
}