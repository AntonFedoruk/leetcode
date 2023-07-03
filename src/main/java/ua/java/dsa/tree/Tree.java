package ua.java.dsa.tree;

import ua.java.dsa.stack.SimpleQueue;
import ua.java.dsa.stack.SimpleStack;

public class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value) {
        this.value = value;
    }

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    int sumRecursive() {
        int sum = value;

        if (left != null) {
            sum += left.sumRecursive();
        }

        if (right != null) {
            sum += right.sumRecursive();
        }

        return sum;
    }

    int sumDeep() {
        SimpleStack<Tree> stack = new SimpleStack<>();
        stack.push(this);

        int sum = 0;

        while (!stack.isEmpty()) {
            Tree node = stack.pop();
            System.out.println(node.value);
            sum += node.value;

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return sum;
    }

    int sumWide() {
        SimpleQueue<Tree> queue = new SimpleQueue<>();
        queue.add(this);

        int sum = 0;

        while (!queue.isEmpty()) {
            Tree node = queue.remove();
            System.out.println(node.value);
            sum += node.value;

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return sum;
    }
}