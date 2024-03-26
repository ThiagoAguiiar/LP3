package ex5;

public class Circulo extends Poligono {
	@Override
	public double area(double x, double y) {
		return Math.PI * Math.pow(x, 2);
	}
	
	@Override
	public double area(double x) {
		return Math.PI * Math.pow(x, 2);
	}
}
