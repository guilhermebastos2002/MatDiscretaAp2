package org.example;

public class Ex4 {
    public int f(int n) {
        // produtorio de (2 * i) + 1
        if (n == 0) {
            return 1;
        }
        int n_esimo = (2 * n) + 1;
        return f(n-1) * n_esimo;
    }
}
