package com.taller.teclado;

import java.util.Scanner;

/**
 * Clase manejo scanner
 */
public class Teclado {

    public static String entradaTexto(){
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextLine();
    }

    public static Double entradaDouble(){
        Scanner scanner = new Scanner(System.in);
        Double number=0.0;
        try{
            number = scanner.nextDouble();
        }catch (NumberFormatException e){
            System.out.println("Por favor ingrese un numero separado por punto");
        }
    return number;
    }

}
