package Ejercicio15;

public class Ejercicio15 {
    public byte num1;
    public byte num2;
    public byte num3;

    public String verificarNumeroMayor(){
        if(num1>num2 && num1>num3){
            return "El numero mayor es "+num1;
        }else if(num2>num1 && num2>num3){
            return "El numero mayor es "+num2;
        }else if(num3>num1 && num3>num2){
            return "El numero mayor es "+num3;
        }else{
            return "Hay 2 o mas numeros iguales";
        }
    }
}
