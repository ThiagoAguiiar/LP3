package ex001;

public class Ex002 {
	private String palavra;
	
	public Ex002(String palavra) {
		this.palavra = palavra.replace(" ", "");
	}
	
	public void verificarPalindromo() {
		StringBuilder hidratacao = new StringBuilder();
		
		hidratacao.append(this.palavra.replace(" ", "")).reverse().toString();
		
		if (hidratacao.equals(palavra)) {
			System.out.println("Esta palavra é um palíndromo");
			return;
		}
		
		System.out.println("Esta palavra não é um palíndromo");
		return;
	}
	
	
}
