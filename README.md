Tour por Llanquihue

Desarrollo Orientado a Objetos I
Autor: Esteban Medina  
Carrera: Analista Programador Computacional  
Asignatura: Desarrollo Orientado a Objetos I  
Sede: Online

---

Descripción

Llanquihue Tour es un proyecto desarrollado en Java que simula la gestión de personas y servicios turísticos de una agencia de turismo.
Durante las distintas actividades del curso se fueron incorporando nuevos conceptos de Programación Orientada a Objetos, como encapsulamiento, herencia, composición, manejo de colecciones, lectura de archivos CSV y organización del proyecto por paquetes.


Estructura del proyecto

```
src/
│
├── app/
│   └── Main.java
│
├── ui/
│   └── Main.java
│
├── data/
│   ├── GestorServicios.java
│   └── LectorDatos.java
│
├── model/
│   ├── Persona.java
│   ├── Direccion.java
│   ├── Cliente.java
│   ├── GuiaTuristico.java
│   ├── Operador.java
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── service/
│   └── PersonaService.java
│
└── util/
    └── Validador.java
```
Clases implementadas
Persona
Clase base que almacena el nombre, RUT y dirección de una persona.
Direccion
Representa la dirección mediante calle, ciudad y región.
Cliente
Hereda de Persona y agrega el tipo de tour contratado.
GuiaTuristico
Hereda de Persona y agrega la especialidad del guía.
Operador
Hereda de Persona y agrega la empresa a la que pertenece.
ServicioTuristico
Clase base que representa un servicio turístico mediante los atributos nombre y duración en horas.
RutaGastronomica
Hereda de ServicioTuristico y agrega el número de paradas de la ruta.
PaseoLacustre
Hereda de ServicioTuristico y agrega el tipo de embarcación utilizada.
ExcursionCultural
Hereda de ServicioTuristico y agrega el lugar histórico visitado.
PersonaService
Administra las personas registradas utilizando un ArrayList. Permite agregar personas, mostrarlas y buscarlas por ciudad.
LectorDatos
Lee el archivo **personas.csv**, crea automáticamente los objetos Cliente, GuiaTuristico u Operador y los registra en el sistema.
GestorServicios
Crea instancias de prueba de los distintos servicios turísticos y las muestra por consola.
Conceptos aplicados
- Encapsulamiento.
- Herencia.
- Composición.
- Sobrescritura del método `toString()`.
- Constructores.
- Getters y Setters.
- Uso de `ArrayList`.
- Lectura de archivos CSV.
- Organización del proyecto mediante paquetes.
- Validación básica de datos.
Funcionalidades
- Registro de clientes, guías turísticos y operadores.
- Lectura automática de información desde `personas.csv`.
- Creación automática de objetos a partir del archivo CSV.
- Almacenamiento de personas en un ArrayList.
- Búsqueda de personas por ciudad.
- Representación de servicios turísticos mediante herencia.
- Creación y visualización de rutas gastronómicas, paseos lacustres y excursiones culturales.
Ejecución
Gestión de personas
Ejecutar la clase:

```
app.Main
```
Permite cargar los datos desde `personas.csv`, registrar las personas y realizar búsquedas por ciudad.
Servicios turísticos
Ejecutar la clase:
```
ui.Main
```
Muestra las instancias de los distintos servicios turísticos creados para la actividad de herencia simple.
Archivo utilizado
```
personas.csv
```
Contiene la información utilizada para crear automáticamente los objetos Cliente, GuiaTuristico y Operador.
