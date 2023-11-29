package practica4.ejercicio3;

import java.util.ArrayList;

class Agenda {
    // Atributo de la clase
    private ArrayList<Contacto> contactos; // El ArrayList de contactos

    // Constructor de la clase
    public Agenda() {
        // Inicializar el ArrayList de contactos
        contactos = new ArrayList<Contacto>();
    }

    // Métodos de la clase

    // Método para guardar un contacto en la agenda
    public void guardarContacto(Contacto c) {
        // Agregar el contacto al ArrayList de contactos
        contactos.add(c);
    }

    // Método para buscar un contacto en la agenda por su nombre
    public Contacto buscarContacto(String nombre) {
        // Recorrer el ArrayList de contactos
        for (Contacto c : contactos) {
            // Si el nombre del contacto coincide con el nombre buscado
            if (c.getNombre().equals(nombre)) {
                // Devolver el contacto encontrado
                return c;
            }
        }
        // Si no se encontró ningún contacto con ese nombre, devolver null
        return null;
    }

    // Método para ver todos los contactos de la agenda
    public String verContactos() {
        // Crear una variable para almacenar el resultado
        String resultado = "";

        // Recorrer el ArrayList de contactos
        for (Contacto c : contactos) {
            // Añadir los datos del contacto al resultado
            resultado += c.toString() + "\n\n";
        }

        // Devolver el resultado
        return resultado;
    }

    // Método para eliminar un contacto de la agenda por su nombre
    public void eliminarContacto(String nombre) {
        // Buscar el índice del contacto en el ArrayList de contactos
        int indice = contactos.indexOf(buscarContacto(nombre));

        // Si el índice es válido
        if (indice != -1) {
            // Eliminar el contacto del ArrayList de contactos
            contactos.remove(indice);
        }
    }
}