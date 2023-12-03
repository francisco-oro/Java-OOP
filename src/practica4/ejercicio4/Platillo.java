package practica4.ejercicio4;

public class Platillo {
    private double precio;
    private String nombre;
    private String clasificacion;
    private int cantidad;

    public Platillo(double precio, String nombre, String clasificacion) {
        this.precio = precio;
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }


    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
