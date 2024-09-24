package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Intruduce un número de 5 cifras");
        int numero = sc.nextInt();

        int dec1 = numero%10;
        int dec2 = numero/10;
        int dec2v = dec2%10;
        int dec3 = numero/100;
        int dec3v = dec3%10;
        int dec4 = numero/1000;
        int dec4v = dec4%10;
        int dec5 = numero/10000;
        int dec5v = dec5%10;

        System.out.println(+dec5v +"-"+dec4v+ "-"+dec3v + "-"+ dec2v+ "-" + dec1);


    }
}