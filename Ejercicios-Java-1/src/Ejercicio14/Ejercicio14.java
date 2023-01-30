package Ejercicio14;

public class Ejercicio14 {
    public double fisica;
    public double quimica;
    public double biologia;
    public double matematicas;
    public double Infomatica;
    public double promedio;

    public String promedioNotas(){
        if(promedio < 6.0){
            return "La calificacion es mala";
        }else if(promedio <8 ){
            return "La calificacion es buena";
        }else{
            return "La calificacion es muy buena";
        }
    }
}
