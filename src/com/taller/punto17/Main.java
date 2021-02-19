package com.taller.punto17;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    private ArrayList<Electrodomestico> array;
    private Double totalElecto=0d;
    private Double totalLava=0d;
    private Double totalTele=0d;

    public Main(){
        array = new ArrayList<Electrodomestico>();
    }

    public void llenarArreglo(){

        Electrodomestico electrodomestico1 = new Electrodomestico();
        Electrodomestico electrodomestico2 = new Electrodomestico(40.3, 20d);
        Electrodomestico electrodomestico3 = new Electrodomestico(30.0, "gris", 'B',22d);
        Electrodomestico lavadora1 = new Lavadora();
        Lavadora lavadora2 = new Lavadora(60d, 25d);
        Lavadora lavadora3 = new Lavadora(30.0, "gris", 'B',22d, 60);
        Television television1 = new Television();
        Television television2 = new Television(20d, 4d);
        Television television3 = new Television(30.0, "gris", 'B',22d,  50, true );
        array.add(electrodomestico1); array.add(electrodomestico2); array.add(electrodomestico3);
        array.add(lavadora1);array.add(lavadora2); array.add(lavadora3);
        array.add(television1);array.add(television2);array.add(television3);
    }

    public void sumarPreciosArray() {

        for (Electrodomestico e : array) {
            e.precioFinal();
            if (e instanceof Lavadora) {
                totalLava += e.getPrecioBase();
            } else if (e instanceof Television) {
                totalTele += e.getPrecioBase();
            } else {
                totalElecto += e.getPrecioBase();
            }
        }
    }


    public static void main(String[] args) {
        //Double precioBase, String color, Character consumoEnergetico, Double peso
        //Electrodomestico electrodomestico = new Electrodomestico(30.0, "negro", 'A',22d );
       // Electrodomestico electrodomestico = new Electrodomestico( );
        //System.out.println(ConsumosEnergeticos.A.getValor().toString());
        //System.out.println(electrodomestico);
        //Lavadora lavadora = new Lavadora();
        //Lavadora lavadora = new Lavadora(30.0, "gris", 'B',22d, 40);
        //System.out.println(lavadora);
        //Television television = new Television(30.0, "gris", 'B',22d,  50, true );
        //System.out.println(television);
        Main main = new Main();
        main.llenarArreglo();
        main.sumarPreciosArray();
        System.out.println("Electro domesticos: "+main.totalElecto);
        System.out.println("Electro lavadoras: "+main.totalLava);
        System.out.println("Electro Televisores: "+main.totalTele);

    }
}
