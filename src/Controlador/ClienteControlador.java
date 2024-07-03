package Controlador;

import Modelo.Cliente;
import Modelo.Reserva;
import Modelo.ReservaServicio;
import Modelo.Solicitud;
import Modelo.Pago;
import Modelo.Reporte;
import Modelo.Empleado;
import java.util.List;

// Definición de la clase ClienteControlador
public class ClienteControlador {
    private Cliente clienteModelo; // Modelo Cliente para interactuar con los datos

    // Constructor de la clase ClienteControlador
    public ClienteControlador(Cliente clienteModelo) {
        this.clienteModelo = clienteModelo; // Inicializa el modelo Cliente
    }

    // Método para hacer una nueva reserva de habitación
    public void hacerReservaHabitacion(Reserva reserva) {
        clienteModelo.hacerReservaHabitacion(reserva); // Llama al método del modelo para agregar una reserva de habitación
    }

    // Método para hacer una nueva reserva de servicio
    public void hacerReservaServicio(ReservaServicio reserva) {
        clienteModelo.hacerReservaServicio(reserva); // Llama al método del modelo para agregar una reserva de servicio
    }

    // Método para cancelar una reserva de habitación
    public void cancelarReservaHabitacion(Reserva reserva) {
        clienteModelo.cancelarReservaHabitacion(reserva); // Llama al método del modelo para cancelar una reserva de habitación
    }

    // Método para cancelar una reserva de servicio
    public void cancelarReservaServicio(ReservaServicio reserva) {
        clienteModelo.cancelarReservaServicio(reserva); // Llama al método del modelo para cancelar una reserva de servicio
    }

    // Método para obtener todas las reservas de habitación
    public List<Reserva> obtenerReservasHabitacion() {
        return clienteModelo.obtenerReservasHabitacion(); // Devuelve la lista de reservas de habitación desde el modelo
    }

    // Método para obtener todas las reservas de servicio
    public List<ReservaServicio> obtenerReservasServicio() {
        return clienteModelo.obtenerReservasServicio(); // Devuelve la lista de reservas de servicio desde el modelo
    }

    // Método para crear una nueva solicitud
    public void crearSolicitud(Solicitud solicitud) {
        clienteModelo.crearSolicitud(solicitud); // Llama al método del modelo para crear una nueva solicitud
    }

    // Método para actualizar el estado de una solicitud
    public void actualizarEstadoSolicitud(Solicitud solicitudSeleccionada, String nuevoEstado) {
        clienteModelo.actualizarEstadoSolicitud(solicitudSeleccionada, nuevoEstado); // Llama al método del modelo para actualizar el estado de una solicitud
    }

    // Método para obtener todas las solicitudes del cliente
    public List<Solicitud> obtenerSolicitudesPorCliente() {
        return clienteModelo.obtenerSolicitudesPorCliente(); // Devuelve la lista de solicitudes del cliente desde el modelo
    }

    // Método para obtener solicitudes por estado
    public List<Solicitud> obtenerSolicitudesPorEstado(String estado) {
        return clienteModelo.obtenerSolicitudesPorEstado(estado); // Devuelve la lista de solicitudes por estado desde el modelo
    }

    // Método para realizar un pago
    public void realizarPago(Pago pago) {
        clienteModelo.realizarPago(pago); // Llama al método del modelo para realizar un pago
    }

    // Método para obtener todos los pagos
    public List<Pago> obtenerPagos() {
        return clienteModelo.obtenerPagos(); // Devuelve la lista de pagos desde el modelo
    }

    // Método para generar un reporte
    public void generarReporte(Reporte reporte) {
        clienteModelo.generarReporte(reporte); // Llama al método del modelo para generar un reporte
    }

    // Método para obtener todos los reportes
    public List<Reporte> obtenerReportes() {
        return clienteModelo.obtenerReportes(); // Devuelve la lista de reportes desde el modelo
    }

    // Método para asignar un empleado
    public void asignarEmpleado(Empleado empleado) {
        clienteModelo.asignarEmpleado(empleado); // Llama al método del modelo para asignar un empleado
    }

    // Método para obtener todos los empleados asignados
    public List<Empleado> obtenerEmpleados() {
        return clienteModelo.obtenerEmpleados(); // Devuelve la lista de empleados asignados desde el modelo
    }
}
