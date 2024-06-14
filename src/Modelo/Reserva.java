package Modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Definición de la clase Reserva
public class Reserva {
    // Atributos de la clase Reserva
    private Date fechaInicio;
    private Date fechaFin;
    private int numeroDeHabitacion;
    private String estado;
    
    // Relación con la clase Cliente
    private Cliente cliente;
    
    // Relación con la clase Empleado
    private Empleado empleado;
    
    // Relación con la clase Pago
    private List<Pago> pagos;

    // Constructor de la clase Reserva
    public Reserva(Date fechaInicio, Date fechaFin, int numeroDeHabitacion, String estado, Cliente cliente, Empleado empleado) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numeroDeHabitacion = numeroDeHabitacion;
        this.estado = estado;
        this.cliente = cliente;
        this.empleado = empleado;
        this.pagos = new ArrayList<>();
    }

    // Métodos de la clase Reserva

    // Método para crear una reserva
    public void crearReserva() {
        // Implementación para crear una reserva
    }

    // Método para cancelar una reserva
    public void cancelarReserva() {
        this.estado = "Cancelada";
        // Implementación adicional para cancelar una reserva
    }

    // Método para obtener la lista de reservas
    public static List<Reserva> obtenerReservas(List<Reserva> reservas) {
        // Implementación para obtener todas las reservas
        return reservas;
    }

    // Métodos adicionales para la relación con pagos
    public void agregarPago(Pago pago) {
        pagos.add(pago);
    }

    public List<Pago> obtenerPagos() {
        return pagos;
    }

    // Getters y setters para los atributos de la reserva

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getNumeroDeHabitacion() {
        return numeroDeHabitacion;
    }

    public void setNumeroDeHabitacion(int numeroDeHabitacion) {
        this.numeroDeHabitacion = numeroDeHabitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
