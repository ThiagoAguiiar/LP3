package ex2;

public class Estudante {
	private String nome;
	private int idade;
	private double nota;
	
	public Estudante(String nome, int idade, double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}
	
	public boolean estaAprovado() {
		if (nota >= 7) return true;
		return false;
	}
}
