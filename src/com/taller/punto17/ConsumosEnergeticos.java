package com.taller.punto17;

public enum ConsumosEnergeticos {
    A(100.0),B(80.0),C(60.0),D(50.0),E(30.0),F(10.0);

    private Double valor;

    ConsumosEnergeticos(Double valor){
        this.valor = valor;
    }
    public Double getValor() {
        return valor;
    }

}
