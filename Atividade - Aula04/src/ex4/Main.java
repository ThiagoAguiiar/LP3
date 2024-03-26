package ex4;

public class Main {

	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria(2, 3000);
		
		cb.depositar(1000);
		System.out.println(cb.verSaldo());
		
		cb.sacar(3500);
		System.out.println(cb.verSaldo());
		
		cb.sacar(499);
		System.out.println(cb.verSaldo());
	}

}
