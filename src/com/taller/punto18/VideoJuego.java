package com.taller.punto18;

public class VideoJuego {

    private static final Integer HORAS_ESTIMADAS_POR_DEFECTO=10;
    private static final Boolean ENTREGADO_POR_DEFECTO=Boolean.FALSE;

    private String titulo;
    private Integer horasEstimadas;
    private Boolean entregado;
    private String genero;
    private String compania;

    public VideoJuego() {
        this.horasEstimadas = HORAS_ESTIMADAS_POR_DEFECTO;
        this.entregado = ENTREGADO_POR_DEFECTO;
    }

    public VideoJuego(String titulo, Integer horasEstimadas) {
        this();
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulo, Integer horasEstimadas, String genero, String compania) {
        this(titulo, horasEstimadas);
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }
}
