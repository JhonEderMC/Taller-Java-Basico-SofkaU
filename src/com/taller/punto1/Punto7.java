package com.taller.punto1;

import com.taller.teclado.Teclado;

public class Punto7 {

    public static void ingreseNumero(){

        Double numero =0.0;
        do {
            System.out.println("Ingresar un número: ");
            numero = Teclado.entradaDouble();
        }while (numero<0);
    }

    public static void main(String[] args) {
        Punto7.ingreseNumero();
    }
}
