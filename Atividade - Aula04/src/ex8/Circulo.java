package ex8;

public class Circulo  implements FormaGeometrica {

	@Override
	public double calcularArea(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularArea(double x) {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(x, 2);
	}

	@Override
	public double calcularPerimetro(double x, double y) {
		return 0;
	}

	@Override
	public double calcularPerimetro(double x) {
		// TODO Auto-generated method stub
		return 2 * Math.PI * x;
	}

}
