/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Galeria {
    private List<String> imagenes;
    private List<String> descripciones;

    public Galeria() {
        this.imagenes = new ArrayList<>();
        this.descripciones = new ArrayList<>();
    }

    
    public List<String> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<String> imagenes) {
        this.imagenes = imagenes;
    }

    public List<String> getDescripciones() {
        return descripciones;
    }

    public void setDescripciones(List<String> descripciones) {
        this.descripciones = descripciones;
    }

    public void agregarImagen(String imagen, String descripcion) {
        
        imagenes.add(imagen);
        descripciones.add(descripcion);
        System.out.println("Imagen agregada: " + imagen);
        System.out.println("Descripción agregada: " + descripcion);
    }

    
    public void eliminarImagen(String imagen) {
        
        int index = imagenes.indexOf(imagen);
        if (index != -1) {
            imagenes.remove(index);
            descripciones.remove(index);
            System.out.println("Imagen eliminada: " + imagen);
        } else {
            System.out.println("Imagen no encontrada: " + imagen);
        }
    }

    // Método obtenerImagenes
    public List<String> obtenerImagenes() {
        // Lógica para obtener la lista de imágenes
        System.out.println("Obteniendo lista de imágenes.");
        return new ArrayList<>(imagenes);
    }

    // Método obtenerImagenesConDescripcion
    public List<String> obtenerImagenesConDescripcion() {
        // Lógica para obtener la lista de imágenes con sus descripciones
        List<String> imagenesConDescripcion = new ArrayList<>();
        for (int i = 0; i < imagenes.size(); i++) {
            imagenesConDescripcion.add(imagenes.get(i) + " - " + descripciones.get(i));
        }
        System.out.println("Obteniendo lista de imágenes con descripciones.");
        return imagenesConDescripcion;
    }
}

