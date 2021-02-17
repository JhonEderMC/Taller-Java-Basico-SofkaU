package com.taller.punto17;

public class Electrodomestico {
/*
    static enum colores{
        BLANCO, ROJO, NEGRO, AZUL, GRIS
    }

   static enum consumosEnergeticos{
        A,B,C,D,E,F
    }
*/
    private   static final Double PRECIO_BASE = 100.0;
    private   static final Double PESO_BASE = 5.0;

    private Double precioBase;
    private String color;
    private Character consumoEnergetico;
    private Double peso;


    public Electrodomestico() {
       this.color=Colores.BLANCO.toString();
       this.consumoEnergetico = ConsumosEnergeticos.F.toString().charAt(0);
       this.precioBase = PRECIO_BASE;
       this.peso = PESO_BASE;
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this();//
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }


    public Boolean comprobarConsumoEnergetico(Character letra){
        letra = Character.toUpperCase(letra);
        for(ConsumosEnergeticos c: ConsumosEnergeticos.values()){
            if(letra == c.toString().charAt(0)){
                return true;
            }
        }
        this.color=Colores.BLANCO.toString();//color por defecto
        return Boolean.FALSE; //Ingreso letra equivocado
    }



    public void comprobarColor(String color){
        color = color.trim();

    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }
}
