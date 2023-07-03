package ua.java.dsa.stack;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueSample {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        Thread produser = new Thread(() -> {
            String[] words = new String[]{"123", "ABC", "qwerty", "test", "stack", "array", "list"};

            for (int i = 0; i < words.length && !Thread.interrupted(); ) {
                try {
                    Thread.sleep(5_000);
                    queue.put(words[i]);
                    System.out.println("_producer_ put word '" + words[i] + " it queue, queue's length: " + queue.size());
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            StringBuilder sb = new StringBuilder();
            while (!Thread.interrupted()) {
                try {
                    sb.setLength(0);
                    Thread.sleep(8_000);
                    sb.append(queue.take());
                    System.out.println("_consumer_ get word '" + sb.reverse() + "' out of the queue, queue's length: " + queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        produser.start();
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        consumer.start();
    }
}
