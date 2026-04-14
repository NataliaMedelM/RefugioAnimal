package animales;

import modelo.Animal;

public class Gato extends Animal {

    private boolean cazador;

    public Gato(String nombre, int edad) {
        super(nombre, "Gato", edad);
        this.cazador = true;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau! 🐱");
    }

    public boolean esCazador() {
        return cazador;
    }

    public void setCazador(boolean cazador) {
        this.cazador = cazador;
    }
}