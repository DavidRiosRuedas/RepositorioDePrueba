package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1er número");
        int nu1=sc.nextInt();
        System.out.println("2º número");
        int nu2=sc.nextInt();
        System.out.println("3er número");
        int nu3=sc.nextInt();
        System.out.println("4º número");
        int nu4=sc.nextInt();

        int multiplicacion=nu1*nu2*nu3*nu4;
        int suma=nu1+nu2+nu3+nu4;
        double media=suma/4.0;
        System.out.println("el resultado de la multiplicación es "+multiplicacion+", la suma es "+suma+", y la media es "+media);
    }
}