/*
 * Clase base dedicada a las obrasSociales
 */
package ClasesBase;

/**
 *
 * @author Fran
 */
public class ObraSocial {
    private int id;
    private String nombre;

    public ObraSocial(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public ObraSocial() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
