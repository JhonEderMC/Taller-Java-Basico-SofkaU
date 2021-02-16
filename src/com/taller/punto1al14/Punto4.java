package com.taller.punto1al14;

import com.taller.teclado.Teclado;

public class Punto4 {

    public static void calcularIva21(Double dinero){
        dinero = dinero + dinero*0.21;
        System.out.println("El precio con el 21% de iva es: "+dinero);
    }

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de dinero a calcular el IVA: ");
        Double dinero = Teclado.entradaDouble();
        Punto4.calcularIva21(dinero);
    }
}
