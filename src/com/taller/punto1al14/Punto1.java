package com.taller.punto1al14;


public class Punto1 {


    private static final String MENAJE_MAYOR="El numero mayor es: ";
    private static final String MENAJE_SON_IGUALES="Los numeros son iguales ";

    public  static void numeroMayor(Double numero1, Double numero2){
        if(numero1 > numero2){
            System.out.println(MENAJE_MAYOR+numero1);
        }else if (numero1 < numero2){
            System.out.println(MENAJE_MAYOR+numero2);
        }else {
            System.out.println(MENAJE_SON_IGUALES);
        }
    }

    public static void main(String[] args) {
        Punto1.numeroMayor(10.2, 20.2);
    }

}
