package com.company;

//Lesson4.Task1
//Класс Дробное число со знаком (Fractions).
// Число должно быть представлено двумя полями: целая часть - длинное целое со знаком,
// дробная часть - беззнаковое короткое целое. Реализовать арифметические операции сложения,
// вычитания, умножения и операции сравнения. В функции main проверить эти методы.

public class Main {

    public static void main(String[] args) {

        double t = -123.45;
        Fractions fract = new Fractions();
        System.out.println("Сумма: " + fract.plus(t));
        System.out.println("Вычитание: " + fract.minus(t));
        System.out.println("Произведение: " + fract.mult(t));
        fract.compare(t);
    }
}
