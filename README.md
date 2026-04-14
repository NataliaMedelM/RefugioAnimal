# 🐾 Refugio Animal

Proyecto en Java que demuestra la aplicación de los principales conceptos de **Programación Orientada a Objetos (POO)** mediante un sistema simple de gestión de animales.

---

## 🎯 Objetivo

Desarrollar una estructura de clases que permita representar animales utilizando:

* Herencia
* Polimorfismo
* Encapsulamiento
* Clases abstractas
* Interfaces
* Sobrecarga de métodos

---

## 🧠 Conceptos Aplicados

✔️ **Herencia**:
Las clases `Perro` y `Gato` extienden de la clase base `Animal`.

✔️ **Polimorfismo**:
Uso de un arreglo de tipo `Animal` que permite manejar distintos tipos de objetos (`Perro`, `Gato`) de forma uniforme.

✔️ **Encapsulamiento**:
Uso de atributos `private` con métodos públicos (getters y setters).

✔️ **Clases abstractas**:
La clase `Animal` define comportamiento común y obliga a las subclases a implementar métodos.

✔️ **Sobrescritura de métodos (@Override)**:
Cada subclase redefine el método `hacerSonido()`.

✔️ **Sobrecarga de métodos (Overloading)**:
El método `alimentar()` en `Perro` tiene múltiples versiones.

✔️ **Interfaces**:
Definición de contratos como `Adoptable` y `Entrenable`.

---

## 📁 Estructura del Proyecto

```
src/
├── app/
│   └── Main.java
├── modelo/
│   └── Animal.java
├── animales/
│   ├── Perro.java
│   └── Gato.java
├── interfaces/
│   ├── Adoptable.java
│   └── Entrenable.java
```

---

## ▶️ Ejecución

El programa se ejecuta desde la clase:

```
app.Main
```

Al ejecutarlo, se crean distintos animales y se muestra en consola:

* Información del animal
* Sonido característico
* Ejemplo de polimorfismo
* Uso de sobrecarga de métodos

---

## 🧪 Ejemplo de salida

```
Nombre: Max
Especie: Perro
Edad: 2 años
Max dice: ¡Guau! 🐶
---
Nombre: Luna
Especie: Gato
Edad: 4 años
Luna dice: ¡Miau! 🐱
---
```

---

## 🚀 Tecnologías utilizadas

* Java
* Programación Orientada a Objetos (POO)

---

## 👨‍💻 Autor

Proyecto desarrollado como ejercicio académico para reforzar conceptos de POO en Java.

---

## 📌 Notas

* Proyecto enfocado en aprendizaje y práctica.
* No incluye persistencia de datos ni interfaz gráfica.
* Estructura preparada para futuras mejoras.

---
