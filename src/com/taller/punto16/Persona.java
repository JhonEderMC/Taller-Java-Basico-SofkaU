package com.taller.punto16;

public class Persona {

    private String nombre;
    private Integer edad;
    private Character sexo;
    private Double peso;
    private Double altura;
    private Integer DNI;

    private static final Integer  BAJO_PESO = -1;
    private static final Integer  PESO_IDEAL = 0;
    private static final Integer  SOBRE_PESO = 1;

    public Persona() {
        this.nombre = "";
        this.edad=0;
        this.sexo='H';
        this.peso=0.0;
        this.altura=0.0;
        generaDNI();
    }

    public Persona(String nombre, Integer edad, Character sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo(this.sexo);

    }

    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo(this.sexo);
        generaDNI();
    }

    /**
     * Metodo para calcular el indice de masa corporal
     * @return IMC
     */
    public Integer calcularIMC(){
        Double imc =  this.getPeso()/(Math.pow(this.getAltura(),2));
        if(imc<20){ //anemico, llevado del putas que coma algo
            return BAJO_PESO;
        }else if(imc >=20 && imc <= 25){
                return PESO_IDEAL;
        }else {
            return SOBRE_PESO;
        }
    }

   public Boolean  esMayorDeEdad(){
        if(this.getEdad()>=18){
            return Boolean.TRUE;
        }else {
            return Boolean.FALSE;
        }
   }

    private void comprobarSexo(Character sexo){
        sexo = Character.toUpperCase(sexo); //mayusculas
        if(sexo.equals('H') || sexo.equals('M')){ //si es  H o M
            this.setSexo(sexo); //si esta en minuscula
        }else{
            this.setSexo('H');
        }
    }

    private void generaDNI(){
        //Integer dni =  Integer.parseInt(String.valueOf(Math.random()*10000000+1));
        Integer dni = (int) (Math.random() * 100000000+1);
        this.DNI=dni;

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        comprobarSexo(sexo);
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ", DNI=" + DNI +
                '}';
    }



}
