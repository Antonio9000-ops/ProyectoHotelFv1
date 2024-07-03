package Controlador;

import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Reporte;
import java.util.Date;
import java.util.List;

// Definición de la clase ReporteControlador
public class ReporteControlador {
    private Reporte reporteModelo; // Modelo Reporte para interactuar con los datos

    // Constructor de la clase ReporteControlador
    public ReporteControlador(Reporte reporteModelo) {
        this.reporteModelo = reporteModelo; // Inicializa el modelo Reporte
    }

    // Métodos para interactuar con el modelo Reporte

    // Método para generar un reporte
    public void generarReporte() {
        reporteModelo.generarReporte(); // Llama al método generarReporte del modelo
    }

    // Método para agregar un detalle al reporte
    public void agregarDetalle(String detalle) {
        reporteModelo.agregarDetalle(detalle); // Llama al método agregarDetalle del modelo
    }

    // Método para obtener el reporte en formato de cadena
    public String obtenerReporte() {
        return reporteModelo.obtenerReporte(); // Llama al método obtenerReporte del modelo
    }

    // Método para obtener reportes por fecha
    public List<Reporte> obtenerReportesPorFecha(List<Reporte> reportes, Date fecha) {
        return Reporte.obtenerReportesPorFecha(reportes, fecha); // Llama al método obtenerReportesPorFecha del modelo
    }

    // Getters y setters para los atributos de la clase Reporte

    public Date getFechaGeneracion() {
        return reporteModelo.getFechaGeneracion();
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        reporteModelo.setFechaGeneracion(fechaGeneracion);
    }

    public String getTipo() {
        return reporteModelo.getTipo();
    }

    public void setTipo(String tipo) {
        reporteModelo.setTipo(tipo);
    }

    public List<String> getDetalles() {
        return reporteModelo.getDetalles();
    }

    public void setDetalles(List<String> detalles) {
        reporteModelo.setDetalles(detalles);
    }

    public Cliente getCliente() {
        return reporteModelo.getCliente();
    }

    public void setCliente(Cliente cliente) {
        reporteModelo.setCliente(cliente);
    }

    public Empleado getEmpleado() {
        return reporteModelo.getEmpleado();
    }

    public void setEmpleado(Empleado empleado) {
        reporteModelo.setEmpleado(empleado);
    }
}
