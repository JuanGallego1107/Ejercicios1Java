package Ejercicio22;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Ejercicio22 ejercicio22 = new Ejercicio22();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el numero correspondiente a su operador.");
        System.out.println("1. Claro.");
        System.out.println("2. Tigo.");
        System.out.println("3. Movistar.");
        ejercicio22.operadorUsuario = lector.nextByte();

        System.out.println(ejercicio22.verificarServicios());
        System.out.println("Minutos internacionales consumidos: "+ejercicio22.minutosInternacionales);
        System.out.println("El costo total de su plan es: $"+ejercicio22.total());
    }
}
