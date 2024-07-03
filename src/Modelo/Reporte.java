package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reporte {
    // Atributos de la clase Reporte
    private Date fechaGeneracion;
    private String tipo;
    private List<String> detalles;
    
    // Relación de asociación con la clase Cliente
    private Cliente cliente;
    
    // Relación de asociación con la clase Empleado
    private Empleado empleado;

    // Constructor de la clase Reporte
    public Reporte(Date fechaGeneracion, String tipo, Cliente cliente, Empleado empleado) {
        this.fechaGeneracion = fechaGeneracion;
        this.tipo = tipo;
        this.detalles = new ArrayList<>();
        this.cliente = cliente;
        this.empleado = empleado;
    }

    // Métodos de la clase Reporte

    // Método para generar un reporte
    public void generarReporte() {
        // Lógica para generar el reporte
    }

    // Método para agregar un detalle al reporte
    public void agregarDetalle(String detalle) {
        detalles.add(detalle);
    }

    // Método para obtener el reporte en formato de cadena
    public String obtenerReporte() {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Fecha de Generación: ").append(fechaGeneracion).append("\n");
        reporte.append("Tipo: ").append(tipo).append("\n");
        reporte.append("Cliente: ").append(cliente.getNombre()).append(" ").append(cliente.getApellido()).append("\n");
        reporte.append("Empleado: ").append(empleado.getNombre()).append(" ").append(empleado.getApellido()).append("\n");
        reporte.append("Detalles: \n");
        for (String detalle : detalles) {
            reporte.append("- ").append(detalle).append("\n");
        }
        return reporte.toString();
    }

    // Método para obtener reportes por fecha
    public static List<Reporte> obtenerReportesPorFecha(List<Reporte> reportes, Date fecha) {
        List<Reporte> reportesPorFecha = new ArrayList<>();
        for (Reporte reporte : reportes) {
            if (reporte.getFechaGeneracion().equals(fecha)) {
                reportesPorFecha.add(reporte);
            }
        }
        return reportesPorFecha;
    }

    // Getters y setters para los atributos de la clase Reporte
    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<String> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<String> detalles) {
        this.detalles = detalles;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
