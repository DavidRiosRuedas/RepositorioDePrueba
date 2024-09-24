package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner miscaner = new Scanner(System.in);
        System.out.println("Número electrodomésticos vendidos");
        double electrodomesticos = miscaner.nextDouble();

        System.out.println("Número ropa vendida");
        double ropa = miscaner.nextDouble();

        double totalVenta=ropa+electrodomesticos;
        double porcentajeropa = (ropa*100)/totalVenta;
        double porcentajeelectro = (electrodomesticos*100)/totalVenta;

        System.out.println("ropa vendida"+ropa+", electrodomésticos vendidos"+electrodomesticos);
        System.out.println("El % de ropa es"+porcentajeropa+", y el % de electrodomésticos es"+porcentajeelectro);
            }
}