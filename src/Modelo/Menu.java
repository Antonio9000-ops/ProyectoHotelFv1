/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String catalogo;
    private List<Platillo> platillos;

    public Menu(String catalogo) {
        this.catalogo = catalogo;
        this.platillos = new ArrayList<>();
    }

   
    public String getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(String catalogo) {
        this.catalogo = catalogo;
    }

    public List<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(List<Platillo> platillos) {
        this.platillos = platillos;
    }

    // Método agregarPlatillos
    public void agregarPlatillos(Platillo platillo) {
        // Lógica para agregar un platillo
        platillos.add(platillo);
        System.out.println("Platillo agregado: " + platillo.getNombre());
    }
}

