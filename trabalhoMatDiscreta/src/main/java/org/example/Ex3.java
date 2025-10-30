package org.example;

public class Ex3 {
    public int f(int n) {
        // somatório sobre 2n + 1
        if (n == 0) {
            return 0;
        }
        int n_esimo = (2 * n) + 1;

        return f(n - 1) + n_esimo;
    }
}
