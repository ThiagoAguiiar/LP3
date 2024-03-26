package ex8;

public class Retangulo implements FormaGeometrica {

	@Override
	public double calcularArea(double x, double y) {
		// TODO Auto-generated method stub
		return x * y;
	}

	@Override
	public double calcularArea(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPerimetro(double x, double y) {
		// TODO Auto-generated method stub
		return x * 2 + y * 2;
	}

	@Override
	public double calcularPerimetro(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

}
