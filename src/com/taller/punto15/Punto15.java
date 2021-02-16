package com.taller.punto15;

import com.taller.teclado.Teclado;

public class Punto15 {
    public static final String TITULO ="\n****** GESTION CINEMATOGRÁFICA ********\n";
    public static final String NUEVO_ACTOR ="1 - NUEVO ACTOR\n";
    public static final String BUSCAR_ACTOR ="2 - BUSCAR ACTOR\n";
    public static final String ELIMANAR_ACTOR ="3 - ELIMINAR ACTOR\n";
    public static final String MODIFICAR_ACTOR="4 - MODIFICAR ACTOR\n";
    public static final String VER_TODOS_ACTORES="5 - VER TODOS LOS ACTORES\n";
    public static final String VER_PELICULAS_ACTORES = "6 - VER PELICULAS DE LOS ACTORES\n";
    public static final String VER_CATEGORIA = "7 - VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n";
    public static final String SALIR = "8 - SALIR\n";


    public void menuLCD(){
        boolean parar = true;
        do{
            System.out.print(TITULO+NUEVO_ACTOR+BUSCAR_ACTOR+ELIMANAR_ACTOR+
                    MODIFICAR_ACTOR+VER_TODOS_ACTORES+VER_PELICULAS_ACTORES+VER_CATEGORIA
                    +SALIR);
            System.out.print("Ingrese una opcion: ");
            Integer opcion = Teclado.entradaInteger();
            parar = menuSwitch(opcion);
        }while (parar);
    }

    public boolean menuSwitch(Integer opcion){
        switch (opcion){
            case 1:
                return true;
               //break;
            case 2:
                return true;
                //break;
            case 3:
                return true;
                //break;
            case 4:
                return true;
                //break;
            case 5:
                return true;
                //break;
            case 6:
                return true;
                //break;
            case 7:
                return true;
                //break;
            case 8:
                return false;
                //break;
            default:
                return true;
                //break;
        }
    }

    public static void main(String[] args) {
        Punto15 p15 = new Punto15();
        p15.menuLCD();
    }
}
