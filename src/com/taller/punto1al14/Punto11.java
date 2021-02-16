package com.taller.punto1al14;

import com.taller.teclado.Teclado;

public class Punto11 {

    public static void contarVocales(String texto){
        int countA=0,countE=0, countI=0,countO=0, countU=0;
        System.out.println("La longitud del string es: "+texto.length());
        texto = texto.toLowerCase(); //minuscula todo.
        for (int i = 0; i <texto.length() ; i++) {
            char v=texto.charAt(i);
            if(v == 'a'){
                countA++;
            }else if(v =='e'){
                countE++;
            }else if(v=='i'){
                countI++;
            }else if (v =='o'){
                countO++;
            }else if(v == 'u'){
                countU++;
            }
        }
        System.out.println("a: "+countA);
        System.out.println("e: "+countE);
        System.out.println("i: "+countI);
        System.out.println("o: "+countO);
        System.out.println("u: "+countU);
    }

    public void countVocal(char v){
        switch (v){
            case 'a':
                //countA++;
                break;
            case 'b':
                //countA++;
                break;
        }

    }

    public static void main(String[] args) {
        System.out.print("Ingrese una frase: ");
        String texto= Teclado.entradaTexto();
        Punto11.contarVocales(texto);
    }
}
