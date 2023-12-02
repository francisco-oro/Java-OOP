package practica4.ejercicio4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Mesero {
	private ArrayList<Comensal> comensales;
	public Mesero() {
		comensales = new ArrayList<Comensal>();
	}
	
	public void tomarOrden(Comensal comensal)
	{
		comensales.add(comensal);
	}
	
	public Comensal buscarComensal(String nombre)
	{
		for(Comensal comensal : comensales)
		{
			if(comensal.getNombre().equals(nombre))
			{
				return comensal;
			}
		}
		return null;
	}
	
	public void entregarPlatillos(String nombre)
	{
		Comensal comensal = buscarComensal(nombre);
		
		if(comensal != null)
		{
			JOptionPane.showMessageDialog(null, "Se le entregan los siguientes platillos: \n" + comensal.toString());
		} else {
			JOptionPane.showMessageDialog(null, "No se encontró ningún comensal con ese nombre" + comensal.toString());
		}
	}
	
	public void entregarCuenta(String nombre)
	{
		Comensal comensal = buscarComensal(nombre);
		
		if(comensal != null)
		{
			double total = 0;
			switch(comensal.getBebida())
			{
				case "Agua":
					total +=10;
					break;
				case "Refresco":
					total += 15;
					break;
				case "Jugo":
					total += 20;
					break;
			}
			switch(comensal.getEntrada())
			{
			case "Ensalada":
				total +=25;
				break;
			case "Sopa":
				total += 30;
				break;
			case "Queso":
				total += 35;
				break;
			}
			switch(comensal.getGuarnicion())
			{
			case "Arroz":
				total += 40;
				break;
			case "Papas":
				total += 45;
				break;
			case "Verduras":
				total += 50;
				break;
			}
			switch(comensal.getPlatoFuerte())
			{
			case "Pollo":
				total += 55;
				break;
			case "Carne":
				total += 60;
				break;
			case "Pescado":
				total += 65;
				break;
			}
			switch(comensal.getPostre())
			{
			case "Gelatina":
				total += 70;
				break;
			case "Pastel":
				total += 75;
				break;
			case "Helado":
				total += 80;
				break;
			}
			
			JOptionPane.showMessageDialog(null, "El total a pagar es: $" + total);
			comensales.remove(comensal); 
		} else {
			JOptionPane.showMessageDialog(null, "No se encontró ningún comensal con ese nombre");
		}
	}
}
