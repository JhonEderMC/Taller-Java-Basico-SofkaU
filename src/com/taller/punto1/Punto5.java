package com.taller.punto1;

public class Punto5 {

    public static void numerosParesEImpares(){
        int i=1;
        while(i<101){
            System.out.print("El numero "+i+ " es: ");
            if((i%2)==0){
                System.out.println("Par");
            }else {
                System.out.println("Impar");
            }
            i++;
        }

    }

    public static void main(String[] args) {
        Punto5.numerosParesEImpares();
    }
}
