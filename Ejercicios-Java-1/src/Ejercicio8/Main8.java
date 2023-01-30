package Ejercicio8;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Ejercicio8 ejercicio8 = new Ejercicio8();
        ejercicio8.numeroGuia = "11";
        ejercicio8.setEstadoEnvio("En zona de empaquetado");

        Scanner lector = new Scanner(System.in);

        System.out.println("Fecha de hoy");
        ejercicio8.setFecha(lector.next());

        System.out.println("Tipo de embalaje (Primario, secundario o terciario.)");
        ejercicio8.setTipoEmbalaje(lector.next());

        System.out.println("Cedula de ciudadania");
        ejercicio8.cedulaCliente = lector.next();

        System.out.println("Peso en Kilos del encargo");
        ejercicio8.setPeso(lector.nextInt());

        System.out.println("Ciudad de origen");
        ejercicio8.setCiudadOrigen(lector.next());

        System.out.println("Ciudad de destino");
        ejercicio8.setCiudadDestino(lector.next());

        System.out.println("El costo total del envio es: "+ ejercicio8.calcularCostoxKilo());

        System.out.println(ejercicio8.getEstadoEnvio());

    }
}
