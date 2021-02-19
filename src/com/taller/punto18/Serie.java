package com.taller.punto18;

public class Serie {

    private static final Integer TEMPORADAS_POR_DEFECTO=3;
    private static final Boolean ENTREGADO_POR_DEFECTO=Boolean.FALSE;

    private String titulo;
    private Integer numeroTemporados;
    private Boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this.numeroTemporados = TEMPORADAS_POR_DEFECTO;
        this.entregado = ENTREGADO_POR_DEFECTO;
    }

    public Serie(String titulo, String creador) {
        this();
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, Integer numeroTemporados, String genero, String creador) {
        this(titulo,  creador);
        this.numeroTemporados = numeroTemporados;
        this.entregado = entregado;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumeroTemporados() {
        return numeroTemporados;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporados=" + numeroTemporados +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }
}