package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre y apellidos");
        String nombre = sc.nextLine();

        System.out.println("Nota práctica");
        double prac = sc.nextDouble();

        System.out.println("Nota problemas");
        double prob = sc.nextDouble();

        System.out.println("Nota teórica");
        double teor = sc.nextDouble();

        double sumatodo = prac+prob+teor;
        double pracF = (10*sumatodo)/100;
        double probF = (50*sumatodo)/100;
        double teorF = (40*sumatodo)/100;

        double notaF = (pracF+probF+teorF)/3;

        System.out.println("Nota final de "+nombre + " es "+notaF);
    }
}