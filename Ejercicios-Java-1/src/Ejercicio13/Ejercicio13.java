package Ejercicio13;

public class Ejercicio13 {
    public byte numeroIngresado;

    public String validarParImpar(){
        if(numeroIngresado %2 == 0){
            return ("El numero ingresado es Par");
        }else{
            return ("El numero ingresado es Impar");
        }
    }
}
