package Ejercicio9;

public class Ejercicio9 {
    public String numeroReclamo;
    private String nombrePersona;
    private String asunto;
    public String descripcionReclamo;
    private String estadoReclamo;

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getEstadoReclamo() {
        return estadoReclamo;
    }

    public void setEstadoReclamo(String estadoReclamo) {
        this.estadoReclamo = estadoReclamo;
    }

    public String validarEstadoReclamo(){
        return getEstadoReclamo();
    }

    public String mensajeRecepcionReclamo(){
        return "Se ha recibido tu reclamo, estaremos trabajando en ello, Muchas gracias.";
    }
}
