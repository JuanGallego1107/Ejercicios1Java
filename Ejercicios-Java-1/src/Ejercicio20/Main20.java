package Ejercicio20;

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Ejercicio20 ejercicio20 = new Ejercicio20();

        Scanner lector = new Scanner(System.in);

        System.out.println("Bienvendio al soporte tecnico, seleccione su problema digitando el numero correspondiente.");
        System.out.println("1.Emite un pitido y la unidad gira.");
        System.out.println("2.Emite un pitido y la unidad no gira.");
        System.out.println("3.No emite pitido y el disco duro no gira.");
        System.out.println("4.No emite pitido y el disco duro gira.");

        ejercicio20.seleccionProblema = lector.nextByte();
        System.out.println(ejercicio20.informeProblema());


    }
}
