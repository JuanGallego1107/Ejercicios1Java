package Ejercicio9;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Ejercicio9 ejercicio9 = new Ejercicio9();
        ejercicio9.numeroReclamo = "106";
        ejercicio9.setEstadoReclamo("En revision");

        Scanner lector = new Scanner(System.in);

        System.out.println("Nombre completo");
        ejercicio9.setNombrePersona(lector.nextLine());

        System.out.println("Asunto");
        ejercicio9.setAsunto(lector.nextLine());

        System.out.println("Descripcion reclamo");
        ejercicio9.descripcionReclamo = lector.nextLine();

        System.out.println(ejercicio9.mensajeRecepcionReclamo());

        System.out.println("El reclamo actual esta en: "+ejercicio9.validarEstadoReclamo());

    }
}
