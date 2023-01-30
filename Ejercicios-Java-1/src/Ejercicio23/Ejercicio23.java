package Ejercicio23;

public class Ejercicio23 {
    public byte tamañoSandwich;
    public int valorTotal;
    public byte adicional;

    public int valorSandwich(){
        if(tamañoSandwich == 1){
            return valorTotal=12000;
        }else{
            return valorTotal=6000;
        }
    }
    
    public int validarAdicionales(){
        if(adicional==1){
            return valorTotal;
        }else if(adicional==2 || adicional==3){
            return valorTotal+3000;
        } else if (adicional==4) {
            return valorTotal+2500;
        }else{
            return valorTotal;
        }
    }

}
