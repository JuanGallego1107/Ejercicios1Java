package Ejercicio4;

public class Ejercicio4 {
    public String colorBombilla;
    public boolean encendidoApagado;

    public String cambiarColor(){
        return colorBombilla = ("Amarillo");
    }

    public boolean apagarEncenderSemaforo(){
        if(encendidoApagado == true){
            return true;
        }else{
            return false;
        }
    }
    public String mostrarMensajeVehiculo(){
        if (colorBombilla == "Rojo"){
            return "Detengase";
        } else if (colorBombilla == "Amarillo") {
            return "Preparese";
        }else{
            return "Puede arrancar";
        }
    }
}
