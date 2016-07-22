package com.company;
import java.util.Scanner;
public class Main {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
                double a,b,h;
            System.out.println("Выберите отрезок a , b");
                a = scan.nextDouble();
                b = scan.nextDouble();
            System.out.println("Выберите шаг h");
                h = scan.nextDouble();
            for (double i=a; i<= b; i=i+h)
                {
                double F = Math.tan(2*i)-3;
                System.out.println(i + "   " + F);
            }
        }
}

