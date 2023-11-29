/**
 	Originally written by Equipo 5 @ Laboratorio de POO Fi-UNAM
	29 nov. 2023
 * 
 */
package practica4.ejercicio4;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 */
public class Ventana extends JFrame implements ActionListener {
	private JLabel labelInstrucciones;
	private JTextField campoNombre;
	private JButton botonBuscar;
	private JPanel panelDatos;
	private JButton botonEntregar;
	private JButton botonGuardar;
	private JButton botonCuenta;
	private JButton botonSalir;
	private Mesero mesero;
	
	/**
	 * @throws HeadlessException
	 */
	public Ventana() throws HeadlessException {
		super("Simulador de mesero");
		labelInstrucciones = new JLabel("Ingrese el nombre del comensal y presione buscar");
		campoNombre = new JTextField(20);
		botonBuscar = new JButton("Buscar");
		panelDatos = new JPanel();
		botonGuardar = new JButton("Guardar");
		botonEntregar = new JButton("Entregar");
		botonCuenta = new JButton("Cuenta");
		botonSalir = new JButton("Salir");
		
		mesero = new Mesero();
		
		this.setLayout(new BorderLayout());
		this.add(labelInstrucciones,BorderLayout.NORTH);
		this.add(campoNombre ,BorderLayout.WEST);
		this.add(botonBuscar,BorderLayout.EAST);
		this.add(panelDatos,BorderLayout.CENTER);
		
		JPanel panelBotones = new JPanel();
		panelBotones.add(botonGuardar);
		panelBotones.add(botonEntregar);
		panelBotones.add(botonCuenta);
		panelBotones.add(botonSalir);
		
		this.add(panelBotones, BorderLayout.SOUTH);
		
		botonBuscar.addActionListener(this);
		botonGuardar.addActionListener(this);
		botonEntregar.addActionListener(this);
		botonCuenta.addActionListener(this);
		botonSalir.addActionListener(this);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,400);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object fuente = e.getSource();

		if(fuente == botonBuscar)
		{
			String nombre = campoNombre.getText();
			Comensal comensal = mesero.buscarComensal(nombre);
			panelDatos.removeAll();
			
			
			GridLayout layout = new GridLayout(0,2);
			if(comensal != null)
			{
				JLabel labelNombre = new JLabel("Nombre:");
				JComboBox<String> comboNombre = new JComboBox<String>(new String[] {comensal.getNombre()});
				JLabel labelBebida = new JLabel("Bebida:");
				JComboBox<String> comboBebida = new JComboBox<String>(new String[] {comensal.getBebida()});
				JLabel labelEntrada = new JLabel("Entrada:");
				JComboBox<String> comboEntrada = new JComboBox<String>(new String[] {comensal.getEntrada()});
				JLabel labelGuarnicion = new JLabel("Guarnicion:");
				JComboBox<String> comboGuarnicion = new JComboBox<String>(new String[] {comensal.getGuarnicion()});
				JLabel labelPlatoFuerte = new JLabel("PlatoFuerte:");
				JComboBox<String> comboPlatoFuerte = new JComboBox<String>(new String[] {comensal.getPlatoFuerte()});
				JLabel labelPostre = new JLabel("Postre:");
				JComboBox<String> comboPostre = new JComboBox<String>(new String[] {comensal.getPostre()});
			}
			
		}
	}

}
