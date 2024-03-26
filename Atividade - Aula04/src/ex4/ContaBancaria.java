package ex4;

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
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Você sacou R$ " + valor + " da sua conta");
		} else {
			System.out.println("Saldo insuficiente para sacar");
		}
	}
	
	public double verSaldo() {
		return saldo;
	}
}
