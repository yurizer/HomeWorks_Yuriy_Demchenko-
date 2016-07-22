package com.company;
import java.util.Scanner;
public class Calcul {
    private double num1;
    private double num2;
    public double result;
    public double getNum1() {  //
        return num1;}          // как эти getter и где нужно применить?)
    public double getNum2() {  //
        return num2;}
    public void setNum1(double num1) { // как этот setter и где нужно применить?)
        this.num1 = num1;}
    public double plus() {
        result = num1 + num2;
        return result;}
    public double minus() {
        result = num1 - num2;
        return result;}
    public double mult() {
        result = num1 * num2;
        return result;}
    public double divide() {
        result = num1 / num2;
        return result;}
    public void scan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первый операнд");
        num1 = scan.nextDouble();
        System.out.println("Введите второй операнд");
        num2 = scan.nextDouble();
    }
}
