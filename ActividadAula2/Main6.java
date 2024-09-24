package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor");
        int valor = sc.nextInt();

        int resultado = (valor*valor*valor*valor*valor)+7*(valor*valor*valor*valor)-4*(valor*valor*valor)+2*(valor*valor)-valor+10;

        System.out.println("El resultado es " +resultado);

    }
}