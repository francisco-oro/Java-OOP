package practica6.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {

        User user1 = new User("Juan", "Pérez", "555-1234", "juan.perez@gmail.com");
        User user2 = new User("Ana", "García", "555-4321", "ana.garcia@hotmail.com");

        Funcion funcion1 = new Funcion("Titanic", 100, "03-12-2023", 1, "sdsd"); // Crear una instancia de la clase Funcion
        user1.buyTickets(2, funcion1); // Comprar dos boletos para la función

    }
}
