
package Entidades;


public class Ingredientes {
    
    private String nombre, categoria;
    private int cantCalorias, idIngredientes;

    public Ingredientes() {
    }

    public Ingredientes(String nombre, String categoria, int cantCalorias, int idIngredientes) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantCalorias = cantCalorias;
        this.idIngredientes = idIngredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public int getIdIngredientes() {
        return idIngredientes;
    }

    public void setIdIngredientes(int idIngredientes) {
        this.idIngredientes = idIngredientes;
    }

    @Override
    public String toString() {
        return "Ingredientes{" + "nombre=" + nombre + ", categoria=" + categoria + ", cantCalorias=" + cantCalorias + ", idIngredientes=" + idIngredientes + '}';
    }
    
    
     
}
