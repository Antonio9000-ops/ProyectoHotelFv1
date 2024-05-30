/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reportes {
    private Date fechaGeneracion;
    private String tipo;
    private List<String> detalles;

    public Reportes(Date fechaGeneracion, String tipo) {
        this.fechaGeneracion = fechaGeneracion;
        this.tipo = tipo;
        this.detalles = new ArrayList<>();
    }

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

    // Método generarReporte
    public void generarReporte() {
        // Lógica para generar un reporte
        System.out.println("Generando reporte de tipo: " + tipo + " en la fecha: " + fechaGeneracion);
        // Aquí iría el código para generar y guardar el reporte, por ejemplo en una base de datos
    }

    // Método agregarDetalle
    public void agregarDetalle(String detalle) {
        // Lógica para agregar un detalle al reporte
        detalles.add(detalle);
        System.out.println("Detalle agregado al reporte: " + detalle);
    }

    // Método obtenerReporte
    public String obtenerReporte() {
        // Lógica para obtener el contenido del reporte
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte de tipo: ").append(tipo).append("\n");
        reporte.append("Fecha de generación: ").append(fechaGeneracion).append("\n");
        reporte.append("Detalles:\n");
        for (String detalle : detalles) {
            reporte.append("- ").append(detalle).append("\n");
        }
        System.out.println("Obteniendo contenido del reporte.");
        return reporte.toString();
    }

    // Método obtenerReportesPorFecha
    public static List<Reportes> obtenerReportesPorFecha(List<Reportes> reportes, Date fecha) {
        // Lógica para obtener los reportes generados en una fecha específica
        List<Reportes> reportesPorFecha = new ArrayList<>();
        for (Reportes reporte : reportes) {
            if (reporte.getFechaGeneracion().equals(fecha)) {
                reportesPorFecha.add(reporte);
            }
        }
        System.out.println("Obteniendo reportes para la fecha: " + fecha);
        return reportesPorFecha;
    }
}

