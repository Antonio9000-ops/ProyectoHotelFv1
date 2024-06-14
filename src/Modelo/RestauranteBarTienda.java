package Modelo;
import java.util.ArrayList;
import java.util.List;

// Definición de la clase RestauranteBarTienda
public class RestauranteBarTienda {
    // Atributos de la clase RestauranteBarTienda
    private String nombre;
    private String horario;
    private List<Platillo> menu;
    private Hotel hotel;  // Relación con la clase Hotel
    private List<Solicitud> solicitudes;  // Relación con la clase Solicitar
    private List<Pago> pagos;  // Relación con la clase Pago

    // Constructor de la clase RestauranteBarTienda
    public RestauranteBarTienda(String nombre, String horario, Hotel hotel) {
        this.nombre = nombre;
        this.horario = horario;
        this.menu = new ArrayList<>();
        this.hotel = hotel;
        this.solicitudes = new ArrayList<>();
        this.pagos = new ArrayList<>();
    }

    // Métodos de la clase RestauranteBarTienda

    // Método para agregar un platillo al menú
    public void agregarPlatillo(Platillo platillo) {
        menu.add(platillo);
    }

    // Método para eliminar un platillo del menú
    public void eliminarPlatillo(Platillo platillo) {
        menu.remove(platillo);
    }

    // Método para obtener el menú del restaurante
    public List<Platillo> obtenerMenu() {
        return menu;
    }

    // Método para hacer una reserva
    public void hacerReserva(Reserva reserva) {
        // Implementación del método de reserva
    }

    // Método para registrar una nueva solicitud
    public void crearSolicitud(Solicitud solicitud) {
        solicitudes.add(solicitud);
    }

    // Método para actualizar el estado de una solicitud
    public void actualizarEstadoSolicitud(Solicitud solicitud, String nuevoEstado) {
        solicitud.setEstado(nuevoEstado);
    }

    // Método para obtener solicitudes por estado
    public List<Solicitud> obtenerSolicitudesPorEstado(String estado) {
        List<Solicitud> result = new ArrayList<>();
        for (Solicitud solicitud : solicitudes) {
            if (solicitud.getEstado().equals(estado)) {
                result.add(solicitud);
            }
        }
        return result;
    }

    // Método para registrar un nuevo pago
    public void registrarPago(Pago pago) {
        pagos.add(pago);
    }

    // Método para obtener la lista de pagos
    public List<Pago> obtenerPagos() {
        return pagos;
    }

    // Getters y setters para los atributos del restaurante

    // Getter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo horario
    public String getHorario() {
        return horario;
    }

    // Setter para el atributo horario
    public void setHorario(String horario) {
        this.horario = horario;
    }

    // Getter para el atributo hotel
    public Hotel getHotel() {
        return hotel;
    }

    // Setter para el atributo hotel
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
