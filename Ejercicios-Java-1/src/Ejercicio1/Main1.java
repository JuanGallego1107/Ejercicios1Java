package Ejercicio1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.UsuarioBase = "Juanjog11";
        ejercicio1.claveBase = "colombia123";
        ejercicio1.EstadoSistema = false;
        System.out.println(ejercicio1.validarEstado());

        Scanner lector = new Scanner(System.in);

        if (ejercicio1.EstadoSistema == true) {
            System.out.println("Ingrese su Usuario y clave");
            ejercicio1.UsuarioIngresado = lector.next();
            ejercicio1.claveIngresada = lector.next();
            System.out.println(ejercicio1.permitirAcceso());
        }else{
            System.out.println("Por favor vuelva en otro momento.");
        }
    }
}
