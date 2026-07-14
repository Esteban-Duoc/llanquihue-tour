package model;

public class Cliente extends Persona {

    private String tipoTour;

    public Cliente(String nombre, String rut,
                   Direccion direccion, String tipoTour) {
        super(nombre, rut, direccion);
        this.tipoTour = tipoTour;
    }

    public String getTipoTour() {
        return tipoTour;
    }

    public void setTipoTour(String tipoTour) {
        this.tipoTour = tipoTour;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de Tour: " + tipoTour;
    }
}