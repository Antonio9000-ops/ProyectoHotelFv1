package Modelo;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
    // Atributos de la clase Empleado
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String puesto;
    
    // Constructor de la clase Empleado
    public Empleado(String nombre, String apellido, String email, String telefono, String puesto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.puesto = puesto;
    }

    // Métodos de la clase Empleado
    
    // Método para registrar un nuevo cliente
    public void registrarCliente(Cliente cliente) {
        // Lógica para registrar un nuevo cliente en el sistema
        // Esto puede incluir agregar el cliente a una base de datos o una lista
        System.out.println("Cliente registrado: " + cliente.getNombre());
    }
    
    // Método para gestionar reservas de clientes
    public void gestionarReservas(Reserva reserva) {
        // Lógica para gestionar reservas de clientes
        // Esto puede incluir crear, modificar, o cancelar una reserva
        System.out.println("Reserva gestionada: " + reserva.getEstado());
    }
    
    // Método para obtener el historial de un cliente
    public void historialCliente(Cliente cliente) {
        // Lógica para obtener el historial de un cliente
        // Esto puede incluir obtener reservas pasadas y solicitudes realizadas
        System.out.println("Historial del cliente: " + cliente.getNombre());
    }

    // Getters y setters para los atributos de la clase Empleado

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}


