package service;

import model.Persona;

import java.util.ArrayList;
import java.util.HashMap;

public class PersonaService {

    private ArrayList<Persona> personas;
    private HashMap<String, Persona> personasPorRut;

    public PersonaService() {
        personas = new ArrayList<>();
        personasPorRut = new HashMap<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
        personasPorRut.put(persona.getRut(), persona);
    }

    public void mostrarPersonas() {

        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas.");
            return;
        }

        for (Persona persona : personas) {
            System.out.println(persona);
            System.out.println("--------------------");
        }
    }

    public Persona buscarPorRut(String rut) {
        return personasPorRut.get(rut);
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

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public HashMap<String, Persona> getPersonasPorRut() {
        return personasPorRut;
    }

}