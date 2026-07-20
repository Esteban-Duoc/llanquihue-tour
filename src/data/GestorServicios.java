package data;

import java.util.ArrayList;
import model.Registrable;

public class GestorServicios {

    private ArrayList<Registrable> entidades;

    public GestorServicios() {
        entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }

    public String mostrarEntidades() {

        if (entidades.isEmpty()) {
            return "No existen registros.";
        }

        StringBuilder sb = new StringBuilder();

        for (Registrable entidad : entidades) {

            sb.append(entidad.mostrarResumen());

            if (entidad instanceof model.RutaGastronomica) {
                sb.append("\nTipo: Ruta Gastronómica");
            } else if (entidad instanceof model.PaseoLacustre) {
                sb.append("\nTipo: Paseo Lacustre");
            } else if (entidad instanceof model.ExcursionCultural) {
                sb.append("\nTipo: Excursión Cultural");
            } else if (entidad instanceof model.GuiaTuristico) {
                sb.append("\nTipo: Guía Turístico");
            } else if (entidad instanceof model.Cliente) {
                sb.append("\nTipo: Cliente");
            } else if (entidad instanceof model.Operador) {
                sb.append("\nTipo: Operador");
            }

            sb.append("\n");
            sb.append("--------------------------------");
            sb.append("\n");
        }

        return sb.toString();
    }

}