package org.example;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        int c=30;
        int aux;

        System.out.println("---ANTES---");
        System.out.println("-Valor de A:"+ a + " -Valor de B:" + b + " -Valor de C:" +c );

        System.out.println("---DESPUÉS---");

        aux=30;
        c=b;
        b=aux;
        a=c;

        System.out.println("-Valor de A:" + a + " -Valor de B:" + b + " -Valor de C:" +c);

        System.out.println("---NUEVA VERSIÓN");

        aux=10;
        a=b;
        b=c;
        c=aux;


        System.out.println("-Valor de A:" + a + " -Valor de B:" + b + " -Valor de C: " +c);

        System.out.println("---CON UNA VARIABLE MÁS---");

        int d=40;

        aux=10;
        a=b;
        b=c;
        c=d;
        d=aux;

        System.out.println("-El Valor de A:" + a + " -El Valor de B: " + b + " -El Valor de C: " + c + " -El Valor de D:" + d);






    }
}