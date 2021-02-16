package com.taller.punto1al14;

import com.taller.teclado.Teclado;

public class Punto3 {

    private static void areaCirculo(){
        System.out.println("Ingrese el radio: ");
        Double radio = Double.parseDouble(Teclado.entradaTexto());
        Double area= Math.PI*(Math.pow(radio, 2));
        System.out.println("El area es: "+area);
    }

    public static void main(String[] args) {
        Punto3.areaCirculo();
    }

}
