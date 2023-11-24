package practica4;

public class Piramide implements IShape {
	private double x, y, z;
	
	public Piramide(double _x, double _y, double _z)
	{
		x = _x;
		y = _y;
		z = _z;
	}
	@Override
	public double Volume() {
		return (x*y) * (1/3) * z;	
	}

	@Override
	public double AreaOfBase() {
		return x*y;
	}

	@Override
	public double PerimeterOfBase() {
		return x*2 + y*2;
	}
}
