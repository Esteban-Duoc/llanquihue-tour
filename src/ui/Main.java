package ui;

import data.GestorServicios;
import model.*;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        while (true) {

            String opcion = JOptionPane.showInputDialog(
                    "===== LLANQUIHUE TOUR =====\n\n" +
                            "1. Agregar Ruta Gastronómica\n" +
                            "2. Agregar Paseo Lacustre\n" +
                            "3. Agregar Excursión Cultural\n" +
                            "4. Agregar Guía Turístico\n" +
                            "5. Mostrar Registros\n" +
                            "6. Salir\n\n" +
                            "Seleccione una opción:");

            if (opcion == null) {
                break;
            }

            switch (opcion) {

                case "1":

                    try {
                        String nombreRuta = JOptionPane.showInputDialog("Nombre de la ruta:");
                        int duracionRuta = Integer.parseInt(JOptionPane.showInputDialog("Duración (horas):"));
                        int paradas = Integer.parseInt(JOptionPane.showInputDialog("Número de paradas:"));

                        gestor.agregarEntidad(new RutaGastronomica(
                                nombreRuta,
                                duracionRuta,
                                paradas));

                        JOptionPane.showMessageDialog(
                                null,
                                "Ruta agregada correctamente.",
                                "Llanquihue Tour",
                                JOptionPane.INFORMATION_MESSAGE);

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Debe ingresar un número válido.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    break;

                case "2":

                    try {
                        String nombrePaseo = JOptionPane.showInputDialog("Nombre del paseo:");
                        int duracionPaseo = Integer.parseInt(JOptionPane.showInputDialog("Duración (horas):"));
                        String embarcacion = JOptionPane.showInputDialog("Tipo de embarcación:");

                        gestor.agregarEntidad(new PaseoLacustre(
                                nombrePaseo,
                                duracionPaseo,
                                embarcacion));

                        JOptionPane.showMessageDialog(
                                null,
                                "Paseo agregado correctamente.",
                                "Llanquihue Tour",
                                JOptionPane.INFORMATION_MESSAGE);

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Debe ingresar un número válido.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    break;

                case "3":

                    try {
                        String nombreExcursion = JOptionPane.showInputDialog("Nombre de la excursión:");
                        int duracionExcursion = Integer.parseInt(JOptionPane.showInputDialog("Duración (horas):"));
                        String lugar = JOptionPane.showInputDialog("Lugar histórico:");

                        gestor.agregarEntidad(new ExcursionCultural(
                                nombreExcursion,
                                duracionExcursion,
                                lugar));

                        JOptionPane.showMessageDialog(
                                null,
                                "Excursión agregada correctamente.",
                                "Llanquihue Tour",
                                JOptionPane.INFORMATION_MESSAGE);

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Debe ingresar un número válido.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    break;

                case "4":

                    String nombre = JOptionPane.showInputDialog("Nombre del guía:");
                    String rut = JOptionPane.showInputDialog("RUT:");
                    String calle = JOptionPane.showInputDialog("Calle:");
                    String ciudad = JOptionPane.showInputDialog("Ciudad:");
                    String region = JOptionPane.showInputDialog("Región:");
                    String especialidad = JOptionPane.showInputDialog("Especialidad:");

                    Direccion direccion = new Direccion(calle, ciudad, region);

                    gestor.agregarEntidad(new GuiaTuristico(
                            nombre,
                            rut,
                            direccion,
                            especialidad));

                    JOptionPane.showMessageDialog(
                            null,
                            "Guía turístico agregado correctamente.",
                            "Llanquihue Tour",
                            JOptionPane.INFORMATION_MESSAGE);

                    break;

                case "5":

                    JOptionPane.showMessageDialog(
                            null,
                            gestor.mostrarEntidades(),
                            "Registros",
                            JOptionPane.INFORMATION_MESSAGE);

                    break;

                case "6":

                    JOptionPane.showMessageDialog(
                            null,
                            "Gracias por utilizar Llanquihue Tour.",
                            "Llanquihue Tour",
                            JOptionPane.INFORMATION_MESSAGE);

                    System.exit(0);

                    break;

                default:

                    JOptionPane.showMessageDialog(
                            null,
                            "Opción inválida.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
            }

        }

    }

}