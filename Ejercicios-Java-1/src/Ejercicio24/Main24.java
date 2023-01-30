package Ejercicio24;

import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Ejercicio24 ejercicio24 = new Ejercicio24();
        Scanner lector = new Scanner(System.in);
        ejercicio24.carta1Jugador = (byte)(Math.random()*10+1);
        ejercicio24.carta2Jugador = (byte)(Math.random()*10+1);
        ejercicio24.carta3Jugador = (byte)(Math.random()*10+1);
        ejercicio24.carta1Maquina = (byte)(Math.random()*10+1);
        ejercicio24.carta2Maquina = (byte)(Math.random()*10+1);
        ejercicio24.carta3Maquina = (byte)(Math.random()*10+1);
        ejercicio24.sumaJugador = ejercicio24.carta1Jugador+ejercicio24.carta2Jugador+ejercicio24.carta3Jugador;
        ejercicio24.sumaMaquina = ejercicio24.carta1Maquina+ ejercicio24.carta2Maquina+ ejercicio24.carta3Maquina;

        System.out.println("Se repartieron 2 cartas para el jugador y la maquina. \n -----------------------");
        System.out.println("Oprima cualquier letra para escoger la 3era carta y revelar las 3 cartas de cada uno.");
        ejercicio24.tomarCarta3 = lector.nextLine();

        System.out.println("Estas son las cartas:");
        System.out.println("Para el jugador: \n Carta 1: "+ejercicio24.carta1Jugador+ "\n Carta 2: "+ejercicio24.carta2Jugador+ " \n Carta 3: "+ejercicio24.carta3Jugador);
        System.out.println("Para la maquina: \n Carta 1: "+ejercicio24.carta1Maquina+ "\n Carta 2: "+ejercicio24.carta2Maquina+ " \n Carta 3: "+ejercicio24.carta3Maquina);

        System.out.println(ejercicio24.jugarCartas());

    }
}
