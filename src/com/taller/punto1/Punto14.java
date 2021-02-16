package com.taller.punto1;

import com.taller.teclado.Teclado;

public class Punto14 {

    public static void imprimirNumeros(Integer number){
        for(int i=number;i<=1000;i=i+2){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Ingrese un numero: ");
        Integer number = Teclado.entradaInteger();
        Punto14.imprimirNumeros(number);
    }
}
