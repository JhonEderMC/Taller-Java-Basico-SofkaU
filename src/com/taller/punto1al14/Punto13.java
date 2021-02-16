package com.taller.punto1al14;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Punto13 {

    public static void fechaActual(){
        DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (hh:mm:ss)");
        LocalDateTime tiempo  =LocalDateTime.now();
        System.out.println("fecha: "+tiempo.format(esDateFormat));
    }

    public static void main(String[] args) {
       Punto13.fechaActual();

    }
}

