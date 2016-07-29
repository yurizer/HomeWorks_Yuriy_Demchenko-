package com.company;

public class Main {

    public static void main(String[] args) {


        int i = 100;
        String str1 = "Schneider";
        String str2 = "abc-777";

        Pen Pen1 = new Pen(100, "Schneider", "abc-777");
        Pen Pen2 = new Pen(i, str1, str2);
        Pen Pen3 = new Pen(550, "Parker" , "abc-999");
        System.out.println("\nPen1.toString() is: " + Pen1.toString());
        System.out.println("Pen2.toString() is: " + Pen2.toString());
        System.out.println("Pen3.toString() is: " + Pen3.toString());

        System.out.println("\nPen1.equals(Pen2) is: " + Pen1.equals(Pen2));
        System.out.println("Pen1.equals(Pen3) is: " + Pen1.equals(Pen3));
        System.out.println("\nPen1.hashCode() is: " + Pen1.hashCode());
        System.out.println("Pen2.hashCode() is: " + Pen2.hashCode());
    }
}
