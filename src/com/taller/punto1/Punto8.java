package com.taller.punto1;

import com.taller.teclado.Teclado;

public class Punto8 {



    public static void diaDelaSemana(Integer dia){
        switch ((int) dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado no es un dia laboral");
                break;
            case 7:
                System.out.println("Domingo no es un dia laboral");
                break;
            default:
                System.out.println("Ingrese un dia valido");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.print("Ingrese un dia de la semana: ");
        Integer dia = Teclado.entradaInteger();
        Punto8.diaDelaSemana(dia);
    }

}
