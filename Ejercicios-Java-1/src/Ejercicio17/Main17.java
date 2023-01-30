package Ejercicio17;

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Ejercicio17 ejercicio17 = new Ejercicio17();
        ejercicio17.setPlan15Dias(18000);
        ejercicio17.setPlan30Dias(35000);
        ejercicio17.setPlan90Dias(86000);

        Scanner lector = new Scanner(System.in);

        System.out.println(" Planes: \n 1.Plan de 15 dias: $18000 \n 2.Plan de 30 dias: $35000 \n 3.Plan de 90 dias : $86000");
        ejercicio17.setPlan(lector.nextByte());

        System.out.println("El plan numero "+ejercicio17.getPlan()+ " tiene valor mensual de $"+ejercicio17.valorMensualidad());

    }
}
