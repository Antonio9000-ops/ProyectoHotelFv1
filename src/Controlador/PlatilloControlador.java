package Controlador;

import Modelo.Platillo;

// Definición de la clase PlatilloControlador
public class PlatilloControlador {
    private Platillo platilloModelo; // Modelo Platillo para interactuar con los datos

    // Constructor de la clase PlatilloControlador
    public PlatilloControlador(Platillo platilloModelo) {
        this.platilloModelo = platilloModelo; // Inicializa el modelo Platillo
    }

    // Métodos para interactuar con el modelo Platillo

    // Método para obtener el nombre del platillo
    public String obtenerNombre() {
        return platilloModelo.getNombre(); // Devuelve el nombre del platillo desde el modelo
    }

    // Método para establecer el nombre del platillo
    public void establecerNombre(String nombre) {
        platilloModelo.setNombre(nombre); // Establece el nombre del platillo en el modelo
    }

    // Método para obtener la descripción del platillo
    public String obtenerDescripcion() {
        return platilloModelo.getDescripcion(); // Devuelve la descripción del platillo desde el modelo
    }

    // Método para establecer la descripción del platillo
    public void establecerDescripcion(String descripcion) {
        platilloModelo.setDescripcion(descripcion); // Establece la descripción del platillo en el modelo
    }

    // Método para obtener el precio del platillo
    public double obtenerPrecio() {
        return platilloModelo.getPrecio(); // Devuelve el precio del platillo desde el modelo
    }

    // Método para establecer el precio del platillo
    public void establecerPrecio(double precio) {
        platilloModelo.setPrecio(precio); // Establece el precio del platillo en el modelo
    }

    // Método para mostrar los detalles del platillo
    public void mostrarDetalles() {
        System.out.println("Nombre: " + obtenerNombre());
        System.out.println("Descripción: " + obtenerDescripcion());
        System.out.println("Precio: " + obtenerPrecio());
    }
}
