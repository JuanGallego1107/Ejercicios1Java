package Ejercicio21;

public class Ejercicio21 {
    private int modeloAuto;

    public int getModeloAuto() {
        return modeloAuto;
    }

    public void setModeloAuto(int modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    public String verificarModelo(){
        if(getModeloAuto()==119 || getModeloAuto()==179 || getModeloAuto()==189 || getModeloAuto()==195 || getModeloAuto()==221 || getModeloAuto()==780 ){
            return "Su automovil esta defectuoso, llevar a garantia.";
        }else{
            return "Su automovil no esta defectuoso";
        }
    }
}
