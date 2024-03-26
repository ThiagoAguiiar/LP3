package ex6;

public class ContaBancaria {
	private int numeroDaConta;
	private double saldo;
	
	public ContaBancaria(int numeroDaConta, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
		
		System.out.println("R$ " + valor + " adicionado a sua conta");
	}
	
	public void sacar(double valor) {
		try {
			if (saldo >= valor) {
				saldo -= valor;
				System.out.println("Você sacou R$ " + valor + " da sua conta");
			} else {
				throw new Exception("Saldo insuficiente para saque");
			}
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public double verSaldo() {
		return saldo;
	}
}
