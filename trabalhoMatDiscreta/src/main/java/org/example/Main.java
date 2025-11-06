package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean continua = true;
        Ex1 ex1 = new Ex1();
        Ex2 ex2 = new Ex2();
        Ex3 ex3 = new Ex3();
        Ex4 ex4 = new Ex4();
        Ex5 ex5 = new Ex5();
        Scanner sc = new Scanner(System.in);
        while(continua) {
            System.out.println("Qual é o número do exercício que deseja a resposta? Digite 0 para sair.");
            int resposta = sc.nextInt();
            switch (resposta) {
                case 1:
                    for (int i = 0; i <= 3; i++) {
                        System.out.println(ex1.f(i));
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 3; i++) {
                        System.out.println(ex2.f(i));
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor de n do Somatório: ");
                    int n = sc.nextInt();
                    for (int i = 1; i <= n; i++) {
                        int termo = (2 * i) + 1;
                        System.out.println(termo);
                    }
                    System.out.println("Soma final:" + ex3.f(n));
                    break;
                case 4:
                    System.out.println("Digite o valor de n do Produtório: ");
                    int m = sc.nextInt();
                    for (int i = 1; i <= m; i++) {
                        int termo = (2 * i) + 1;
                        System.out.println(termo);
                    }
                    System.out.println("Produto Final: " + ex4.f(m));
                    break;
                case 5:
                    int somaFib = 0;
                    System.out.println("Digite o número de valores que deseja na sequência de Fibonacci: ");
                    int nFib = sc.nextInt();
                    for (int i = 0; i <= nFib - 1; i++) {
                        int valorFibonacci = ex5.f(i);
                        somaFib += valorFibonacci;
                        System.out.println(valorFibonacci);
                    }
                    System.out.println("Soma total: " + somaFib);
                    break;
                case 0:
                    continua = false;
                    break;
            }
        }
    }
}