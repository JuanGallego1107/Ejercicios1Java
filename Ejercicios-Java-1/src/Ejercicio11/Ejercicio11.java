package Ejercicio11;

public class Ejercicio11 {
    public int numeroIngresado;

    public String validarNumero() {
        if (numeroIngresado > 0) {
            return ("El numero " + numeroIngresado + " es positivo");
        }else if(numeroIngresado<0){
            return ("El numero " + numeroIngresado + " es negativo");
        }else{
            return ("Es cero");
        }
    }
}
