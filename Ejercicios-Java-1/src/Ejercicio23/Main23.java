package Ejercicio23;

import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Ejercicio23 ejercicio23 = new Ejercicio23();
        Scanner lector = new Scanner(System.in);

        System.out.println("Elija el tamaño del sandwich. \n1.Grande : $12000 \n2.Pequeño: $6000");
        ejercicio23.tamañoSandwich = lector.nextByte();

        System.out.println("Elija algun ingrediente adicional \n1.Jalapeño: Gratis \n2.Tocineta: $3000 \n3.Pavo: $3000 \n4.Queso: $2500 \n5.Ninguno.");
        ejercicio23.adicional = lector.nextByte();

        ejercicio23.valorSandwich();

        System.out.println("El precio final del sandwich es de: $"+ejercicio23.validarAdicionales());
    }
}
