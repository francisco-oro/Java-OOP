package practica4.ejercicio4;

public class Comensal {
	private String nombre;
	private String bebida;
	private String entrada;
	private String guarnicion;
	private String platoFuerte;
	private String postre;

	public Comensal(String nombre, String bebida, String entrada, String guarnicion, String platoFuerte, String postre) {
		this.nombre = nombre;
		this.bebida = bebida;
		this.entrada = entrada;
		this.guarnicion = guarnicion;
		this.platoFuerte = platoFuerte;
		this.postre = postre;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
    public String getBebida() {
        return bebida;
    }

    // Método para modificar la bebida del cliente
    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    // Método para obtener la entrada del cliente
    public String getEntrada() {
        return entrada;
    }

    // Método para modificar la entrada del cliente
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    // Método para obtener la guarnición del cliente
    public String getGuarnicion() {
        return guarnicion;
    }

    // Método para modificar la guarnición del cliente
    public void setGuarnicion(String guarnicion) {
        this.guarnicion = guarnicion;
    }

    // Método para obtener el plato fuerte del cliente
    public String getPlatoFuerte() {
        return platoFuerte;
    }

    // Método para modificar el plato fuerte del cliente
    public void setPlatoFuerte(String platoFuerte) {
        this.platoFuerte = platoFuerte;
    }

    // Método para obtener el postre del cliente
    public String getPostre() {
        return postre;
    }

    // Método para modificar el postre del cliente
    public void setPostre(String postre) {
        this.postre = postre;
    }
    
    public String toStrinng()
    {
    	return "Nombre: " + nombre + "\nBebida: " + bebida + "\nEntrada: " + entrada + "\nGuarnición: " + guarnicion
    			+ "\nPlato fuerte: " + platoFuerte + "\nPostre: " + postre;  
    }
}
