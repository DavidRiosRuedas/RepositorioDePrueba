package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Día de nacimiento");
        int dia = sc.nextInt();

        System.out.println("Mes de nacimiento");
        int mes = sc.nextInt();

        System.out.println("Año de nacimiento");
        int ano = sc.nextInt();

        int sumafecha = dia+mes+ano;
        int cifra1 = sumafecha %10;
        int cifra2 = sumafecha/10%10;
        int cifra3 = sumafecha/100%10;
        int cifra4 = sumafecha/1000%10;

        int suerte = cifra1+cifra2+cifra3+cifra4;

        System.out.println("Tu número de la suerte es: " + suerte);



    }
}