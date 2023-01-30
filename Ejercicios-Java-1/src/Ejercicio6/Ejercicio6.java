package Ejercicio6;

public class Ejercicio6 {
    public String codEmpleado;
    private int salarioBasico;
    public int horasExtra;
    private int numeroHoras;
    private int descuento;
    private int bonificacion;
    private int neto;

    public int getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(int salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }

    public int valorHE(){
        return horasExtra*2500;
    }
    public int calcularNeto(){
        return getSalarioBasico()+valorHE()+getBonificacion()-getDescuento();
    }
}
