package Ejercicio15;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Ejercicio15 ejercicio15 = new Ejercicio15();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        ejercicio15.num1 = lector.nextByte();

        System.out.println("Ingresa el segundo numero");
        ejercicio15.num2 = lector.nextByte();

        System.out.println("Ingresa el tercer numero");
        ejercicio15.num3 = lector.nextByte();

        System.out.println(ejercicio15.verificarNumeroMayor());
    }
}
