package practica4.ejercicio4;

public class Comensal {
    private String name;
    private Orden orden;

    public Comensal(String name) {
        this.name = name;
    }

    public Comensal(String name, Orden orden) {
        this.name = name;
        this.orden = orden;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }
}
