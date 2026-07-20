# Tour por Llanquihue

**Desarrollo Orientado a Objetos I**

**Autor:** Esteban Medina  
**Carrera:** Analista Programador Computacional  
**Asignatura:** Desarrollo Orientado a Objetos I  
**Sede:** Online

## Descripción

Llanquihue Tour es un proyecto desarrollado en Java que simula la gestión de personas y servicios turísticos de una agencia de turismo. Durante las distintas actividades del curso se fueron incorporando conceptos de Programación Orientada a Objetos, como encapsulamiento, herencia, composición, polimorfismo, interfaces, manejo de colecciones, lectura de archivos TXT y organización del proyecto por paquetes.

## Estructura del proyecto

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
├── exceptions/
│   └── RutInvalidoException.java
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
│   ├── ExcursionCultural.java
│   └── Registrable.java
│
├── service/
│   └── PersonaService.java
│
└── util/
    └── Validador.java
```

## Clases implementadas

**Persona:** Clase base que almacena el nombre, RUT y dirección de una persona.

**Direccion:** Representa la dirección mediante calle, ciudad y región.

**Cliente:** Hereda de Persona y agrega el tipo de tour contratado.

**GuiaTuristico:** Hereda de Persona y agrega la especialidad del guía.

**Operador:** Hereda de Persona y agrega la empresa a la que pertenece.

**ServicioTuristico:** Clase base que representa un servicio turístico mediante los atributos nombre y duración en horas.

**RutaGastronomica:** Hereda de ServicioTuristico y agrega el número de paradas de la ruta.

**PaseoLacustre:** Hereda de ServicioTuristico y agrega el tipo de embarcación utilizada.

**ExcursionCultural:** Hereda de ServicioTuristico y agrega el lugar histórico visitado.

**Registrable:** Interfaz que permite implementar un comportamiento común mediante el método `mostrarResumen()`.

**PersonaService:** Administra las personas registradas utilizando un ArrayList y un HashMap. Permite agregar personas, mostrarlas y buscarlas por ciudad o RUT.

**LectorDatos:** Lee el archivo `personas.txt`, crea automáticamente los objetos Cliente, GuiaTuristico u Operador y los registra en el sistema.

**GestorServicios:** Gestiona los distintos servicios turísticos utilizando polimorfismo e interfaces.

**Validador:** Contiene métodos para validar texto y RUT utilizando una excepción personalizada.

## Conceptos aplicados

- Encapsulamiento.
- Herencia.
- Composición.
- Polimorfismo.
- Interfaces.
- Sobrescritura de métodos (`@Override`).
- Sobrecarga de constructores.
- Constructores.
- Getters y Setters.
- Uso de ArrayList.
- Uso de HashMap.
- Lectura de archivos TXT.
- Excepciones personalizadas.
- Organización del proyecto mediante paquetes.
- Validación de datos.

## Funcionalidades

- Registro de clientes, guías turísticos y operadores.
- Lectura automática de información desde `personas.txt`.
- Creación automática de objetos a partir del archivo TXT.
- Almacenamiento de personas mediante ArrayList y HashMap.
- Búsqueda de personas por ciudad.
- Búsqueda de personas por RUT.
- Representación de servicios turísticos mediante herencia.
- Uso de listas polimórficas e interfaces.
- Creación y visualización de rutas gastronómicas, paseos lacustres y excursiones culturales.

## Ejecución

### Gestión de personas

Ejecutar la clase:

```
app.Main
```

Permite cargar los datos desde `personas.txt`, registrar las personas y realizar búsquedas por ciudad y RUT.

### Servicios turísticos

Ejecutar la clase:

```
ui.Main
```

Permite registrar y visualizar servicios turísticos utilizando herencia, interfaces y polimorfismo.

## Archivo utilizado

```
personas.txt
```

Contiene la información utilizada para crear automáticamente los objetos Cliente, Guía Turístico y Operador.
