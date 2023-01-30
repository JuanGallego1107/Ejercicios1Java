package Ejercicio10;

public class Ejercicio10 {
    public int horasTrabajadas;
    public String nombre;

    public int pagoSalario(){
        if(horasTrabajadas<=10){
            return horasTrabajadas*30000;
        }else if(horasTrabajadas>10){
            return horasTrabajadas*33000;
        }else{
            return 0;
        }
    }
}
