package ex1;

public class Main {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.dividir(10, 2));
		System.out.println(calculadora.somar(10.56, 2));
		System.out.println(calculadora.subtrair(7, 2));
		System.out.println(calculadora.multiplicar(104, 2));
	}

}
