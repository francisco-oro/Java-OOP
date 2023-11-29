package practica4.ejercicio3;
// Importar la librería Swing para la interfaz gráfica
import javax.swing.*;

// Crear la clase Contacto que representa la información de una persona
class Contacto {
    // Atributos de la clase
    private String nombre; // El nombre de la persona
    private String apellido; // El apellido de la persona
    private String telefono; // El teléfono de la persona
    private String correo; // El correo de la persona
    private String direccion; // La dirección de la persona

    // Constructor de la clase
    public Contacto(String nombre, String apellido, String telefono, String correo, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    // Métodos de la clase

    // Método para obtener el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    // Método para modificar el nombre de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el apellido de la persona
    public String getApellido() {
        return apellido;
    }

    // Método para modificar el apellido de la persona
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Método para obtener el teléfono de la persona
    public String getTelefono() {
        return telefono;
    }

    // Método para modificar el teléfono de la persona
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para obtener el correo de la persona
    public String getCorreo() {
        return correo;
    }

    // Método para modificar el correo de la persona
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Método para obtener la dirección de la persona
    public String getDireccion() {
        return direccion;
    }

    // Método para modificar la dirección de la persona
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método para devolver una cadena con los datos de la persona
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nTeléfono: " + telefono + "\nCorreo: " + correo + "\nDirección: " + direccion;
    }
}