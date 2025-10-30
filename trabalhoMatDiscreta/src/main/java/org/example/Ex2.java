package org.example;
import java.util.Scanner;

public class Ex2 {
    // a = 3
    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n >= 1) {
            return 3 * f(n - 1);
        }
        return -1;
    }
}
