package Ejercicio6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        ejercicio6.setSalarioBasico(1000000);
        ejercicio6.setDescuento(120000);
        ejercicio6.setNeto(ejercicio6.getNeto());

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese su codigo laboral");
        ejercicio6.codEmpleado = lector.next();

        System.out.println("Ingrese el numero de horas extra que realizo");
        ejercicio6.horasExtra = lector.nextInt();

        System.out.println("Ingrese el numero de horas normales que realizo");
        ejercicio6.setNumeroHoras(lector.nextInt());

        ejercicio6.setBonificacion(5000*ejercicio6.getNumeroHoras());

        System.out.println("El salario neto a pagar es de: "+ejercicio6.calcularNeto());

    }
}
