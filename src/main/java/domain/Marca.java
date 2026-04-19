package domain;

/**
 *
 * @author elbat
 */
public class Marca {
    String pais;
    String nombre;

    public Marca() {
    }

    public Marca(String pais, String nombre) {
        this.pais = pais;
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}