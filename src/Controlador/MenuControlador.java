package Controlador;

import Modelo.Menu;
import Modelo.Platillo;

import java.util.List;

// Definición de la clase MenuControlador
public class MenuControlador {
    private Menu menuModelo; // Modelo Menu para interactuar con los datos

    // Constructor de la clase MenuControlador
    public MenuControlador(Menu menuModelo) {
        this.menuModelo = menuModelo; // Inicializa el modelo Menu
    }

    // Método para agregar un platillo al menú
    public void agregarPlatillo(Platillo platillo) {
        menuModelo.agregarPlatillos(platillo); // Agrega un platillo usando el método del modelo
    }

    // Método para obtener la lista de platillos del menú
    public List<Platillo> obtenerPlatillos() {
        return menuModelo.getPlatillos(); // Devuelve la lista de platillos desde el modelo
    }

    // Getter para el atributo catálogo
    public String getCatalogo() {
        return menuModelo.getCatalogo(); // Devuelve el catálogo del menú desde el modelo
    }

    // Setter para el atributo catálogo
    public void setCatalogo(String catalogo) {
        menuModelo.setCatalogo(catalogo); // Establece el catálogo del menú en el modelo
    }

    // Getter para el atributo platillos
    public List<Platillo> getPlatillos() {
        return menuModelo.getPlatillos(); // Devuelve la lista de platillos desde el modelo
    }

    // Setter para el atributo platillos
    public void setPlatillos(List<Platillo> platillos) {
        menuModelo.setPlatillos(platillos); // Establece la lista de platillos en el modelo
    }
}
