package ua.java.dsa.primalnumber;

public class RandomGenerator {
    //Xnew = (a * Xold + c) % m
    // m>=2
    // 0 <= a < m
    // 0 <= c < m
    // 0 <= X0 < m

    private final int a;
    private final int c;
    private final int m;
    private int xlast;

    public RandomGenerator(int a, int c, int m, int xlast) {
        this.a = a;
        this.c = c;
        this.m = m;
        this.xlast = xlast;
    }

    int get() {
        xlast = (a * xlast + c) % m;
        return Math.abs(xlast);
    }
}
