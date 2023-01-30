package Ejercicio17;

public class Ejercicio17 {
    private byte plan;
    private int plan15Dias;
    private int plan30Dias;
    private int plan90Dias;

    public byte getPlan() {
        return plan;
    }

    public void setPlan(byte plan) {
        this.plan = plan;
    }

    public int getPlan15Dias() {
        return plan15Dias;
    }

    public void setPlan15Dias(int plan15Dias) {
        this.plan15Dias = plan15Dias;
    }

    public int getPlan30Dias() {
        return plan30Dias;
    }

    public void setPlan30Dias(int plan30Dias) {
        this.plan30Dias = plan30Dias;
    }

    public int getPlan90Dias() {
        return plan90Dias;
    }

    public void setPlan90Dias(int plan90Dias) {
        this.plan90Dias = plan90Dias;
    }

    public int valorMensualidad(){
        if(getPlan() == 1){
            return getPlan15Dias()*2;
        }else if (getPlan() == 2){
            return getPlan30Dias();
        }else if(getPlan() == 3){
            return getPlan90Dias()/3;
        }else{
            return 0;
        }
    }
}
