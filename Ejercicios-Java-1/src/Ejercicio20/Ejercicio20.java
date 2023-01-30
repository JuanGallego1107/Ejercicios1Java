package Ejercicio20;

public class Ejercicio20 {
    public byte seleccionProblema;

    public String informeProblema(){
        if(seleccionProblema == 1){
            return "Pongase en contacto con el tecnico de apoyo.";
        }else if(seleccionProblema == 2){
            return "Verificar contactos de la unidad.";
        }else if(seleccionProblema == 3){
            return "Traiga la computadora para repararla en la central.";
        }else if(seleccionProblema == 4){
            return "Compruebe las conexiones de altavoces.";
        }else{
            return "Seleccione una opcion valida.";
        }
    }
}
