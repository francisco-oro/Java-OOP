package practica5.ejercicio2;
// Importar la librería Swing para la interfaz gráfica
import javax.swing.*;
// Crear la clase Cuenta que representa una cuenta bancaria
class Cuenta {
    // Atributos de la clase
    private int numero; // El número de la cuenta
    private String password; // La contraseña de la cuenta
    private double saldo; // El saldo de la cuenta
    private String nombre; // El nombre del cliente
    private String apellido; // El apellido del cliente
    private String correo; // El correo del cliente
    private String empresa; // La empresa del cliente

    // Constructor de la clase
    public Cuenta(int numero, String password, double saldo, String nombre, String apellido, String correo, String empresa) {
        this.numero = numero;
        this.password = password;
        this.saldo = saldo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.empresa = empresa;
    }

    // Métodos de la clase

    // Método para obtener el número de la cuenta
    public int getNumero() {
        return numero;
    }

    // Método para obtener la contraseña de la cuenta
    public String getPassword() {
        return password;
    }

    // Método para obtener el saldo de la cuenta
    public double getSaldo() {
        return saldo;
    }

    // Método para obtener el nombre del cliente
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el apellido del cliente
    public String getApellido() {
        return apellido;
    }

    // Método para obtener el correo del cliente
    public String getCorreo() {
        return correo;
    }

    // Método para obtener la empresa del cliente
    public String getEmpresa() {
        return empresa;
    }

    // Método para consultar el saldo de la cuenta
    public void consultarSaldo() {
        // Mostrar el saldo de la cuenta en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Su saldo actual es: $" + saldo);
    }

    // Método para retirar efectivo de la cuenta
    public void retirarEfectivo(double monto) {
        // Validar que el monto sea positivo y menor o igual al saldo
        if (monto > 0 && monto <= saldo) {
            // Restar el monto al saldo de la cuenta
            saldo = saldo - monto;
            // Mostrar un mensaje de confirmación en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, "Se ha retirado $" + monto + " de su cuenta.\nSu nuevo saldo es: $" + saldo);
        } else {
            // Mostrar un mensaje de error en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, "No se puede realizar el retiro.\nEl monto debe ser positivo y menor o igual al saldo disponible.");
        }
    }

    // Método para pagar un servicio de la cuenta
    public void pagarServicio(String servicio, double monto) {
        double comision = monto * 0.02;
        // Validar que el monto sea positivo y menor o igual al saldo
        if (monto > 0 && monto <= saldo) {
            // Restar el monto al saldo de la cuenta
            saldo = saldo - monto - comision;
            // Mostrar un mensaje de confirmación en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, "Se ha pagado el servicio de " + servicio + " por $" + monto + " más $" + comision + "de comision.\nSu nuevo saldo es: $" + saldo);
        } else {
            // Mostrar un mensaje de error en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, "No se puede realizar el pago.\nEl monto debe ser positivo y menor o igual al saldo disponible.");
        }
    }
}