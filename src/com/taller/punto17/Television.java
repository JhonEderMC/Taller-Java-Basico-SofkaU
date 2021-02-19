package com.taller.punto17;

public class Television  extends Electrodomestico{

    private static final Integer RESOLUCION_POR_DEFECTO=20;
    private static final Boolean TDT_POR_DEFECTO= Boolean.FALSE;

    private Integer resolucion;
    private Boolean tdt;

    public Television() {
        super();
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.tdt = TDT_POR_DEFECTO;
    }

    public Television(Double precioBase, Double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.tdt = TDT_POR_DEFECTO;
    }

    public Television(Double precioBase, String color, Character consumoEnergetico, Double peso, Integer resolucion, Boolean tdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
        //precioFinal();
    }

    public void precioFinal(){
        super.precioFinal();//llama a papa pa hacer calculos chingones
        Double precio = this.getPrecioBase();
        if(this.resolucion>40){ //si es muy grande
            precio +=precio*0.3;
        }if(tdt){ //si tiene tdt
            precio +=50;
        }
        this.setPrecioBase(precio);
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getTdt() {
        return tdt;
    }

    @Override
    public String toString() {
        return "Television{" +
                "resolucion=" + resolucion +
                ", tdt=" + tdt +
                ", precio="+ this.getPrecioBase()+
                '}';
    }
}
