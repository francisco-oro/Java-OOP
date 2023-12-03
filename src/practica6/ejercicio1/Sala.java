package practica6.ejercicio1;

import java.util.*;

public class Sala {
    private List<Funcion> funciones = new ArrayList<Funcion>();
    private int numero;

    public Sala(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    public Sala(List<Funcion> funciones, int numero) {
        this.funciones = funciones;
        this.numero = numero;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
