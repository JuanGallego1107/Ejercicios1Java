package Ejercicio4;

public class Main4 {
    public static void main(String[] args) {
        Ejercicio4 ejercicio4 = new Ejercicio4();
        ejercicio4.colorBombilla = "Rojo";
        ejercicio4.encendidoApagado = true;

        if(ejercicio4.apagarEncenderSemaforo()){
            System.out.println(ejercicio4.colorBombilla);
            System.out.println(ejercicio4.mostrarMensajeVehiculo());
            System.out.println(ejercicio4.cambiarColor());
            System.out.println(ejercicio4.mostrarMensajeVehiculo());
        }else{
            System.out.println("El semaforo esta apagado");
        }
    }
}
