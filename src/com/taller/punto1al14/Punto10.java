package com.taller.punto1al14;

import com.taller.teclado.Teclado;

public class Punto10 {

    public static void reemplazarEspaciosBlanc(String text){
        text = text.replace(' ', '-');
        System.out.println("Texto sin espacios en blanco:\n"+text);
    }

    public static void main(String[] args) {
        System.out.println("Ingrese un texto: ");
        String text = Teclado.entradaTexto();
        Punto10.reemplazarEspaciosBlanc(text);
    }
}
