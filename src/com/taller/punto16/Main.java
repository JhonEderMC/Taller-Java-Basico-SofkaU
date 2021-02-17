package com.taller.punto16;


import com.taller.teclado.Teclado;

public class Main {

    public static void estadoIMC(Integer estado){
        if(estado.equals(-1)){
            System.out.println("Usted esta muy por debajo de su peso.");
        }else if(estado.equals(0)){
            System.out.println("Usted esta en su peso ideal.");
        }else{
            System.out.println("Usted tiene  sobre peso");
        }
    }

    public static void main(String[] args) {
        System.out.print("Ingrese el nombre: ");
        String nombre= Teclado.entradaTexto();
        System.out.print("Ingrese la edad: ");
        Integer edad = Teclado.entradaInteger();
        System.out.print("Ingrese el sexo[M o H]: ");
        Character sexo = Teclado.entradaTexto().charAt(0);
        System.out.print("Ingrese el peso(kg): ");
        Double peso = Teclado.entradaDouble();
        System.out.print("Ingrese la altura: ");
        Double altura = Teclado.entradaDouble();
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);

        System.out.println("\nPersona 1: ");
        System.out.println("Es mayor de edad: "+persona1.esMayorDeEdad());
        System.out.println(persona1.toString());
        Main.estadoIMC(persona1.calcularIMC());

        System.out.println("\nPersona 2: ");
        System.out.println("Es mayor de edad: "+persona2.esMayorDeEdad());
        System.out.println(persona2.toString());
        Main.estadoIMC(persona2.calcularIMC());

        System.out.println("\nPersona 3: ");
        System.out.println("Es mayor de edad: "+persona3.esMayorDeEdad());
        System.out.println(persona3.toString());
        Main.estadoIMC(persona3.calcularIMC());



    }

}
