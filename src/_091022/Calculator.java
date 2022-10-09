package _091022;


import _091022.Home0910.No1;

import java.util.Scanner;

public class Calculator {

    public static No1 no1;


    public double getSum(double num1, double num2){
        return num1+num2;
    }
    public double getSub(double num1, double num2){
        return num1-num2;
    }
    public double getMulti(double num1, double num2){
        return num1*num2;
    }
    public double getDiv(double num1, double num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

    }
}
