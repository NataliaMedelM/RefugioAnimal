package animales;

import modelo.Animal;

public class Perro extends Animal {

    private boolean entrenado;

    public Perro(String nombre, int edad) {
        super(nombre, "Perro", edad);
        this.entrenado = false;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau! 🐶");
    }

    public boolean isEntrenado() {
        return entrenado;
    }

    public void entrenar() {
        this.entrenado = true;
        System.out.println(nombre + " ha sido entrenado. 🐾");
    }

    private void moverCola() {
        System.out.println(nombre + " mueve la cola de felicidad.");
    }

    public void saludar() {
        System.out.println(nombre + " se acerca...");
        moverCola();
    }

    // SOBRECARGA
    public void alimentar() {
        System.out.println(nombre + " está comiendo croquetas.");
    }

    public void alimentar(String comida) {
        System.out.println(nombre + " está comiendo " + comida + ".");
    }

    public void alimentar(String comida, int cantidad) {
        System.out.println(nombre + " comió " + cantidad + " gramos de " + comida + ".");
    }
}