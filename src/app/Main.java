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

            Validador.validarRut("12.345.678-9");

            PersonaService servicio = new PersonaService();

            System.out.println("===== DATOS CARGADOS DESDE ARCHIVO TXT =====");

            System.out.println(System.getProperty("user.dir"));

            LectorDatos.leerArchivo("personas.txt", servicio);

            System.out.println("\n===== PERSONAS REGISTRADAS =====");
            servicio.mostrarPersonas();

            System.out.println("\n===== BÚSQUEDA POR CIUDAD: Puerto Varas =====");
            servicio.buscarPorCiudad("Puerto Varas");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}