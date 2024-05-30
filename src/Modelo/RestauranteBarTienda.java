/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.List;

public class RestauranteBarTienda {
   
    private String nombre;
    private String horario;
    private List<Platillo> menu;

    public RestauranteBarTienda(String nombre, String horario, List<Platillo> menu) {
        this.nombre = nombre;
        this.horario = horario;
        this.menu = menu;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Platillo> getMenu() {
        return menu;
    }
// Método para agregar un plato al menú
    public void agregarPlatillo(Platillo platillo) {
        this.menu.add(platillo);
    }

    // Método para eliminar un plato del menú
    public void eliminarPlatillo(Platillo Platillo, Object platillo) {
        this.menu.remove(platillo);
    }

    // Método para obtener el menú completo
    public List<Platillo> obtenerMenu() {
        return new ArrayList<>(this.menu);
    }

    // Método para hacer una reserva
    public void hacerReserva(Reserva reserva) {
        // Código para gestionar la reserva
        System.out.println("Reserva realizada para " + reserva.getCliente().getNombre() + " en el restaurante " + this.nombre);
    }
    
}