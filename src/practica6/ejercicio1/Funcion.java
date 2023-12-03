package practica6.ejercicio1;

import java.util.Date;

public class Funcion {
    private String nombre;
    private int asientosDisponibles;
    private Date fecha;
    private Sala sala;
    private double cost;

    public Funcion(String nombre, int asientosDisponible, double cost ) {
        this.nombre = nombre;
        this.asientosDisponibles = asientosDisponibles;
        this.cost = cost;
    }

    public Funcion(String nombre, int asientosDisponibles, Date fecha, Sala sala) {
        this.nombre = nombre;
        this.asientosDisponibles = asientosDisponibles;
        this.fecha = fecha;
        this.sala = sala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public Date getFecha() {
        return fecha;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
