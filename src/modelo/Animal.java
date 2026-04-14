package modelo;

public class Animal {

    protected String nombre;
    protected String especie;
    protected int edad;

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico.");
    }

    public String getNombre() {
        return nombre;
    }
}