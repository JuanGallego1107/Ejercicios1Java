package Ejercicio11;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Ejercicio11 ejercicio11 = new Ejercicio11();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingresa un numero entero");
        ejercicio11.numeroIngresado = lector.nextInt();

        System.out.println(ejercicio11.validarNumero());
    }
}
