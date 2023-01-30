package Ejercicio18;

public class Ejercicio18 {
    public byte angulo1;
    public byte angulo2;
    public byte angulo3;
    public int sumaAngulos;

    public String verificarAngulos(){
        if (angulo1+angulo2+angulo3 == 180){
            return "Con la suma de los angulos se obtiene un triangulo valido , que fue: "+sumaAngulos+"° grados.";
        }else{
            return "Con la suma de los angulos se obtiene un triangulo invalido, que fue: "+sumaAngulos+"° grados.";
        }
    }
}
