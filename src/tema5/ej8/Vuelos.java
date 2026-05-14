package tema5.ej8;
import java.util.*;
public class Vuelos {

    public static void main(String[] args) {
        Map<String, Map<String, Double>> vuelosPasajerosCoste = new HashMap<>();

        Map<String, Double> pasajerosIB123 = new HashMap<>();
        pasajerosIB123.put("12345678A", 150.50);
        pasajerosIB123.put("87654321B", 200.75);
        pasajerosIB123.put("11223344C", 175.25);
        pasajerosIB123.put("55667788E", 185.90);
        vuelosPasajerosCoste.put("IB123", pasajerosIB123);

        Map<String, Double> pasajerosFR456 = new HashMap<>();
        pasajerosFR456.put("44332211D", 89.99);
        pasajerosFR456.put("55667788E", 120.50);
        pasajerosFR456.put("99887766F", 95.75);
        pasajerosFR456.put("12345678A", 110.25);
        vuelosPasajerosCoste.put("FR456", pasajerosFR456);

        Map<String, Double> pasajerosLH789 = new HashMap<>();
        pasajerosLH789.put("77889900H", 320.80);
        pasajerosLH789.put("87654321B", 285.45);
        pasajerosLH789.put("33445566G", 295.60);
        vuelosPasajerosCoste.put("LH789", pasajerosLH789);

        Map<String, Double> pasajerosVY234 = new HashMap<>();
        pasajerosVY234.put("22334455J", 165.30);
        pasajerosVY234.put("11223344C", 180.90);
        pasajerosVY234.put("55443322L", 155.60);
        pasajerosVY234.put("44332211D", 170.45);
        vuelosPasajerosCoste.put("VY234", pasajerosVY234);

        Map<String, Double> pasajerosUX567 = new HashMap<>();
        pasajerosUX567.put("99001122M", 245.75);
        pasajerosUX567.put("55667788E", 230.40);
        pasajerosUX567.put("77889900H", 260.15);
        pasajerosUX567.put("11998877P", 225.85);
        pasajerosUX567.put("87654321B", 240.20);
        vuelosPasajerosCoste.put("UX567", pasajerosUX567);

        Map<String, Double> pasajerosAF890 = new HashMap<>();
        pasajerosAF890.put("12345678A", 275.30);
        pasajerosAF890.put("99887766F", 290.85);
        pasajerosAF890.put("22334455J", 265.50);
        vuelosPasajerosCoste.put("AF890", pasajerosAF890);

        System.out.println(getIdentificadoresVuelos(vuelosPasajerosCoste));

        System.out.printf("El billete más caro ha sido de %.2f %n", getBilleteMasCaro(vuelosPasajerosCoste));

        System.out.println("El precio medio de cada vuelo ha sido " + getPreciosMedios(vuelosPasajerosCoste));

        System.out.println("El gasto por cada pasajero ha sido de " + getGastoPorDNI(vuelosPasajerosCoste));
    }

    public static Set<String> getIdentificadoresVuelos(Map<String, Map<String, Double>> vuelosPasajerosCoste) {
        return vuelosPasajerosCoste.keySet();
    }

    public static Double getBilleteMasCaro(Map<String, Map<String, Double>> vuelosPasajerosCoste) {
        double max = 0.0;
        for (Map<String, Double> pasajeros : vuelosPasajerosCoste.values()) {
            for (Double precio : pasajeros.values()) {
                if (precio > max) max = precio;
            }
        }
        return max;
    }

    public static Map<String, Double> getPreciosMedios(Map<String, Map<String, Double>> vuelosPasajerosCoste) { //ia utilizada
        Map<String, Double> medios = new HashMap<>();
        for (Map.Entry<String, Map<String, Double>> vuelo : vuelosPasajerosCoste.entrySet()) {
            double suma = 0;
            Map<String, Double> pasajeros = vuelo.getValue();
            for (Double precio : pasajeros.values()) {
                suma += precio;
            }
            medios.put(vuelo.getKey(), pasajeros.isEmpty() ? 0.0 : suma / pasajeros.size());
        }
        return medios;
    }

    public static Map<String, Double> getGastoPorDNI(Map<String, Map<String, Double>> vuelosPasajerosCoste) { //ia utilizada
        Map<String, Double> gastoDNI = new HashMap<>();
        for (Map<String, Double> pasajeros : vuelosPasajerosCoste.values()) {
            for (Map.Entry<String, Double> entrada : pasajeros.entrySet()) {
                String dni = entrada.getKey();
                Double precio = entrada.getValue();
                gastoDNI.put(dni, gastoDNI.getOrDefault(dni, 0.0) + precio);
            }
        }
        return gastoDNI;
    }
}