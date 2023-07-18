package ua.java.dsa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    Map<Integer, Node> cache = new HashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    private void addNode(Node newNode) {
        Node temp = head.next;

        newNode.next = temp;
        newNode.prev = head;

        head.next = newNode;
        temp.prev = newNode;

    }

    private void deleteNode(Node delnode) {
        Node prevv = delnode.prev;
        Node nextt = delnode.next;

        prevv.next = nextt;
        nextt.prev = prevv;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node resNode = cache.get(key);
            int ans = resNode.val;

            cache.remove(key);
            deleteNode(resNode);
            addNode(resNode);

            cache.put(key, head.next);
            return ans;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node curr = cache.get(key);
            cache.remove(key);
            deleteNode(curr);
        }

        if (cache.size() == capacity) {
            cache.remove(tail.prev.key);
            deleteNode(tail.prev);
        }

        addNode(new Node(key, value));
        cache.put(key, head.next);
    }

    static class Node {
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
