package ex2;

public class Main {

	public static void main(String[] args) {
		Estudante estudante = new Estudante("Thiago", 2, 8);
		System.out.println(estudante.estaAprovado() ? "Aprovado" : "Reprovado");
	}

}
