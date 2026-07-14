package util;

public class Validador {

    public static boolean textoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean rutValido(String rut) {
        return rut != null && !rut.trim().isEmpty();
    }
}