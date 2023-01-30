package Ejercicio10;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Ejercicio10 ejercicio10 = new Ejercicio10();
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduze tu nombre");
        ejercicio10.nombre = lector.nextLine();

        System.out.println("Horas trabajadas");
        ejercicio10.horasTrabajadas = lector.nextInt();

        System.out.println("Señor/a "+ejercicio10.nombre+" el numero de horas es "+ejercicio10.horasTrabajadas+" y su salario equivale a $"+ejercicio10.pagoSalario());
    }
}
