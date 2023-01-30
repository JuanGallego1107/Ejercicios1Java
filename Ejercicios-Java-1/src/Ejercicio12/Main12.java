package Ejercicio12;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Ejercicio12 ejercicio12 = new Ejercicio12();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite el numero 1 para lavadora grande o 2 para lavadora pequeña.");
        ejercicio12.tipoLavadora = lector.nextByte();

        System.out.println("Numero de lavadoras a alquilar");
        ejercicio12.numeroLavadoras = lector.nextByte();

        System.out.println("Numero de horas");
        ejercicio12.numeroHoras = lector.nextByte();

        System.out.println("El valor de alquier es de: $"+ ejercicio12.validarDescuento());
    }
}
