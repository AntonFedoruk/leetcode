package ua.java.dsa.algorithms.sort;

public class Utils {
    public static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long endTime = System.currentTimeMillis();
        System.out.println("It takes : " + (endTime - startTime) + "millis to complete.");
    }

    public static void measureTime(Runnable task, String taskName) {
        long startTime = System.currentTimeMillis();
        task.run();
        long endTime = System.currentTimeMillis();
        System.out.println(taskName + " takes : " + (endTime - startTime) + "millis to complete.");
    }

    public static void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError();
        }
    }
}
