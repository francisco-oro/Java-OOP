package practica4;

public class Cubo implements IShape {
	private double x;
	public Cubo(double _x)
	{
		x = _x;
	}
	@Override
	public double Volume() {
		return Math.pow(x, 3); 
	}
	@Override	
	public double AreaOfBase() {
		return Math.pow(x, 2);
	}
	@Override
	public double PerimeterOfBase() {
		return x * 4;
	}
	
}
