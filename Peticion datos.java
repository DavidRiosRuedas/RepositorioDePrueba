package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //pedimos el numero
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Dime un número");
        int numero=scanner1.nextInt();

        //pedimos el nombre
        System.out.println("Ahora dime un nombre");
        scanner1.nextLine(); //eliminamos lo que pueda haber en el buffer de lectura
        String cadena=scanner1.nextLine();
        //mostramos los datos leidos


        System.out.println("Dime tu edad");
        int edad=scanner1.nextInt();

        System.out.println("Dime tu DNI");
        scanner1.nextLine();
        String dni=scanner1.nextLine();


        System.out.println("has introducido el número "+numero+", el nombre "+cadena+", la edad " +edad+", y el DNI "+dni);

        if  (edad>17)
            System.out.println("---Es mayor de edad---");
        else
            System.out.println("---Es menor de edad---");
    }
}