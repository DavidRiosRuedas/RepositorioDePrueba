package org.example;

import java.util.Scanner;

import static java.lang.Math.PI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia");
        double radio = sc.nextDouble();

        double area = (radio*radio)*Math.PI;
        double peri = 2*Math.PI*radio;

        System.out.println("El área es " + area + " El perímetro es " + peri);

    }
}