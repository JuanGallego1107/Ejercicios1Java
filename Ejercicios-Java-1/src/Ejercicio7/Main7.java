package Ejercicio7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Ejercicio7 ejercicio7 = new Ejercicio7();
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la medida de la base.");
        ejercicio7.base = lector.nextInt();
        System.out.println("Ingrese la medida de la altura.");
        ejercicio7.altura = lector.nextInt();

        System.out.println(ejercicio7.validarDatos());
        System.out.println("El area del rectangulo es de "+ejercicio7.calcularArea()+" m^2");
    }
}
