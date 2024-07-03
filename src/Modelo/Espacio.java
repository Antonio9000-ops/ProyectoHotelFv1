
package Modelo;
 
public class Espacio {
    private String id;
    private boolean disponible;

    public Espacio(String id, boolean disponible) {
        this.id = id;
        this.disponible = disponible;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
