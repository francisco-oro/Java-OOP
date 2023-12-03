package practica5.ejercicio3;

import java.util.*;

public class Ejercicio3 {
    // Método main del programa
    public static void main(String[] args) {


        Suscription freeTier = new Suscription(0, "Free plan", 5);
        Suscription basicTier = new Suscription(10, "basic plan", 10);
        Suscription proTier = new Suscription(18, "pro plan", 20);

        User francisco = new User("Francisco", "Francisco@example.net", freeTier);
        Agenda agenda = new Agenda(francisco);
        mostrarMenu(francisco.getName());

        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        do {
            mostrarMenu(francisco.getName());
            System.out.println("Ingrese una opción:");
            opcion = teclado.nextLine();
            switch (opcion) {
                case "a.i":
                    System.out.println("Mostrando perfil: -----");
                    System.out.println("Nombre: " + francisco.getName());
                    System.out.println("Apellidos: " + francisco.getSurname());
                    System.out.println("Email: " + francisco.getEmail());
                    System.out.println("Nombre de usuario: " + francisco.getUsername());
                    System.out.println("Suscripción actual: " + francisco.getCurrentSuscription().getName());
                    break;
                case "a.ii":
                    System.out.println("Actualizando suscripción-----------");
                    francisco.updateSuscription(basicTier, "Tarjeta");

                    System.out.println("Suscripción actualizada con éxito");
                    System.out.println("Nueva suscripción: " + francisco.getCurrentSuscription().getName());
                    break;
                case "b.i":
                    System.out.println("Agregando contacto");
                    agenda.addContact(new Contact("Robert", "7228479102", "robert@example.com"));
                    break;
                case "b.ii":
                    System.out.println("Ingrese el nombre del contacto a buscar");
                    String name = teclado.nextLine();
                    agenda.searchContact(name.toLowerCase());
                    break;
                case "b.iii":
                    System.out.println("Ver todos los contactos");
                    agenda.displayContacts();
                    break;
                case "c":
                    System.out.println("Gracias por usar nuestro programa. Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (!opcion.equals("c"));


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
