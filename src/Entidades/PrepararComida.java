
package Entidades;


public class PrepararComida {
    
    private int idPrepararComida;
    private Comida idComida;
    private Ingredientes ingredientes;

    public PrepararComida() {
    }

    public PrepararComida(int idPrepararComida, Comida idComida, Ingredientes ingredientes) {
        this.idPrepararComida = idPrepararComida;
        this.idComida = idComida;
        this.ingredientes = ingredientes;
    }

    public int getIdPrepararComida() {
        return idPrepararComida;
    }

    public void setIdPrepararComida(int idPrepararComida) {
        this.idPrepararComida = idPrepararComida;
    }

    public Comida getIdComida() {
        return idComida;
    }

    public void setIdComida(Comida idComida) {
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
        return "PrepararComida{" + "idPrepararComida=" + idPrepararComida + ", idComida=" + idComida + ", ingredientes=" + ingredientes + '}';
    }
    
    
}
