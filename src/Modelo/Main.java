/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un hotel
        Hotel hotel1 = new Hotel(
                "Hotel Paradise",
                "Avenida Siempre Viva 742",
                5,
                new ArrayList<>(),
                new RestauranteBarTienda(),
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
                "Calle Falsa 123",
                login1,
                hotel1
        );

        // Agregar el cliente al hotel
        hotel1.agregarCliente(cliente1);

        // Imprimir detalles del cliente y su hotel
        System.out.println("Cliente: " + cliente1.getNombre() + " " + cliente1.getApellido());
        System.out.println("Hotel: " + cliente1.getHotel().getNombre());
        System.out.println("Dirección del Hotel: " + cliente1.getHotel().getDireccion());
    }
}
