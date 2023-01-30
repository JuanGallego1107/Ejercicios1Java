package Ejercicio1;

public class Ejercicio1 {
    public String UsuarioBase;
    public String UsuarioIngresado;
    public String claveBase;
    public String claveIngresada;
    public boolean EstadoSistema;

    public String validarEstado(){
        if(EstadoSistema == true){
            return "El sistema esta activo";
        }else {
            return "El sistema esta inactivo por el momento";
        }
    }

    public String permitirAcceso() {
        if (UsuarioIngresado.equals(UsuarioBase) && claveIngresada.equals(claveBase)){
            return "Ha ingresado a su cuenta";
        }else{
            return "Por favor verifique su usuario o clave.";
        }
    }
}
