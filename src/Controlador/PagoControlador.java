package Controlador;

import Modelo.Pago;
import Modelo.Cliente;
import Modelo.Servicio;
import Modelo.Platillo;
import Modelo.Habitacion;
import Modelo.ReservaServicio;

import java.util.Date;
import java.util.List;

// Definición de la clase PagoControlador
public class PagoControlador {
    private Pago pagoModelo; // Modelo Pago para interactuar con los datos

    // Constructor de la clase PagoControlador
    public PagoControlador(Pago pagoModelo) {
        this.pagoModelo = pagoModelo; // Inicializa el modelo Pago
    }

    // Método para realizar el pago
    public void realizarPago() {
        pagoModelo.realizarPago(); // Llama al método realizarPago del modelo
    }

    // Método para agregar un detalle de servicio
    public void agregarDetalleServicio(Servicio servicio) {
        pagoModelo.agregarDetalleServicio(servicio); // Llama al método agregarDetalleServicio del modelo
    }

    // Método para agregar un detalle de consumo
    public void agregarDetalleConsumo(Platillo platillo) {
        pagoModelo.agregarDetalleConsumo(platillo); // Llama al método agregarDetalleConsumo del modelo
    }

    // Método para agregar un detalle de reserva de habitación
    public void agregarDetalleReservaHabitacion(Habitacion habitacion, Date fechaInicio, Date fechaFin) {
        pagoModelo.agregarDetalleReservaHabitacion(habitacion, fechaInicio, fechaFin); // Llama al método agregarDetalleReservaHabitacion del modelo
    }

    // Método para agregar un detalle de reserva de servicio
    public void agregarDetalleReservaServicio(ReservaServicio reserva) {
        pagoModelo.agregarDetalleReservaServicio(reserva); // Llama al método agregarDetalleReservaServicio del modelo
    }

    // Método para calcular el monto total del pago
    public double calcularMontoTotal() {
        return pagoModelo.calcularMontoTotal(); // Llama al método calcularMontoTotal del modelo y devuelve el monto total
    }

    // Método para enviar el comprobante de pago al cliente
    public void enviarComprobante(Cliente cliente) {
        pagoModelo.enviarComprobante(cliente); // Llama al método enviarComprobante del modelo
    }

    // Getters y setters para los atributos de la clase Pago

    public Date getFecha() {
        return pagoModelo.getFecha(); // Devuelve la fecha del pago desde el modelo
    }

    public void setFecha(Date fecha) {
        pagoModelo.setFecha(fecha); // Establece la fecha del pago en el modelo
    }

    public double getMontoTotal() {
        return pagoModelo.getMontoTotal(); // Devuelve el monto total del pago desde el modelo
    }

    public void setMontoTotal(double montoTotal) {
        pagoModelo.setMontoTotal(montoTotal); // Establece el monto total del pago en el modelo
    }

    public String getMetodoPago() {
        return pagoModelo.getMetodoPago(); // Devuelve el método de pago desde el modelo
    }

    public void setMetodoPago(String metodoPago) {
        pagoModelo.setMetodoPago(metodoPago); // Establece el método de pago en el modelo
    }

    public Cliente getCliente() {
        return pagoModelo.getCliente(); // Devuelve el cliente desde el modelo
    }

    public void setCliente(Cliente cliente) {
        pagoModelo.setCliente(cliente); // Establece el cliente en el modelo
    }

    public List<Servicio> getDetalleServicios() {
        return pagoModelo.getDetalleServicios(); // Devuelve la lista de servicios del pago desde el modelo
    }

    public void setDetalleServicios(List<Servicio> detalleServicios) {
        pagoModelo.setDetalleServicios(detalleServicios); // Establece la lista de servicios del pago en el modelo
    }

    public List<Platillo> getDetalleConsumos() {
        return pagoModelo.getDetalleConsumos(); // Devuelve la lista de consumos del pago desde el modelo
    }

    public void setDetalleConsumos(List<Platillo> detalleConsumos) {
        pagoModelo.setDetalleConsumos(detalleConsumos); // Establece la lista de consumos del pago en el modelo
    }

    public List<Habitacion> getDetalleReservasHabitacion() {
        return pagoModelo.getDetalleReservasHabitacion(); // Devuelve la lista de reservas de habitaciones del pago desde el modelo
    }

    public void setDetalleReservasHabitacion(List<Habitacion> detalleReservasHabitacion) {
        pagoModelo.setDetalleReservasHabitacion(detalleReservasHabitacion); // Establece la lista de reservas de habitaciones del pago en el modelo
    }

    public List<ReservaServicio> getDetalleReservasServicio() {
        return pagoModelo.getDetalleReservasServicio(); // Devuelve la lista de reservas de servicios del pago desde el modelo
    }

    public void setDetalleReservasServicio(List<ReservaServicio> detalleReservasServicio) {
        pagoModelo.setDetalleReservasServicio(detalleReservasServicio); // Establece la lista de reservas de servicios del pago en el modelo
    }
}
