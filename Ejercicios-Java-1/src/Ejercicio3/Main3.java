package Ejercicio3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        ejercicio3.codPrestamo = "125";

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la fecha de la peticion del prestamo.");
        ejercicio3.fechaPrestamo = lector.next();

        System.out.println("Ingrese el nombre del libro");
        ejercicio3.nombreLibro = lector.next();

        System.out.println("Ingrese su codigo");
        ejercicio3.codigoUsuario = lector.next();

        System.out.println("Ingrese el numero de dias para el prestamo");
        ejercicio3.diasDePrestamo = lector.next();

        System.out.println(ejercicio3.consultarEstadoPrestamo());

        System.out.println("Codigo del prestamo: "+ ejercicio3.codPrestamo);
        System.out.println("Fecha del prestamo: "+ ejercicio3.fechaPrestamo);
        System.out.println("Nombre del libro: "+ ejercicio3.nombreLibro);
        System.out.println("Codigo del usuario: "+ ejercicio3.codigoUsuario);
        System.out.println("Dias de prestamo: "+ ejercicio3.diasDePrestamo+" desde "+ ejercicio3.fechaPrestamo);

    }
}
