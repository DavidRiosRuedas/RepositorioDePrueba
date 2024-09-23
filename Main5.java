package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para combertir:");
        int numIntroducido = sc.nextInt();

        int segundos = numIntroducido%60;
        int minutos = numIntroducido/60;
        int minutos1 = minutos%60;
        int horas = minutos/60;

        System.out.println("Horas: " + horas + " Minutos: " + minutos1+ " Segundos:" +segundos);



    }
}