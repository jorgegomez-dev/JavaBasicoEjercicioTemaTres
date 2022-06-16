package com.ejercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de palabras a imprimir: ");
        int nombresLenght = Integer.parseInt(teclado.nextLine());
        String[] nombres = new String[nombresLenght];

        for (int i = 0; i < nombresLenght; i++) {
            System.out.println("Ingrese la palabra #" + (i+1) + ":");
            nombres[i] = teclado.nextLine();
        }

        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }
    }
}