package practica4.ejercicio4;

import java.util.*;

import static javax.swing.UIManager.put;

public class Ejercicio4 {

    public static Dictionary<Integer, List<Platillo>> Platillos = new Hashtable<Integer, List<Platillo>>(){{

        put(1, new ArrayList<Platillo>(){
            { new Platillo(20.0, "Agua mineral", "Bebida");}
            { new Platillo(25.0, "Jugo de naranja", "Bebida");}
        });
        put(2, new ArrayList<Platillo>(){
            { new Platillo(60.0, "Sopa de tortilla", "Entrada");}
        });
        put(3, new ArrayList<Platillo>(){
            { new Platillo(120.0, "Milanesa de pollo", "Plato fuerte");}
            { new Platillo(150.0, "Pescado a la veracruzana", "Plato fuerte");}
            { new Platillo(180.0, "Bistec a la mexicana", "Plato fuerte");}

        });
        put(4, new ArrayList<Platillo>(){
            { new Platillo(30.0, "Puré de papa", "Guarnición");}
            { new Platillo(40.0, "Arroz blanco", "Guarnición");}
            { new Platillo(50.0, "Ensalada verde", "Guarnición");}

        });
        put(5, new ArrayList<Platillo>(){
            { new Platillo(40.0, "Flan de vainilla", "Postre");}
            { new Platillo(45.0, "Gelatina de fresa", "Postre");}
            { new Platillo(60.0, "Pastel de chocolate", "Postre");}

        });
    }};

    public static Dictionary<Integer, List<Platillo>> getPlatillos() {
        return Platillos;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        Mesero mesero = new Mesero("Pedro");
        System.out.println("Por favor ingrese su nombre");
        String name = scanner.nextLine();
        Comensal comensal = new Comensal(name);


        System.out.println("Hola, soy " + mesero.getNombre()+  ", su mesero ¿Qué desea ordenar?");
        mesero.tomarOrden(comensal);

        System.out.println("Estamos preparando su orden. Un momento por favor.");
        mesero.entregarPlatillos(comensal);

        System.out.println("Entregando cuenta");
        mesero.entregarCuenta(comensal);
    }
}
