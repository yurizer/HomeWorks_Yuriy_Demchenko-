package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//Read read = new Read();
        int eps;
        int[] mas = new int[0];
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите условие a(n)< ?");
        eps = scan.nextInt();
        double res;
        int i;
        for (i=1; i<eps; i++) {
            res = 1 / (Math.pow((i + 1), 2));
            System.out.println(res);
        }
        int min=mas[0];
        for (i = 0; i<mas.length; i++){
            if (min > mas[i])
                min=mas[i];
        }
        System.out.println(mas[i]);
    }
}
