package com.gamis214;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws edadExcepcion {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        final int EDAD_MAX = 100;

        if (edad < EDAD_MAX) {
            System.out.println("BIENVENIDO");
        }else{
            throw new edadExcepcion("Edad no permitida");
        }
    }
}
