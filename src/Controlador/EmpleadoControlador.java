package Controlador;

import Modelo.Empleado;
import Modelo.Cliente;
import Modelo.Reserva;

// Definición de la clase EmpleadoControlador
public class EmpleadoControlador {
    private Empleado empleadoModelo; // Modelo Empleado para interactuar con los datos

    // Constructor de la clase EmpleadoControlador
    public EmpleadoControlador(Empleado empleadoModelo) {
        this.empleadoModelo = empleadoModelo; // Inicializa el modelo Empleado
    }

    // Método para registrar un nuevo cliente
    public void registrarCliente(Cliente cliente) {
        empleadoModelo.registrarCliente(cliente); // Llama al método del modelo para registrar un nuevo cliente
    }

    // Método para gestionar reservas de clientes
    public void gestionarReservas(Reserva reserva) {
        empleadoModelo.gestionarReservas(reserva); // Llama al método del modelo para gestionar reservas
    }

    // Método para obtener el historial de un cliente
    public void historialCliente(Cliente cliente) {
        empleadoModelo.historialCliente(cliente); // Llama al método del modelo para obtener el historial de un cliente
    }

    // Getters y setters para los atributos del empleado

    public String getNombre() {
        return empleadoModelo.getNombre(); // Devuelve el nombre del empleado desde el modelo
    }

    public void setNombre(String nombre) {
        empleadoModelo.setNombre(nombre); // Establece el nombre del empleado en el modelo
    }

    public String getApellido() {
        return empleadoModelo.getApellido(); // Devuelve el apellido del empleado desde el modelo
    }

    public void setApellido(String apellido) {
        empleadoModelo.setApellido(apellido); // Establece el apellido del empleado en el modelo
    }

    public String getEmail() {
        return empleadoModelo.getEmail(); // Devuelve el email del empleado desde el modelo
    }

    public void setEmail(String email) {
        empleadoModelo.setEmail(email); // Establece el email del empleado en el modelo
    }

    public String getTelefono() {
        return empleadoModelo.getTelefono(); // Devuelve el teléfono del empleado desde el modelo
    }

    public void setTelefono(String telefono) {
        empleadoModelo.setTelefono(telefono); // Establece el teléfono del empleado en el modelo
    }

    public String getPuesto() {
        return empleadoModelo.getPuesto(); // Devuelve el puesto del empleado desde el modelo
    }

    public void setPuesto(String puesto) {
        empleadoModelo.setPuesto(puesto); // Establece el puesto del empleado en el modelo
    }
}
