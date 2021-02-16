package com.taller.punto1al14;

import com.taller.teclado.Teclado;

/**
 * Pedir dos palabras por teclado, indicar si son iguales
 * , sino son iguales mostrar sus  diferencias.
 */
public class Punto12 {

    public static void comparar(String text1, String text2){
        text1= text1.trim();//remover espacios en blancos a ambos lados
        text2 = text2.trim();
        System.out.println(text1 +"\n"+text2);
        //son iguales sin importar mayusculas y minusculas
        String diferencias="";
        if(text1.equalsIgnoreCase(text2)){
            System.out.println("Son iguales");
            //TODO: Recorrerlos char a char y mostrar donde no son iguales (ir sustituyendo los char igules con *
            // y los diferentes dejarlos).
            for (int i = 0; i <text1.length() ; i++) {
                char t1 = text1.charAt(i);
                char t2 = text2.charAt(i);
                if (t1 == t2 && t1 != ' '){ //si no hay diferencias y no es un espacio en blanco
                    //diferencias.concat("*");
                    diferencias = diferencias +"*";
                }else if (t1 != t2 ){ //si son diferentes
                    String.valueOf(t1);
                   // diferencias.concat(String.valueOf(t1));
                    diferencias = diferencias +t1;
                }else { //si son iguales a un espacio en blanco
                    //diferencias.concat(String.valueOf(' '));
                    diferencias = diferencias +' ';
                }
            }
            System.out.print("\nTexto1: \t"+text1);
            System.out.print("\nTexto2: \t"+text2);
            System.out.print("\nDifern: \t"+diferencias);
        }
    }

    public static void main(String[] args) {
        System.out.print("Ingrese texto1: ");
        String text1 = Teclado.entradaTexto();
        System.out.print("Ingrese texto2: ");
        String text2 = Teclado.entradaTexto();
        Punto12.comparar(text1, text2);
    }


}
