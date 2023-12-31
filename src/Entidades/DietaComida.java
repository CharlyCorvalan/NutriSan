package Entidades;


import Entidades.Dieta;
import Entidades.Comida;

public class DietaComida {
    private int id;
    private Comida comida;
    private Dieta dieta;

    public DietaComida() {
    }

    public DietaComida(int id, Comida comida, Dieta dieta) {
        this.id = id;
        this.comida = comida;
        this.dieta = dieta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    @Override
    public String toString() {
        return "DietaComida{" + "id=" + id + ", comida=" + comida + ", dieta=" + dieta + '}';
    }
    
    
    
    public void untitledMethod() {
    }
}
