package practica4.ejercicio4;


import java.util.*;

public class Orden {
    private Map<Integer, Platillo>  Platillos = new HashMap<Integer, Platillo>();
    private double total  = 0;

    public Orden(Map<Integer, Platillo> platillos) {
        Platillos = platillos;
    }

    public Map<Integer, Platillo> getPlatillos() {
        return Platillos;
    }

    public void setPlatillos(Map<Integer, Platillo> platillos) {
        Platillos = platillos;
    }

    public double getTotal() {
        for (Map.Entry<Integer, Platillo> PlatilloCantidad:
             this.Platillos.entrySet()) {
            total += PlatilloCantidad.getKey() * PlatilloCantidad.getValue().getPrecio();
        }
        return total;
    }
    
}
