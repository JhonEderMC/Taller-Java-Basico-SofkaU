package com.taller.punto1al14;

import com.taller.teclado.Teclado;

public class Punto2 {

    public static void entradaNumeros(){
        System.out.println("Ingrese numero 1: ");
        Double numero1=Double.parseDouble(Teclado.entradaTexto());
        System.out.println("Ingrese numero 2: ");
        Double numero2 = Double.parseDouble(Teclado.entradaTexto());
        Punto1.numeroMayor(numero1, numero2);
    }

    public static void main(String[] args) {
        Punto2.entradaNumeros();
    }
}
