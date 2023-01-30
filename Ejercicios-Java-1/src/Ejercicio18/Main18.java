package Ejercicio18;

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Ejercicio18 ejercicio18 = new Ejercicio18();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese 3 angulos para verificar si se puede armar un triangulo con ellos.");
        ejercicio18.angulo1 = lector.nextByte();
        ejercicio18.angulo2 = lector.nextByte();
        ejercicio18.angulo3 = lector.nextByte();

        ejercicio18.sumaAngulos = ejercicio18.angulo1+ ejercicio18.angulo2+ ejercicio18.angulo3;

        System.out.println(ejercicio18.verificarAngulos());
    }
}
