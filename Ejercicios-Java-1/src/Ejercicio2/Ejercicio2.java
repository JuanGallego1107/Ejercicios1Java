package Ejercicio2;

public class Ejercicio2 {
    public String codCita;
    public String fecha;
    public String hora;
    public String Consultorio;
    public String nombreMedico;
    public String nombrePaciente;
    public int cambioHora;
    private String centroMedico;

    public String getCentroMedico() {
        return centroMedico;
    }

    public void setCentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
    }

    public String crearCita(){
        return "Su cita ha sido creada";
    }

    public String consultarDatosCita(){
        return "Estos son los datos de su cita";
    }

    public String cambiarHora(){
        hora = hora;
        return "La hora de su cita ha sido modificada";
    }
}
