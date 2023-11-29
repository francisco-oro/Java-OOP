package practica4.ejercicio3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Crear la clase Ventana que extiende de JFrame y que implementa la interfaz ActionListener
class Ventana extends JFrame implements ActionListener {
 // Atributos de la clase
 private JLabel labelInstrucciones; // Etiqueta para mostrar las instrucciones
 private JTextField campoNombre; // Campo de texto para ingresar el nombre del contacto
 private JButton botonBuscar; // Botón para buscar el contacto
 private JPanel panelDatos; // Panel para mostrar los datos del contacto
 private JButton botonGuardar; // Botón para guardar el contacto
 private JButton botonEliminar; // Botón para eliminar el contacto
 private JButton botonVerTodos; // Botón para ver todos los contactos
 private JButton botonSalir; // Botón para salir del programa
 private Agenda agenda; // Objeto de la clase Agenda para almacenar los contactos

 // Constructor de la clase
 public Ventana() {
     // Llamar al constructor de la superclase
     super("AgendaPoo Free");

     // Inicializar los componentes de la interfaz gráfica
     labelInstrucciones = new JLabel("Ingrese el nombre del contacto y presione Buscar");
     campoNombre = new JTextField(20);
     botonBuscar = new JButton("Buscar");
     panelDatos = new JPanel();
     botonGuardar = new JButton("Nuevo Contacto");
     botonEliminar = new JButton("Eliminar");
     botonVerTodos = new JButton("Ver todos");
     botonSalir = new JButton("Salir");

     // Inicializar el objeto de la clase Agenda
     agenda = new Agenda();

     // Agregar los componentes al JFrame usando un BorderLayout
     this.setLayout(new BorderLayout());
     this.add(labelInstrucciones, BorderLayout.NORTH);
     this.add(campoNombre, BorderLayout.WEST);
     this.add(botonBuscar, BorderLayout.EAST);
     this.add(panelDatos, BorderLayout.CENTER);

     // Crear un JPanel para los botones inferiores
     JPanel panelBotones = new JPanel();

     // Agregar los botones al panel
     panelBotones.add(botonGuardar);
     panelBotones.add(botonEliminar);
     panelBotones.add(botonVerTodos);
     panelBotones.add(botonSalir);

     // Agregar el panel al JFrame
     this.add(panelBotones, BorderLayout.SOUTH);

     // Asignar un ActionListener a los componentes que lo requieran
     botonBuscar.addActionListener(this);
     botonGuardar.addActionListener(this);
     botonEliminar.addActionListener(this);
     botonVerTodos.addActionListener(this);
     botonSalir.addActionListener(this);

     // Configurar el JFrame
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setSize(500, 400);
     this.setVisible(true);
 }

 // Método para manejar los eventos de los botones
 @Override
 public void actionPerformed(ActionEvent e) {
     // Obtener la fuente del evento
     Object fuente = e.getSource();

     // Si la fuente es el botón de buscar
     if (fuente == botonBuscar) {
         // Obtener el nombre ingresado en el campo de texto
         String nombre = campoNombre.getText();

         // Buscar el contacto en la agenda por su nombre
         Contacto c = agenda.buscarContacto(nombre);

         // Limpiar el panel de datos
         panelDatos.removeAll();

         // Crear un GridLayout para el panel de datos
         GridLayout layout = new GridLayout(0, 2);

         // Si el contacto existe
         if (c != null) 
         {
             // Crear las etiquetas y los campos de texto para mostrar los datos del contacto
             JLabel labelNombre = new JLabel("Nombre:");
             JTextField campoNombre = new JTextField(c.getNombre());
             JLabel labelApellido = new JLabel("Apellido:");
             JTextField campoApellido = new JTextField(c.getApellido());
             JLabel labelTelefono = new JLabel("Teléfono:");
             JTextField campoTelefono = new JTextField(c.getTelefono());
             JLabel labelCorreo = new JLabel("Correo:");
             JTextField campoCorreo = new JTextField(c.getCorreo());
             JLabel labelDireccion = new JLabel("Dirección:"); // Crear una etiqueta para la dirección
             JTextField campoDireccion = new JTextField(c.getDireccion()); // Crear un campo de texto para la dirección

             // Agregar las etiquetas y los campos de texto al panel de datos
             panelDatos.add(labelNombre);
             panelDatos.add(campoNombre);
             panelDatos.add(labelApellido);
             panelDatos.add(campoApellido);
             panelDatos.add(labelTelefono);
             panelDatos.add(campoTelefono);
             panelDatos.add(labelCorreo); // Agregar la etiqueta al panel
             panelDatos.add(campoCorreo); // Agregar el campo de texto al panel
             panelDatos.add(labelDireccion); // Agregar la etiqueta al panel
             panelDatos.add(campoDireccion); // Agregar el campo de texto al panel

             // Establecer el número de filas y columnas del GridLayout
             layout.setRows(5);
             layout.setColumns(2);
         } else {
             // Si el contacto no existe, mostrar un mensaje de error en una etiqueta
             JLabel labelError = new JLabel("No se encontró ningún contacto con ese nombre");

             // Agregar la etiqueta al panel de datos
             panelDatos.add(labelError);

             // Establecer el número de filas y columnas del GridLayout
             layout.setRows(1);
             layout.setColumns(1);
         }

         // Asignar el GridLayout al panel de datos
         panelDatos.setLayout(layout);

         // Actualizar el panel de datos
         panelDatos.revalidate();
         panelDatos.repaint();
     } else if (fuente == botonGuardar)
     {
    		    // Crear un panel con los componentes para obtener los datos del contacto
    		    JPanel panelGuardar = new JPanel();
    		    panelGuardar.setLayout(new GridLayout(0, 2)); // Usar un diseño de cuadrícula
    		    JLabel labelNombre = new JLabel("Nombre:"); // Crear una etiqueta para el nombre
    		    JTextField campoNombre = new JTextField(); // Crear un campo de texto para el nombre
    		    JLabel labelApellido = new JLabel("Apellido:"); // Crear una etiqueta para el apellido
    		    JTextField campoApellido = new JTextField(); // Crear un campo de texto para el apellido
    		    JLabel labelTelefono = new JLabel("Teléfono:"); // Crear una etiqueta para el teléfono
    		    JTextField campoTelefono = new JTextField(); // Crear un campo de texto para el teléfono
    		    JLabel labelCorreo = new JLabel("Correo:"); // Crear una etiqueta para el correo
    		    JTextField campoCorreo = new JTextField(); // Crear un campo de texto para el correo
    		    JLabel labelDireccion = new JLabel("Dirección:"); // Crear una etiqueta para la dirección
    		    JTextField campoDireccion = new JTextField(); // Crear un campo de texto para la dirección
    		    // Agregar los componentes al panel
    		    panelGuardar.add(labelNombre);
    		    panelGuardar.add(campoNombre);
    		    panelGuardar.add(labelApellido);
    		    panelGuardar.add(campoApellido);
    		    panelGuardar.add(labelTelefono);
    		    panelGuardar.add(campoTelefono);
    		    panelGuardar.add(labelCorreo);
    		    panelGuardar.add(campoCorreo);
    		    panelGuardar.add(labelDireccion);
    		    panelGuardar.add(campoDireccion);

    		    // Mostrar el panel en un cuadro de diálogo con la opción Guardar
    		    int opcion = JOptionPane.showOptionDialog(null, panelGuardar, "Guardar contacto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Guardar", "Cancelar"}, null);

    		    // Si la opción elegida es Guardar
    		    if (opcion == JOptionPane.OK_OPTION) {
    		        // Obtener los datos del contacto del panel
    		        String nombre = campoNombre.getText();
    		        String apellido = campoApellido.getText();
    		        String telefono = campoTelefono.getText();
    		        String correo = campoCorreo.getText();
    		        String direccion = campoDireccion.getText();

    		        // Crear un objeto de la clase Contacto con los datos obtenidos
    		        Contacto c = new Contacto(nombre, apellido, telefono, correo, direccion);

    		        // Guardar el contacto en la agenda
    		        agenda.guardarContacto(c);

    		        // Mostrar un mensaje de confirmación en un cuadro de diálogo
    		        JOptionPane.showMessageDialog(null, "Se ha guardado el contacto con éxito");
    		    }
    		}

      else if (fuente == botonEliminar) {
         // Si la fuente es el botón de eliminar
         // Obtener el nombre del contacto del campo de texto
         String nombre = campoNombre.getText();

         // Eliminar el contacto de la agenda por su nombre
         agenda.eliminarContacto(nombre);

         // Mostrar un mensaje de confirmación en un cuadro de diálogo
         JOptionPane.showMessageDialog(null, "Se ha eliminado el contacto con éxito");

         // Limpiar el panel de datos
         panelDatos.removeAll();

         // Actualizar el panel de datos
         panelDatos.revalidate();
         panelDatos.repaint();
         
     } else if (fuente == botonVerTodos) {
         // Si la fuente es el botón de ver todos
         // Ver todos los contactos de la agenda
         String resultado = agenda.verContactos();

         // Mostrar el resultado en un cuadro de diálogo
         JOptionPane.showMessageDialog(null, resultado);
     } else if (fuente == botonSalir) {
         // Si la fuente es el botón de salir
         // Terminar el programa
         System.exit(0);
     }
 }
}
             
        