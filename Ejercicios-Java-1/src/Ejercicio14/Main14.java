package Ejercicio14;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Ejercicio14 ejercicio14 = new Ejercicio14();
        Scanner lector = new Scanner(System.in);

        System.out.println("Calificacion Fisica");
        ejercicio14.fisica = lector.nextDouble();

        System.out.println("Calificacion Quimica");
        ejercicio14.quimica = lector.nextDouble();

        System.out.println("Calificacion Biologia");
        ejercicio14.biologia = lector.nextDouble();

        System.out.println("Calificacion Matematicas");
        ejercicio14.matematicas = lector.nextDouble();

        System.out.println("Calificacion Informatica");
        ejercicio14.Infomatica = lector.nextDouble();

        ejercicio14.promedio = ((ejercicio14.fisica+ejercicio14.quimica+ ejercicio14.biologia+ ejercicio14.matematicas+ ejercicio14.Infomatica)/5);
        System.out.println("El promedio es de: "+ejercicio14.promedio);
        System.out.println(ejercicio14.promedioNotas());
    }
}
