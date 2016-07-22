package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int op ;
        Scanner scan = new Scanner(System.in);
        Calcul culc = new Calcul();
        System.out.println("Выберите операцию: 1)Сложение, 2)Вычитание, 3)Умножение, 4)Деление");
        op = scan.nextInt();
        if (op == 1) {
            culc.scan();
            System.out.println("Ответ: " + culc.plus());
        }
        if (op == 2) {
            culc.scan();
            System.out.println("Ответ: " + culc.minus());
        }
        if (op == 3) {
            culc.scan();
            System.out.println("Ответ: " + culc.mult());
        }
        if (op == 4) {
            culc.scan();
            System.out.println("Ответ: " + culc.divide());
        }
    }
}
