package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las primeras horas");
        int hora1 = sc.nextInt();

        System.out.println("Introduce los primeros minutos");
        int mint1 = sc.nextInt();

        System.out.println("Introduce los primeros segundos");
        int seg1 = sc.nextInt();

        //segunda hora

        System.out.println("Introduce las segundas horas");
        int horas2 = sc.nextInt();

        System.out.println("Introduce los segundos minutos");
        int mint2 = sc.nextInt();

        System.out.println("Introduce los segundos");
        int seg2 = sc.nextInt();

        //calculos

        int horaF = horas2-hora1;
        int mintF = mint2-mint1;
        int segF = seg2-seg1;

        System.out.println(+horaF + " horas "+mintF+" minutos "+segF+" segundos");
    }
}