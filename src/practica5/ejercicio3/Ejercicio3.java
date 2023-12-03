package practica5.ejercicio3;
public class Ejercicio3 {
    // Método main del programa
    public static void main(String[] args) {
        mostrarMenu("Francisco");


    }

    public static void mostrarMenu(String nickname) {
        System.out.println("Bienvenido " + nickname + "!");
        System.out.println("-----------------------------------------");
        System.out.println("a. Perfil");
        System.out.println("i. Ver Mis datos");
        System.out.println("ii. Actualizar Mi suscripción");
        System.out.println("b. Contactos");
        System.out.println("i. Guardar Contacto (Nombre, Apellidos, teléfono, correo y dirección");
        System.out.println("ii. Buscar contacto (Solo por nombre)");
        System.out.println("iii. Ver Contactos");
        System.out.println("c. Salir");
    }
}
