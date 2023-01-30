package Ejercicio16;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Ejercicio16 ejercicio16 = new Ejercicio16();
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca su genero");
        ejercicio16.genero = lector.next();

        System.out.println("Introduzca su edad");
        ejercicio16.edad = lector.nextByte();

        System.out.println(ejercicio16.valorSubsidio());
    }
}
