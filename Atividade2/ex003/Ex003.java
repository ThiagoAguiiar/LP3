package ex003;

public class Ex003 {
	private double cateto1;
	private double cateto2;
	
	public Ex003(double c1, double c2) {
		this.cateto1 = c1;
		this.cateto2 = c2;
	}
	
	public void calcularHipotenusa() {
		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		System.out.println("Hipotenusa: " + hipotenusa);
	}
}
