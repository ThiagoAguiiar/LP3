package ex8;

public class Main {

	public static void main(String[] args) {
		Retangulo ret = new Retangulo();
		Quadrado qua = new Quadrado();
		Circulo cir = new Circulo();
		
		System.out.println(ret.calcularArea(2, 5));
		System.out.println(qua.calcularArea(3));
		System.out.println(cir.calcularArea(4));
		
		System.out.println(ret.calcularPerimetro(2, 5));
		System.out.println(qua.calcularPerimetro(5));
		System.out.println(cir.calcularPerimetro(4));
	}
}
