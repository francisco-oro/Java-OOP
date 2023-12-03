package practica4.ejercicio4;

import java.util.*;


public class Mesero {
    private String nombre;

    public Mesero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void tomarOrden(Comensal comensal)
    {
        int option, cantidad;
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Platillo> nuevaOrden = new HashMap<Integer, Platillo>(5);

        System.out.println("Ingrese una bebida:");
        option = scanner.nextInt();
        System.out.println("Ingrese la cantidad:");
        cantidad = scanner.nextInt();
        nuevaOrden.put(cantidad, Ejercicio4.getPlatillos().get(1).get(option));


        System.out.println("Ingrese una entrada");
        option = scanner.nextInt();
        System.out.println("Ingrese la cantidad:");
        cantidad = scanner.nextInt();
        nuevaOrden.put(cantidad, Ejercicio4.getPlatillos().get(2).get(option));

        System.out.println("Ingrese un plato fuerte");
        option = scanner.nextInt();
        System.out.println("Ingrese la cantidad:");
        cantidad = scanner.nextInt();
        nuevaOrden.put(cantidad, Ejercicio4.getPlatillos().get(3).get(option));

        System.out.println("Ingrese una guarncición");
        option = scanner.nextInt();
        System.out.println("Ingrese la cantidad:");
        cantidad = scanner.nextInt();
        nuevaOrden.put(cantidad, Ejercicio4.getPlatillos().get(4).get(option));

        System.out.println("Ingrese un postre");
        option = scanner.nextInt();
        System.out.println("Ingrese la cantidad:");
        cantidad = scanner.nextInt();
        nuevaOrden.put(cantidad, Ejercicio4.getPlatillos().get(5).get(option));




        Orden orden = new Orden(nuevaOrden);
        comensal.setOrden(orden);
    }

    public void prepararOrden(Orden orden)
    {
        System.out.println("Su orden está siendo preparada...");

        for (Map.Entry<Integer, Platillo> platillo:
             orden.getPlatillos().entrySet()) {
            System.out.println("Preparando " + platillo.getKey() + " " + platillo.getValue());
            System.out.println("Hecho");
        }
    }

    public void entregarPlatillos(Comensal comensal)
    {
        Orden orden = comensal.getOrden();
        for (Map.Entry<Integer, Platillo> platillo :
                orden.getPlatillos().entrySet()) {
            System.out.println("Sirviendo " + platillo.getValue().getClasificacion() + " : " + platillo.getKey() + " " + platillo.getValue().getNombre());
        }

        System.out.println("Todos los platillos han sido servidos. Disfrute sua comida");
    }

    public void entregarCuenta(Comensal comensal)
    {
        Orden orden = comensal.getOrden();
        System.out.println("El total a pagar es: " + orden.getTotal());
    }
}
