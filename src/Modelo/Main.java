/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un menú con platillos peruanos
        List<Platillo> menu = new ArrayList<>();
        menu.add(new Platillo("Ceviche", 40.00));
        menu.add(new Platillo("Lomo Saltado", 55.00));
        menu.add(new Platillo("Ají de Gallina", 45.00));
        menu.add(new Platillo("Pachamanca", 65.00));
        menu.add(new Platillo("Causa Rellena", 35.00));
        menu.add(new Platillo("Anticuchos", 30.00));

        // Crear una instancia de RestauranteBarTienda
        RestauranteBarTienda restaurante = new RestauranteBarTienda("Restaurante El Sabor Peruano", "08:00 - 22:00", menu);

        // Crear un hotel
        Hotel hotel1 = new Hotel(
                "Hotel Cielo",
                "Avenida Libertad 567, San Isidro, Lima, Perú",
                5,
                new ArrayList<>(),
                restaurante,  // Utiliza el restaurante recién creado
                new ArrayList<>(),
                new ArrayList<>()
        );

        // Crear un cliente asociado con el hotel
        Login login1 = new Login("usuario", "contraseña");
        Cliente cliente1 = new Cliente(
                "Juan",
                "Perez",
                "juan.perez@example.com",
                "123456789",
                "Calle Pachacútec 456, San Borja, Lima, Perú",
                login1,
                hotel1
        );

        // Imprimir detalles del cliente y su hotel
        System.out.println("Cliente: " + cliente1.getNombre() + " " + cliente1.getApellido());
        System.out.println("Hotel: " + cliente1.getHotel().getNombre());
        System.out.println("Dirección del Hotel: " + cliente1.getHotel().getDireccion());
        System.out.println("Restaurante: " + cliente1.getHotel().getRestaurante().getNombre());
        System.out.println("Horario del Restaurante: " + cliente1.getHotel().getRestaurante().getHorario());

        // Imprimir menú del restaurante
        System.out.println("Menú del Restaurante:");
        for (Platillo platillo : cliente1.getHotel().getRestaurante().getMenu()) {
            System.out.println("- " + platillo.getNombre() + ": S/." + platillo.getPrecio());
        }
    }
}