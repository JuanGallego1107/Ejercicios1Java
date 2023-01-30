package Ejercicio12;

public class Ejercicio12 {
    public byte tipoLavadora;
    public byte numeroLavadoras;
    public byte numeroHoras;

    public int valorAlquiler(){
        if ( tipoLavadora == 1){
            return 4000*numeroLavadoras*numeroHoras;
        }else if(tipoLavadora == 2){
            return 3000*numeroLavadoras*numeroHoras;
        }else{
            return 0;
        }
    }
     public float validarDescuento(){
        if(numeroLavadoras>3){
            return valorAlquiler()-(valorAlquiler()*3/100);
        }else{
            return valorAlquiler();
        }
     }
}
