package model;

public class GuiaTuristico extends Persona {

    private String especialidad;

    public GuiaTuristico(String nombre, String rut,
                         Direccion direccion, String especialidad) {
        super(nombre, rut, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEspecialidad: " + especialidad;
    }
}