    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class Login {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

   
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    // Métodos adicionales
    public boolean autenticar(String username, String password) {
        // Implementación para autenticar al usuario
        // Aquí deberías añadir la lógica para verificar las credenciales
        return this.username.equals(username) && this.password.equals(password);
    }

    public void cambiarPassword(String nuevaPassword) {
        // Implementación para cambiar la contraseña
        this.password = nuevaPassword;
        System.out.println("Contraseña cambiada exitosamente.");
    }

    public void recuperarPassword(String email) {
        // Implementación para recuperar la contraseña
        // Aquí deberías añadir la lógica para enviar un correo electrónico con instrucciones para recuperar la contraseña
        System.out.println("Instrucciones para recuperar la contraseña enviadas a: " + email);
    }

    public void cerrarSesion() {
        // Implementación para cerrar sesión
        System.out.println("Sesión cerrada exitosamente.");
    }
}
