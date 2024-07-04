package Modelo;

import java.util.ArrayList;
import java.util.List;

// Definición de la clase Cliente
public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
    private List<Reserva> reservasHabitacion;
    private List<ReservaServicio> reservasServicio;
    private Solicitar solicitudes;
    private Login login;
    private Hotel hotel;
    private List<Pago> pagos;
    private List<Reporte> reportes;
    private List<Empleado> empleados;
    private int numeroHabitacion; 


    // Constructor de la clase Cliente
    public Cliente(String nombre, String apellido, String direccion, String telefono, String email, Login login, Hotel hotel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.reservasHabitacion = new ArrayList<>();
        this.reservasServicio = new ArrayList<>();
        this.solicitudes = new Solicitar();
        this.login = login;
        this.hotel = hotel;
        this.pagos = new ArrayList<>();
        this.reportes = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }
   
    public Cliente(String nombre, String telefono, String email) {
    this.nombre = nombre;
    this.telefono = telefono;
    this.email = email;
    // Inicializa otros atributos como sea necesario
    this.reservasHabitacion = new ArrayList<>();
    this.reservasServicio = new ArrayList<>();
    this.solicitudes = new Solicitar();
    this.pagos = new ArrayList<>();
    this.reportes = new ArrayList<>();
    this.empleados = new ArrayList<>();
    }
    public Cliente( ){
        
    }

    // Métodos de la clase Cliente

    public void hacerReservaHabitacion(Reserva reserva) {
        reservasHabitacion.add(reserva);
    }

    public void hacerReservaServicio(ReservaServicio reserva) {
        reservasServicio.add(reserva);
    }

    public void cancelarReservaHabitacion(Reserva reserva) {
        reservasHabitacion.remove(reserva);
    }

    public void cancelarReservaServicio(ReservaServicio reserva) {
        reservasServicio.remove(reserva);
    }

    public List<Reserva> obtenerReservasHabitacion() {
        return reservasHabitacion;
    }

    public List<ReservaServicio> obtenerReservasServicio() {
        return reservasServicio;
    }

    public void crearSolicitud(Solicitud solicitud) {
        solicitudes.crearSolicitud(solicitud);
    }

    public void actualizarEstadoSolicitud(Solicitud solicitudSeleccionada, String nuevoEstado) {
        solicitudes.actualizarEstado(solicitudSeleccionada, nuevoEstado);
    }

    public List<Solicitud> obtenerSolicitudesPorCliente() {
        return solicitudes.getSolicitudes();
    }

    public List<Solicitud> obtenerSolicitudesPorEstado(String estado) {
        return solicitudes.obtenerSolicitudesPorEstado(estado);
    }

    public void realizarPago(Pago pago) {
        pagos.add(pago);
    }

    public List<Pago> obtenerPagos() {
        return pagos;
    }

    public void generarReporte(Reporte reporte) {
        reportes.add(reporte);
    }

    public List<Reporte> obtenerReportes() {
        return reportes;
    }

    public void asignarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado> obtenerEmpleados() {
        return empleados;
    }

    // Getters y setters para los atributos del cliente
     public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Solicitar getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(Solicitar solicitudes) {
        this.solicitudes = solicitudes;
    }
}
