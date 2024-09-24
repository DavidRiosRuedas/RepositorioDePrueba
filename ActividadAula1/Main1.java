package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Scanner miScanner = new Scanner(System.in);
    System.out.println("Dime el radio del círculo");
    double radio=miScanner.nextDouble();

    //creo PI
        final double PI = 3.14;

        double area = PI * radio * radio;
        double perimetro = 2 * PI * radio;

        System.out.println(area);
        System.out.println(perimetro);


    }
}