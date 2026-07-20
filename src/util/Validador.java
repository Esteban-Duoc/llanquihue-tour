package util;

import exceptions.RutInvalidoException;

public class Validador {

    public static boolean textoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static void validarRut(String rut) throws RutInvalidoException {

        if (rut == null || rut.trim().isEmpty()) {
            throw new RutInvalidoException("El RUT no puede estar vacío.");
        }

        String regex = "^\\d{1,2}\\.\\d{3}\\.\\d{3}-[0-9kK]$";

        if (!rut.matches(regex)) {
            throw new RutInvalidoException(
                    "Formato de RUT inválido. Ejemplo: 12.345.678-9");
        }
    }
}