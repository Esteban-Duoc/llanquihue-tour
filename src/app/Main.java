package app;

import data.LectorDatos;
import service.PersonaService;
import util.Validador;

public class Main {

    public static void main(String[] args) {

        try {

            if (!Validador.textoValido("Juan Perez")) {
                throw new IllegalArgumentException("El nombre no puede estar vacío.");
            }

            if (!Validador.rutValido("12.345.678-9")) {
                throw new IllegalArgumentException("El RUT no puede estar vacío.");
            }

            PersonaService servicio = new PersonaService();

            System.out.println("===== DATOS CARGADOS DESDE ARCHIVO CSV =====");

            LectorDatos.leerArchivo("personas.csv", servicio);

            System.out.println("\n===== PERSONAS REGISTRADAS EN ARRAYLIST =====");
            servicio.mostrarPersonas();

            System.out.println("\n===== BUSQUEDA POR CIUDAD: Puerto Varas =====");
            servicio.buscarPorCiudad("Puerto Varas");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}