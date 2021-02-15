package com.taller.teclado;

import java.util.Scanner;

/**
 * Clase manejo scanner
 */
public class Teclado {

    public static String entrada(){
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextLine();
    }

}
