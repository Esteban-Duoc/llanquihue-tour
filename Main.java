package app;

import model.Direccion;
import model.GuiaTuristico;
import model.Persona;

public class Main {

    public static void main(String[] args) {

        Direccion d1 = new Direccion(
                "Av. Costanera 123",
                "Llanquihue",
                "Los Lagos"
        );

        Direccion d2 = new Direccion(
                "Calle Comercio 456",
                "Puerto Varas",
                "Los Lagos"
        );

        Direccion d3 = new Direccion(
                "Ruta 5 Sur Km 12",
                "Frutillar",
                "Los Lagos"
        );

        Persona cliente = new Persona(
                "Juan Perez",
                "12.345.678-9",
                d1
        );

        GuiaTuristico guia1 = new GuiaTuristico(
                "Maria Gonzalez",
                "11.222.333-4",
                d2,
                "Turismo Cultural"
        );

        GuiaTuristico guia2 = new GuiaTuristico(
                "Pedro Soto",
                "22.333.444-5",
                d3,
                "Turismo Aventura"
        );

        System.out.println(cliente);
        System.out.println("---------------------");
        System.out.println(guia1);
        System.out.println("---------------------");
        System.out.println(guia2);
    }
}