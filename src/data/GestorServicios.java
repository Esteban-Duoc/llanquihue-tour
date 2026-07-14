package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class GestorServicios {

    public void mostrarServicios() {

        RutaGastronomica ruta1 = new RutaGastronomica(
                "Ruta de Sabores Llanquihue",
                4,
                5
        );

        RutaGastronomica ruta2 = new RutaGastronomica(
                "Ruta Gastronómica Frutillar",
                3,
                4
        );

        PaseoLacustre paseo1 = new PaseoLacustre(
                "Paseo Lago Llanquihue",
                2,
                "Catamarán"
        );

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Paseo Río Maullín",
                3,
                "Lancha"
        );

        ExcursionCultural excursion1 = new ExcursionCultural(
                "Museo Colonial Alemán",
                2,
                "Museo Colonial Alemán"
        );

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Iglesia de Castro",
                5,
                "Iglesia San Francisco"
        );

        System.out.println(ruta1);
        System.out.println("--------------------");

        System.out.println(ruta2);
        System.out.println("--------------------");

        System.out.println(paseo1);
        System.out.println("--------------------");

        System.out.println(paseo2);
        System.out.println("--------------------");

        System.out.println(excursion1);
        System.out.println("--------------------");

        System.out.println(excursion2);
    }
}