/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.List;

public class Admin {
    private List<Reserva> reservas;
    private List<Solicitud> solicitudes;

    public void hacerNuevaReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void hacerNuevaSolicitud(Solicitud solicitud) {
        solicitudes.add(solicitud);
    }

    public List<Solicitud> verSolicitudesConfirmadas() {
        return solicitudes.stream()
                .filter(solicitud -> "Confirmada".equals(solicitud.getEstado()))
                .toList();
    }

    public void historialSolicitudes() {
        for (Solicitud solicitud : solicitudes) {
            System.out.println(solicitud.getDescripcion());
        }
    }
}

