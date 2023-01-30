package Ejercicio16;

import java.util.Objects;

public class Ejercicio16 {
    public String genero;
    public byte edad;

    public String valorSubsidio(){
        if(Objects.equals(genero, "femenino") && edad > 50){
            return "Tu subsidio tiene valor de: $120000";
        }else if(Objects.equals(genero, "femenino") && edad<= 50 && edad >= 30){
            return "Tu subsidio tiene valor de $100000";
        }else if(Objects.equals(genero, "femenino") && edad < 30){
            return "No aplicas para el subsidio";
        }else{
            return "Tu subsidio tiene valor de $40000";
        }
    }
}
