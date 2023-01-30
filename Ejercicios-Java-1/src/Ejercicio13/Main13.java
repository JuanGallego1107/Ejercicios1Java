package Ejercicio13;

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Ejercicio13 ejercicio13 = new Ejercicio13();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        ejercicio13.numeroIngresado = lector.nextByte();
        System.out.println(ejercicio13.validarParImpar());
    }

}
