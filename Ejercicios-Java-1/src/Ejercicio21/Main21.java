package Ejercicio21;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Ejercicio21 ejercicio21 = new Ejercicio21();
        Scanner lector =new Scanner(System.in);

        System.out.println("Ingrese el modelo de su automovil.");
        ejercicio21.setModeloAuto(lector.nextInt());

        System.out.println(ejercicio21.verificarModelo());
    }
}
