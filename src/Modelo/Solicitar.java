/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;
import java.util.ArrayList;

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

   

    // Métodos adicionales
    public void crearSolicitud(Solicitud solicitud) {
        solicitudes.add(solicitud);
        System.out.println("Solicitud creada para el cliente: " + solicitud.getCliente().getNombre());
    }

    public void actualizarEstado(Solicitud solicitud, String nuevoEstado) {
        solicitud.setEstado(nuevoEstado);
        System.out.println("Estado de la solicitud actualizado a: " + nuevoEstado);
    }

    public List<Solicitud> obtenerSolicitudesPorCliente(Cliente cliente) {
        List<Solicitud> solicitudesCliente = new ArrayList<>();
        for (Solicitud solicitud : solicitudes) {
            if (solicitud.getCliente().equals(cliente)) {
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


