package Controlador;

import Modelo.Hotel;
import Modelo.Pago;
import Modelo.Platillo;
import Modelo.Reserva;
import Modelo.RestauranteBarTienda;
import Modelo.Solicitud;
import java.util.List;

// Definición de la clase RestauranteBarTiendaControlador
public class RestauranteBarTiendaControlador {
    private RestauranteBarTienda restauranteBarTiendaModelo; 

    // Constructor de la clase RestauranteBarTiendaControlador
    public RestauranteBarTiendaControlador(RestauranteBarTienda restauranteBarTiendaModelo) {
        this.restauranteBarTiendaModelo = restauranteBarTiendaModelo; // Inicializa el modelo RestauranteBarTienda
    }

    // Métodos para interactuar con el modelo RestauranteBarTienda

    // Método para agregar un platillo al menú
    public void agregarPlatillo(Platillo platillo) {
        restauranteBarTiendaModelo.agregarPlatillo(platillo);
    }

    // Método para eliminar un platillo del menú
    public void eliminarPlatillo(Platillo platillo) {
        restauranteBarTiendaModelo.eliminarPlatillo(platillo);
    }

    // Método para obtener el menú del restaurante
    public List<Platillo> obtenerMenu() {
        return restauranteBarTiendaModelo.obtenerMenu();
    }

    // Método para hacer una reserva
    public void hacerReserva(Reserva reserva) {
        restauranteBarTiendaModelo.hacerReserva(reserva);
    }

    // Método para crear una solicitud
    public void crearSolicitud(Solicitud solicitud) {
        restauranteBarTiendaModelo.crearSolicitud(solicitud);
    }

    // Método para actualizar el estado de una solicitud
    public void actualizarEstadoSolicitud(Solicitud solicitud, String nuevoEstado) {
        restauranteBarTiendaModelo.actualizarEstadoSolicitud(solicitud, nuevoEstado);
    }

    // Método para obtener solicitudes por estado
    public List<Solicitud> obtenerSolicitudesPorEstado(String estado) {
        return restauranteBarTiendaModelo.obtenerSolicitudesPorEstado(estado);
    }

    // Método para registrar un pago
    public void registrarPago(Pago pago) {
        restauranteBarTiendaModelo.registrarPago(pago);
    }

    // Método para obtener la lista de pagos
    public List<Pago> obtenerPagos() {
        return restauranteBarTiendaModelo.obtenerPagos();
    }

    // Getters y setters para los atributos del restaurante

    public String getNombre() {
        return restauranteBarTiendaModelo.getNombre();
    }

    public void setNombre(String nombre) {
        restauranteBarTiendaModelo.setNombre(nombre);
    }

    public String getHorario() {
        return restauranteBarTiendaModelo.getHorario();
    }

    public void setHorario(String horario) {
        restauranteBarTiendaModelo.setHorario(horario);
    }

    public Hotel getHotel() {
        return restauranteBarTiendaModelo.getHotel();
    }

    public void setHotel(Hotel hotel) {
        restauranteBarTiendaModelo.setHotel(hotel);
    }
}
