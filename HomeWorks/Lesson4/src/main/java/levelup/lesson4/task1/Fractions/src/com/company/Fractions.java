package com.company;

public class Fractions {
    public double a;
    public double result;
    public double num;
    public double num2;

    public Fractions() {
    }

    public double plus(double a) {
        double num = a / 1;
        double num2 = a % 1;
        result = (int)num + Math.abs(num2);
        return result;
    }
    public double minus(double a) {
        double num = a / 1;
        double num2 = a % 1;
        result = (int)num - Math.abs(num2);
        return result;
    }
    public double mult(double a) {
        double num = a / 1;
        double num2 = a % 1;
        result = (int)num * Math.abs(num2);
        return result;
    }
    public void compare (double a) {
        double num = a / 1;
        double num2 = a % 1;
        if((int)num > Math.abs(num2)){
            System.out.println("Сравнение: " + (int)num + " > "+ Math.abs(num2));
        } else {
            System.out.println("Сравнение: " + (int)num + " < "+ Math.abs(num2));
        }
    }


}

