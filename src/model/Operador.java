package model;

public class Operador extends Persona {

    private String empresa;

    public Operador(String nombre, String rut,
                    Direccion direccion, String empresa) {
        super(nombre, rut, direccion);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmpresa: " + empresa;
    }
}