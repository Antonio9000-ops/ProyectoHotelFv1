package Controlador;

import Modelo.Galeria;
import Modelo.Hotel;
import java.util.List;

// Definición de la clase GaleriaControlador
public class GaleriaControlador {
    private Galeria galeriaModelo; // Modelo Galeria para interactuar con los datos

    // Constructor de la clase GaleriaControlador
    public GaleriaControlador(Galeria galeriaModelo) {
        this.galeriaModelo = galeriaModelo; // Inicializa el modelo Galeria
    }

    // Método para agregar una imagen a la galería
    public void agregarImagen(String imagen, String descripcion) {
        galeriaModelo.agregarImagen(imagen, descripcion); // Agrega una imagen a la galería usando el método del modelo
    }

    // Método para eliminar una imagen de la galería
    public void eliminarImagen(String imagen) {
        galeriaModelo.eliminarImagen(imagen); // Elimina una imagen de la galería usando el método del modelo
    }

    // Método para obtener la lista de imágenes de la galería
    public List<String> obtenerImagenes() {
        return galeriaModelo.obtenerImagenes(); // Devuelve la lista de imágenes desde el modelo
    }

    // Método para obtener la lista de descripciones de las imágenes
    public List<String> obtenerDescripciones() {
        return galeriaModelo.obtenerDescripciones(); // Devuelve la lista de descripciones desde el modelo
    }

    // Método para enviar una imagen por WhatsApp (funcionalidad simulada)
    public void enviarImagenPorWhatsapp(String imagen) {
        galeriaModelo.whatsapp(imagen); // Envía la imagen por WhatsApp utilizando el método del modelo
    }

    // Getter para el atributo hotel
    public Hotel getHotel() {
        return galeriaModelo.getHotel(); // Devuelve el hotel asociado desde el modelo
    }

    // Setter para el atributo hotel
    public void setHotel(Hotel hotel) {
        galeriaModelo.setHotel(hotel); // Establece el hotel asociado en el modelo
    }
}
