package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Partidos ganados?");
        int ganados = sc.nextInt();

        System.out.println("¿Partidos perdidos?");
        int perdidos = sc.nextInt();

        System.out.println("Partidos empatados?");
        int empa = sc.nextInt();

        int puntosTotal = (ganados*3)+empa;
        int partiTotal = ganados+empa+perdidos;

        System.out.println("Han jugado " + partiTotal + " partidos y ganado " + puntosTotal+ " puntos");
    }
}