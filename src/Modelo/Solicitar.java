package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Solicitar {
    private List<Solicitud> solicitudes;
    
    public Solicitar() {
        this.solicitudes = new ArrayList<>();
    }

    public List<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public void crearSolicitud(Solicitud solicitud) {
        solicitudes.add(solicitud);
        System.out.println("Solicitud creada para el cliente: " + solicitud.getNombreCliente());
    }

    public void actualizarEstado(Solicitud solicitud, String nuevoEstado) {
        solicitud.setEstado(nuevoEstado);
        System.out.println("Estado de la solicitud actualizado a: " + nuevoEstado);
    }

    public List<Solicitud> obtenerSolicitudesPorCliente(Cliente nombreCliente) {
        List<Solicitud> solicitudesCliente = new ArrayList<>();
        for (Solicitud solicitud : solicitudes) {
            if (solicitud.getNombreCliente().equals(nombreCliente)) {
                solicitudesCliente.add(solicitud);
            }
        }
        return solicitudesCliente;
    }

    public List<Solicitud> obtenerSolicitudesPorEstado(String estado) {
        List<Solicitud> solicitudesEstado = new ArrayList<>();
        for (Solicitud solicitud : solicitudes) {
            if (solicitud.getEstado().equals(estado)) {
                solicitudesEstado.add(solicitud);
            }
        }
        return solicitudesEstado;
    }
}
