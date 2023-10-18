package Entidades;

public class Comida {
    private String nombre;
    private String detalle;
    private int cantCalorias;
    private int idComida;
private Ingredientes ingredientes;
    public Comida() {
    }

    public Comida(String nombre, String detalle, int cantCalorias, int idComida, Ingredientes ingredientes) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
        this.idComida = idComida;
        this.ingredientes = ingredientes;
    }

    public Comida(String nombre, String detalle, int cantCalorias, Ingredientes ingredientes) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public Ingredientes getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Comida{" + "nombre=" + nombre + ", detalle=" + detalle + ", cantCalorias=" + cantCalorias + ", idComida=" + idComida + ", ingredientes=" + ingredientes + '}';
    }

}
