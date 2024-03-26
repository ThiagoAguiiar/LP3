package ex8;

public class Quadrado implements FormaGeometrica {

	@Override
	public double calcularArea(double x, double y) {
		return 0;
	}

	@Override
	public double calcularArea(double x) {
		return x * x;
	}

	@Override
	public double calcularPerimetro(double x, double y) {
		return 0;
	}

	@Override
	public double calcularPerimetro(double x) {
		// TODO Auto-generated method stub
		return x * 4;
	}

}
