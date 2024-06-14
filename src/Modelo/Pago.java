package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Definición de la clase Pago
public class Pago {
    // Atributos de la clase Pago
    private Date fecha;
    private double montoTotal;
    private String metodoPago;
    private Cliente cliente;

    // Relaciones con otras clases
    private List<Servicio> detalleServicios;
    private List<Platillo> detalleConsumos;
    private List<Habitacion> detalleReservasHabitacion;
    private List<ReservaServicio> detalleReservasServicio;

    // Constructor de la clase Pago
    public Pago(Date fecha, String metodoPago, Cliente cliente) {
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.cliente = cliente;
        this.detalleServicios = new ArrayList<>();
        this.detalleConsumos = new ArrayList<>();
        this.detalleReservasHabitacion = new ArrayList<>();
        this.detalleReservasServicio = new ArrayList<>();
        this.montoTotal = 0.0;
    }

    // Métodos de la clase Pago

    // Método para realizar el pago
    public void realizarPago() {
        // Lógica para procesar el pago:
        // - Actualizar el estado de las reservas de habitaciones
        for (Habitacion habitacion : detalleReservasHabitacion) {
            habitacion.actualizarEstado("Pagado");
        }

        // - Actualizar el estado de las reservas de servicios
        for (ReservaServicio reserva : detalleReservasServicio) {
            reserva.confirmarReserva();
        }

        // - Actualizar cualquier otra lógica relacionada con el pago
        // (p.ej., enviar confirmaciones, generar recibos, etc.)
        enviarComprobante(cliente);
    }

    // Método para agregar un detalle de servicio
    public void agregarDetalleServicio(Servicio servicio) {
        detalleServicios.add(servicio);
        montoTotal += servicio.getCosto();  // Asumiendo que Servicio tiene un método getCosto()
    }

    // Método para agregar un detalle de consumo
    public void agregarDetalleConsumo(Platillo platillo) {
        detalleConsumos.add(platillo);
        montoTotal += platillo.getPrecio();  // Asumiendo que Platillo tiene un método getPrecio()
    }

    // Método para agregar un detalle de reserva de habitación
    public void agregarDetalleReservaHabitacion(Habitacion habitacion, Date fechaInicio, Date fechaFin) {
        detalleReservasHabitacion.add(habitacion);
        long noches = (fechaFin.getTime() - fechaInicio.getTime()) / (1000 * 60 * 60 * 24);
        montoTotal += noches * habitacion.getPrecio();  // Asumiendo que Habitacion tiene un método getPrecio()
    }

    // Método para agregar un detalle de reserva de servicio
    public void agregarDetalleReservaServicio(ReservaServicio reserva) {
        detalleReservasServicio.add(reserva);
        montoTotal += reserva.calcularCosto();  // Verificando que ReservaServicio tiene un método calcularCosto()
    }

    // Método para calcular el monto total del pago
    public double calcularMontoTotal() {
        return montoTotal;
    }

    // Método para enviar el comprobante de pago al cliente
    public void enviarComprobante(Cliente cliente) {
        // Implementación del método para enviar el comprobante de pago
        // Puede ser un correo electrónico, mensaje, etc.
        System.out.println("Enviando comprobante de pago a " + cliente.getNombre() + "...");
    }

    // Getters y setters para los atributos de la clase Pago

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Servicio> getDetalleServicios() {
        return detalleServicios;
    }

    public void setDetalleServicios(List<Servicio> detalleServicios) {
        this.detalleServicios = detalleServicios;
    }

    public List<Platillo> getDetalleConsumos() {
        return detalleConsumos;
    }

    public void setDetalleConsumos(List<Platillo> detalleConsumos) {
        this.detalleConsumos = detalleConsumos;
    }

    public List<Habitacion> getDetalleReservasHabitacion() {
        return detalleReservasHabitacion;
    }

    public void setDetalleReservasHabitacion(List<Habitacion> detalleReservasHabitacion) {
        this.detalleReservasHabitacion = detalleReservasHabitacion;
    }

    public List<ReservaServicio> getDetalleReservasServicio() {
        return detalleReservasServicio;
    }

    public void setDetalleReservasServicio(List<ReservaServicio> detalleReservasServicio) {
        this.detalleReservasServicio = detalleReservasServicio;
    }
}
