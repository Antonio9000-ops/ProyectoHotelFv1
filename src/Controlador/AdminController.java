package Controlador;

import Modelo.Admin;
import Modelo.Reserva;
import Modelo.Solicitud;
import java.util.List;

// Definición de la clase AdminController
public class AdminController {
    private Admin adminModel; // Modelo Admin para interactuar con los datos

    // Constructor de la clase AdminController
    public AdminController(Admin adminModel) {
        this.adminModel = adminModel; // Inicializa el modelo Admin
    }

    // Método para hacer una nueva reserva
    public void hacerNuevaReserva(Reserva reserva) {
        adminModel.hacerNuevaReserva(reserva); // Llama al método del modelo para agregar una reserva
    }

    // Método para hacer una nueva solicitud
    public void hacerNuevaSolicitud(Solicitud solicitud) {
        adminModel.hacerNuevaSolicitud(solicitud); // Llama al método del modelo para agregar una solicitud
    }

    // Método para obtener reservas confirmadas
    public List<Reserva> obtenerReservasConfirmadas() {
        return adminModel.verReservasConfirmadas(); // Devuelve las reservas confirmadas desde el modelo
    }

    // Método para obtener solicitudes confirmadas
    public List<Solicitud> obtenerSolicitudesConfirmadas() {
        return adminModel.verSolicitudesConfirmadas(); // Devuelve las solicitudes confirmadas desde el modelo
    }

    // Método para obtener el historial de reservas
    public List<Reserva> obtenerHistorialReservas() {
        return adminModel.verHistorialReservas(); // Devuelve el historial de reservas desde el modelo
    }

    // Método para obtener el historial de solicitudes
    public List<Solicitud> obtenerHistorialSolicitudes() {
        return adminModel.verHistorialSolicitudes(); // Devuelve el historial de solicitudes desde el modelo
    }
}
