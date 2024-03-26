package ex5;

public class Triangulo extends Poligono {

	@Override
	public double area(double x, double y) {
		return (x * y) / 2;
	}

	@Override
	public double area(double x) {
		// TODO Auto-generated method stub
		return 0;
	}
}
