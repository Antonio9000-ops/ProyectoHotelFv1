package Controlador;

import Modelo.Cliente;
import Modelo.Solicitud;
import java.util.Date;

// Definición de la clase SolicitudControlador
public class SolicitudControlador {
    private Solicitud solicitudModelo; // Modelo Solicitud para interactuar con los datos

    // Constructor de la clase SolicitudControlador
    public SolicitudControlador(Solicitud solicitudModelo) {
        this.solicitudModelo = solicitudModelo; // Inicializa el modelo Solicitud
    }

    // Métodos para interactuar con el modelo Solicitud

    // Getters y setters para los atributos de la solicitud

    public String getTipoSolicitud() {
        return solicitudModelo.getTipoSolicitud();
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        solicitudModelo.setTipoSolicitud(tipoSolicitud);
    }

    public Cliente getCliente() {
        return solicitudModelo.getCliente();
    }

    public void setCliente(Cliente cliente) {
        solicitudModelo.setCliente(cliente);
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
