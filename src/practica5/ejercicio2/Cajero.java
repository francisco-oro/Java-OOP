package practica5.ejercicio2;

import javax.swing.*;

class Cajero {
    // Atributos de la clase
    private static Cuenta[] cuentas; // El arreglo de cuentas de los clientes
    private static Cuenta cuentaActual; // La cuenta del cliente que inició sesión
    private static boolean sesionActiva; // El estado de la sesión (activa o inactiva)

    // Método main del programa
    public static void main(String[] args) {
        // Inicializar el arreglo de cuentas con los datos de los clientes
        cuentas = new Cuenta[3];
        cuentas[0] = new Cuenta(123456, "1234", 1750, "Juan", "Pérez", "juan@gmail.com", "ABC");
        cuentas[1] = new Cuenta(234567, "2345", 1750, "María", "García", "maria@gmail.com", "DEF");
        cuentas[2] = new Cuenta(345678, "3456", 1750, "Pedro", "López", "pedro@gmail.com", "GHI");

        // Inicializar la cuenta actual como nula
        // Inicializar la cuenta actual como nula
        cuentaActual = null;

        // Inicializar el estado de la sesión como inactivo
        sesionActiva = false;

        // Mostrar la ventana de inicio de sesión
        mostrarLogin();
    }

    // Método para mostrar la ventana de inicio de sesión
    public static void mostrarLogin() {
        // Crear un panel con los componentes de la ventana
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Usar un diseño vertical
        JLabel etiquetaNumero = new JLabel("Número de cuenta:"); // Crear una etiqueta para el número de cuenta
        JTextField campoNumero = new JTextField(); // Crear un campo de texto para el número de cuenta
        JLabel etiquetaPassword = new JLabel("Contraseña:"); // Crear una etiqueta para la contraseña
        JPasswordField campoPassword = new JPasswordField(); // Crear un campo de contraseña para la contraseña
        panel.add(etiquetaNumero); // Agregar la etiqueta al panel
        panel.add(campoNumero); // Agregar el campo de texto al panel
        panel.add(etiquetaPassword); // Agregar la etiqueta al panel
        panel.add(campoPassword); // Agregar el campo de contraseña al panel

        // Mostrar el panel en un cuadro de diálogo con las opciones Ingresar y Salir
        int opcion = JOptionPane.showOptionDialog(null, panel, "Inicio de sesión", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Ingresar", "Salir"}, null);

        // Si la opción elegida es Ingresar
        if (opcion == JOptionPane.OK_OPTION) {
            // Obtener el número de cuenta y la contraseña ingresados por el usuario
            int numero = Integer.parseInt(campoNumero.getText());
            String password = new String(campoPassword.getPassword());

            // Validar el inicio de sesión con los datos ingresados
            validarLogin(numero, password);
        } else {
            // Si la opción elegida es Salir, terminar el programa
            System.exit(0);
        }
    }

    // Método para validar el inicio de sesión con el número de cuenta y la contraseña
    public static void validarLogin(int numero, String password) {
        // Recorrer el arreglo de cuentas
        for (Cuenta cuenta : cuentas) {
            // Si el número y la contraseña coinciden con los de alguna cuenta
            if (cuenta.getNumero() == numero && cuenta.getPassword().equals(password)) {
                // Asignar la cuenta encontrada a la cuenta actual
                cuentaActual = cuenta;
                // Cambiar el estado de la sesión a activo
                sesionActiva = true;
                // Mostrar un mensaje de bienvenida en un cuadro de diálogo
                JOptionPane.showMessageDialog(null, "Bienvenido(a) " + cuentaActual.getNombre() + " " + cuentaActual.getApellido() + ".\nSu correo es: " + cuentaActual.getCorreo() + ".\nSu empresa es: " + cuentaActual.getEmpresa() + ".");
                // Mostrar el menú de opciones
                mostrarMenu();
                // Terminar el método
                return;
            }
        }
        // Si no se encontró ninguna cuenta que coincida con los datos ingresados, mostrar un mensaje de error en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Número de cuenta o contraseña incorrectos");
    }
    
 // Método para mostrar el menú de opciones
    public static void mostrarMenu() {
        // Crear un panel con los componentes del menú
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Usar un diseño vertical
        JLabel etiquetaMenu = new JLabel("Seleccione una opción:"); // Crear una etiqueta para el menú
        JRadioButton opcionConsultar = new JRadioButton("Consultar saldo"); // Crear un botón de opción para consultar el saldo
        JRadioButton opcionRetirar = new JRadioButton("Retirar efectivo"); // Crear un botón de opción para retirar efectivo
        JRadioButton opcionPagar = new JRadioButton("Pagar servicio"); // Crear un botón de opción para pagar servicio
        JRadioButton opcionSalir = new JRadioButton("Salir"); // Crear un botón de opción para salir
        ButtonGroup grupoOpciones = new ButtonGroup(); // Crear un grupo de botones para agrupar las opciones
        grupoOpciones.add(opcionConsultar); // Agregar la opción de consultar al grupo
        grupoOpciones.add(opcionRetirar); // Agregar la opción de retirar al grupo
        grupoOpciones.add(opcionPagar); // Agregar la opción de pagar al grupo
        grupoOpciones.add(opcionSalir); // Agregar la opción de salir al grupo
        panel.add(etiquetaMenu); // Agregar la etiqueta al panel
        panel.add(opcionConsultar); // Agregar el botón de opción al panel
        panel.add(opcionRetirar); // Agregar el botón de opción al panel
        panel.add(opcionPagar); // Agregar el botón de opción al panel
        panel.add(opcionSalir); // Agregar el botón de opción al panel

        // Mostrar el panel en un cuadro de diálogo con la opción Aceptar
        int opcion = JOptionPane.showOptionDialog(null, panel, "Menú", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Aceptar"}, null);

        // Si la opción elegida es Aceptar
        if (opcion == JOptionPane.OK_OPTION) {
            // Ejecutar la operación según la opción seleccionada
            if (opcionConsultar.isSelected()) {
                // Si se seleccionó consultar saldo, llamar al método consultarSaldo de la cuenta actual
                cuentaActual.consultarSaldo();
            } else if (opcionRetirar.isSelected()) {
                // Si se seleccionó retirar efectivo, llamar al método retirarEfectivo de la cuenta actual con el monto ingresado por el usuario
                double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
                cuentaActual.retirarEfectivo(monto);
            } else if (opcionPagar.isSelected()) {
                // Si se seleccionó pagar servicio, llamar al método pagarServicio de la cuenta actual con el servicio y el monto ingresados por el usuario
                String servicio = JOptionPane.showInputDialog("Ingrese el nombre del servicio a pagar:");
                double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a pagar:"));
                cuentaActual.pagarServicio(servicio, monto);
            } else if (opcionSalir.isSelected()) {
                // Si se seleccionó salir, llamar al método cerrarSesion
                cerrarSesion();
            }
        }
    }

    // Método para cerrar la sesión
    public static void cerrarSesion() {
        // Cambiar el estado de la sesión a inactivo
        sesionActiva = false;
        // Mostrar un mensaje de despedida en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Gracias por usar el cajero automático.\nHasta pronto.");
        // Mostrar la ventana de inicio de sesión
        mostrarLogin();
    }

}