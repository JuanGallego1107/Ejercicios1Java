package Ejercicio3;

public class Ejercicio3 {
    public String codPrestamo;
    public String fechaPrestamo;
    public String nombreLibro;
    public String codigoUsuario;
    public String diasDePrestamo;
    public String estadoPrestamo;

    public String consultarEstadoPrestamo(){
        return ("El prestamo esta en activo: Quedan "+diasDePrestamo+" dias de prestamo.");
    }
}
