package practica4.ejercicio1;

public class Cilindro implements IShape {
	double Radius, Height;
	public Cilindro(double radius, double height) {
		Radius = radius;
		Height = height;
	}

	@Override
	public double Volume() {
		return Math.PI * Math.pow(Radius, 2) * Height;
	}

	@Override
	public double AreaOfBase() {
		return Math.PI * Math.pow(Radius, 2);
	}

	@Override
	public double PerimeterOfBase() {
		return 2 * Math.PI * Radius;
	}
}
