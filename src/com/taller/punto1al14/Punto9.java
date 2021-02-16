package com.taller.punto1al14;

import com.taller.teclado.Teclado;

public class Punto9 {

    public static  String frase ="La sonrisa sera\n" +
            "la mejor arma contra la tristeza";

    public static void reemplazarAporE(){
        System.out.println("Old prhase: "+frase);
        frase = frase.replace('a','e');
        System.out.println("new prhase: "+frase);
    }

    public static void concatenarTexto(String texto){
        frase.concat(" "+texto);
        System.out.println("new prhase: "+frase);
    }

    public static void main(String[] args) {
        Punto9.reemplazarAporE();
        System.out.println("Engrese un texto: ");
        String texto = Teclado.entradaTexto();
        Punto9.concatenarTexto(texto);
    }
}
