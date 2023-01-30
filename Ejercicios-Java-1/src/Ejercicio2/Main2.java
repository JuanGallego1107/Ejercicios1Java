package Ejercicio2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.codCita = "01";
        ejercicio2.Consultorio = "122";
        ejercicio2.nombreMedico = "Arle Morales";
        ejercicio2.setCentroMedico("Sura");

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la fecha");
        ejercicio2.fecha = lector.next();

        System.out.println("Ingrese la hora");
        ejercicio2.hora = lector.next();

        System.out.println("Ingrese su nombre");
        ejercicio2.nombrePaciente = lector.next();
        System.out.println(ejercicio2.crearCita());

        System.out.println(ejercicio2.consultarDatosCita());
        System.out.println("Codigo: "+ ejercicio2.codCita);
        System.out.println("Consultorio N°"+ ejercicio2.Consultorio);
        System.out.println("Medico: "+ ejercicio2.nombreMedico);
        System.out.println("Centro Medico: "+ ejercicio2.getCentroMedico());
        System.out.println("Fecha: "+ ejercicio2.fecha);
        System.out.println("Hora: "+ ejercicio2.hora);
        System.out.println("Nombre del paciente: "+ ejercicio2.nombrePaciente );

        System.out.println("Si desea modificar la hora de su cita dijite 1, si no dijite 2.");
        ejercicio2.cambioHora = lector.nextInt();
        if(ejercicio2.cambioHora == 1){
            System.out.println("Ingrese la nueva hora para la cita");
            ejercicio2.hora = lector.next();
            System.out.println(ejercicio2.cambiarHora());
        }
    }
}
