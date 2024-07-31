package ex001;

public class Main {

	public static void main(String[] args) {
		Ex002 palavra = new Ex002("Ovo");
		palavra.verificarPalindromo();
		
		Ex003 vogais = new Ex003("SEMANA");
		vogais.contarVogais();
		
		Ex001 ocorrencia = new Ex001("palavra", "0");
		ocorrencia.encontrarPrimeiraOcorrencia();
	}

}
