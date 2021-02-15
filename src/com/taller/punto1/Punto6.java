package com.taller.punto1;

public class Punto6 {

    public static void numerosParesEImpares(){
        for(int i=0;i<=100;i++){
            System.out.print("El numero "+i+ " es: ");
            if((i%2)==0){
                System.out.println("Par");
            }else {
                System.out.println("Impar");
            }
        }
    }

    public static void main(String[] args) {
        Punto5.numerosParesEImpares();
    }

}
