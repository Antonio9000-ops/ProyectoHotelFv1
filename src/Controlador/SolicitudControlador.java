package Controlador;

import Modelo.Solicitud;
import java.util.Date;

public class SolicitudControlador {
    private Solicitud solicitudModelo;

    public SolicitudControlador(Solicitud solicitudModelo) {
        this.solicitudModelo = solicitudModelo;
    }

    public String getTipoSolicitud() {
        return solicitudModelo.getTipoSolicitud();
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        solicitudModelo.setTipoSolicitud(tipoSolicitud);
    }

    public String getNombreCliente() {
        return solicitudModelo.getNombreCliente();
    }

    public void setNombreCliente(String nombreCliente) {
        solicitudModelo.setNombreCliente(nombreCliente);
    }

    public String getNumeroHabitacion() {
        return solicitudModelo.getNumeroHabitacion();
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        solicitudModelo.setNumeroHabitacion(numeroHabitacion);
    }

    public String getDescripcion() {
        return solicitudModelo.getDescripcion();
    }

    public void setDescripcion(String descripcion) {
        solicitudModelo.setDescripcion(descripcion);
    }

    public Date getFechaSolicitud() {
        return solicitudModelo.getFechaSolicitud();
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        solicitudModelo.setFechaSolicitud(fechaSolicitud);
    }

    public String getEstado() {
        return solicitudModelo.getEstado();
    }

    public void setEstado(String estado) {
        solicitudModelo.setEstado(estado);
    }
}
