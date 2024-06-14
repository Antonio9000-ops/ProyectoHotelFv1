package Modelo;
import java.util.Date;

public class Evento {
    // Atributos de la clase Evento
    private String nombre;
    private Date fecha;
    private String lugar;
    private String descripcion;

    // Constructor de la clase Evento
    public Evento(String nombre, Date fecha, String lugar, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.descripcion = descripcion;
    }

    // Métodos de la clase Evento

    // Método para enlazar con Whatsapp (simulado con un print)
    public void Link(String whatsapp) {
        System.out.println("Enlace a Whatsapp: " + whatsapp);
    }

    // Getters y setters para los atributos del evento

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
