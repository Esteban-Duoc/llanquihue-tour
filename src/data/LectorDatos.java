package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import model.Cliente;
import model.Direccion;
import model.GuiaTuristico;
import model.Operador;
import service.PersonaService;
import util.Validador;

public class LectorDatos {

    public static void leerArchivo(String ruta, PersonaService servicio) {

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length != 7) {
                    System.out.println("Línea inválida: " + linea);
                    continue;
                }

                String tipo = datos[0];
                String nombre = datos[1];
                String rut = datos[2];
                String calle = datos[3];
                String ciudad = datos[4];
                String region = datos[5];
                String datoExtra = datos[6];

                if (!Validador.textoValido(nombre)) {
                    System.out.println("Nombre inválido.");
                    continue;
                }

                try {
                    Validador.validarRut(rut);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                Direccion direccion = new Direccion(calle, ciudad, region);

                switch (tipo.toUpperCase()) {

                    case "CLIENTE":
                        servicio.agregarPersona(
                                new Cliente(nombre, rut, direccion, datoExtra)
                        );
                        break;

                    case "GUIA":
                        servicio.agregarPersona(
                                new GuiaTuristico(nombre, rut, direccion, datoExtra)
                        );
                        break;

                    case "OPERADOR":
                        servicio.agregarPersona(
                                new Operador(nombre, rut, direccion, datoExtra)
                        );
                        break;

                    default:
                        System.out.println("Tipo de persona desconocido: " + tipo);
                        break;
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}