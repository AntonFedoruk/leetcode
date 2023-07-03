package ua.java.dsa.stack;

public class StackTest {
    public static void main(String[] args) {
//        testQueue();
        testStack();
    }

    private static void testQueue() {
        SimpleQueue<Integer> queue = new SimpleQueue<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("added: " + i);
            queue.add(i);
        }

        System.out.println();

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    private static void testStack() {
        SimpleStack<Integer> stack = new SimpleStack<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("added: " + i);
            stack.push(i);
        }

        System.out.println();

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
