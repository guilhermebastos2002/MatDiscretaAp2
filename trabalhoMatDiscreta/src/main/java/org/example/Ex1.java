package org.example;

public class Ex1 {
    public int f(int n) {
        if (n == 0) {
            return 3;
        }
        return 2 * f(n - 1) + 3;
    }
}
