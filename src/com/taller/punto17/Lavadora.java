package com.taller.punto17;

public class Lavadora  extends  Electrodomestico{

    private static final Integer CARGA_POR_DEFECTO=5;

    private Integer carga;

    public Lavadora(){
        super();//llamar por defecto a papa xD!
        this.carga = CARGA_POR_DEFECTO;
    }

    public Lavadora(Double precioBase, Double peso) {
        super(precioBase, peso);
        this.carga = CARGA_POR_DEFECTO;
    }

    public Lavadora(Double precioBase, String color, Character consumoEnergetico, Double peso, Integer carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
       // precioFinal();
    }

    public void precioFinal(){
        super.precioFinal(); //calcular precio base
        if(this.carga >30){
            this.setPrecioBase(this.getPrecioBase()+50);
        }

    }

    public Integer getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precioBase=" + this.getPrecioBase() +
                ", color='" + this.getColor()+
                ", consumoEnergetico=" + this.getConsumoEnergetico() +
                ", peso=" + this.getPeso() +
                ", carga=" + carga +
                '}';
    }
}
