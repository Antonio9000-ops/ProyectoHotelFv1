package Controlador;

import Modelo.Cliente;
import Modelo.Solicitar;
import Modelo.Solicitud;
import java.util.List;

// Definición de la clase SolicitarControlador
public class SolicitarControlador {
    private Solicitar solicitarModelo; // 

    // Constructor de la clase SolicitarControlador
    public SolicitarControlador(Solicitar solicitarModelo) {
        this.solicitarModelo = solicitarModelo; // Inicializa el modelo Solicitar
    }


    // Método para crear una solicitud
    public void crearSolicitud(Solicitud solicitud) {
        solicitarModelo.crearSolicitud(solicitud);
    }

    // Método para actualizar el estado de una solicitud
    public void actualizarEstado(Solicitud solicitud, String nuevoEstado) {
        solicitarModelo.actualizarEstado(solicitud, nuevoEstado);
    }

    
    // Método para obtener solicitudes por cliente
    public List<Solicitud> obtenerSolicitudesPorCliente(Cliente cliente) {
        return solicitarModelo.obtenerSolicitudesPorCliente(cliente);
    }

    // Método para obtener solicitudes por estado
    public List<Solicitud> obtenerSolicitudesPorEstado(String estado) {
        return solicitarModelo.obtenerSolicitudesPorEstado(estado);
    }

    // Getters y setters para los atributos de Solicitar

    public List<Solicitud> getSolicitudes() {
        return solicitarModelo.getSolicitudes();
    }

    public void setSolicitudes(List<Solicitud> solicitudes) {
        solicitarModelo.setSolicitudes(solicitudes);
    }
}
