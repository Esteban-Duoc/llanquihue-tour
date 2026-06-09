# llanquihue-tour
Sistema básico en Java para la gestión de personas y guías turísticos de una agencia de turismo.
Desarrollo Orientado a Objetos I
Autor del proyecto
Nombre completo: Esteban Medina
Carrera: Analista programador computacional
Sección: Desarrollo orientado a objetos
Sede: Online
Descripción general del sistema

Este proyecto corresponde a un sistema orientado a objetos desarrollado en Java para representar personas relacionadas con una agencia de turismo llamada Llanquihue Tour.

El sistema fue desarrollado aplicando principios fundamentales de la Programación Orientada a Objetos, incluyendo encapsulamiento, composición y herencia.

Estructura del proyecto

src/

├── app/

│ └── Main.java

│

└── model/

├── Direccion.java

├── Persona.java

└── GuiaTuristico.java

Clases implementadas
Direccion

Representa la dirección de una persona mediante los atributos calle, ciudad y región.

Persona

Clase base que representa una persona dentro del sistema. Contiene información como nombre, RUT y dirección.

GuiaTuristico

Clase que hereda de Persona y agrega el atributo especialidad para representar a un guía turístico.

Relaciones entre clases
Herencia

La clase GuiaTuristico hereda de Persona mediante la palabra reservada extends.

Composición

La clase Persona contiene un objeto de tipo Direccion, representando la dirección asociada a cada persona.

Características implementadas
Encapsulamiento mediante atributos privados.
Métodos Getters y Setters.
Constructores.
Herencia.
Composición.
Método toString() para mostrar la información de los objetos.
Instrucciones de ejecución
Abrir el proyecto en IntelliJ IDEA.
Ejecutar la clase Main.java ubicada en el paquete app.
Visualizar los resultados en la consola.
