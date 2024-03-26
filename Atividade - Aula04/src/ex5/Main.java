package ex5;

public class Main {

	public static void main(String[] args) {
		Retangulo ret = new Retangulo();
		Circulo cir = new Circulo();
		Triangulo tri = new Triangulo();
		
		System.out.println(ret.area(20, 2));
		System.out.println(cir.area(2, 10));
		System.out.println(tri.area(20, 10));
	}

}
