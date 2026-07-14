package service;

import model.Persona;
import java.util.ArrayList;

public class PersonaService {

    private ArrayList<Persona> personas;

    public PersonaService() {
        personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public void mostrarPersonas() {
        for (Persona persona : personas) {
            System.out.println(persona);
            System.out.println("--------------------");
        }
    }

    public void buscarPorCiudad(String ciudad) {
        boolean encontrado = false;

        for (Persona persona : personas) {
            if (persona.getDireccion().getCiudad().equalsIgnoreCase(ciudad)) {
                System.out.println(persona);
                System.out.println("--------------------");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron personas en la ciudad: " + ciudad);
        }
    }
}