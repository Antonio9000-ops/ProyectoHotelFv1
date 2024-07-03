package Modelo;

import java.util.ArrayList;
import java.util.List;

// Definición de la clase Galería
public class Galeria {
    // Atributos de la clase Galería
    private List<String> imagenes;
    private List<String> descripciones;
    
    // Relación con la clase Hotel
    private Hotel hotel;

    // Constructor de la clase Galería
    public Galeria(Hotel hotel) {
        this.imagenes = new ArrayList<>();
        this.descripciones = new ArrayList<>();
        this.hotel = hotel;
    }

    // Métodos de la clase Galería

    // Método para agregar una imagen a la galería
    public void agregarImagen(String imagen, String descripcion) {
        imagenes.add(imagen);
        descripciones.add(descripcion);
    }

    // Método para eliminar una imagen de la galería
    public void eliminarImagen(String imagen) {
        int index = imagenes.indexOf(imagen);
        if (index >= 0) {
            imagenes.remove(index);
            descripciones.remove(index);
        }
    }

    // Método para obtener la lista de imágenes de la galería
    public List<String> obtenerImagenes() {
        return imagenes;
    }

    // Método para obtener la lista de descripciones de las imágenes
    public List<String> obtenerDescripciones() {
        return descripciones;
    }

    // Método para enviar una imagen por WhatsApp (funcionalidad simulada)
    public void whatsapp(String imagen) {
        // Lógica para enviar la imagen por WhatsApp
        System.out.println("Enviando la imagen " + imagen + " por WhatsApp...");
    }

    // Getter y setter para el atributo hotel
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
