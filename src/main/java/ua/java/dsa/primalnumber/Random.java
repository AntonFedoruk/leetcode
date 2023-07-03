package ua.java.dsa.primalnumber;

public class Random {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator(317, 51, 127, 1);
        for (int i = 0; i < 100; i++) {
            System.out.println(randomGenerator.get());
        }
    }
}
