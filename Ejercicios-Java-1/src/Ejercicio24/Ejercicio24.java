package Ejercicio24;

public class Ejercicio24 {
    public byte carta1Jugador ;
    public byte carta2Jugador;
    public byte carta3Jugador;
    public byte carta1Maquina;
    public byte carta2Maquina;
    public byte carta3Maquina;
    public int sumaJugador;
    public int sumaMaquina;
    public String tomarCarta3;

    public String jugarCartas(){
        if(sumaJugador <= 21 && (sumaJugador > sumaMaquina || sumaMaquina >21 ) ){
            return "El ganador es el jugador. ";
        }else if(sumaMaquina <= 21 && (sumaMaquina > sumaJugador || sumaJugador > 21)){
            return "El ganador es la maquina.";
        }else if(sumaMaquina == sumaJugador){
            return "Ninguno de los 2 gano el juego, es un empate.";
        }else{
            return "Ninguno de los 2 gano , la suma de las cartas es mayor a 21";
        }
    }
}
