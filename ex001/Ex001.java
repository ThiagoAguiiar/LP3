package ex001;

public class Ex001 {
	private String palavra;
	private String ocorrencia;
	
	public Ex001(String palavra, String ocorrencia) {
		this.palavra = palavra;
		this.ocorrencia = ocorrencia;
	}
	
	public void encontrarPrimeiraOcorrencia() {
		String[] palavraArray = palavra.split("");
		int pos = -1;
				
		for(int i = 0; i < palavra.length(); i++) {
			if(palavraArray[i].equals(ocorrencia)) {
				pos = i;
				break;
			}
		}
		
		if(pos != -1) {
			System.out.println("O caractere " + ocorrencia + " se encontra na posição " + pos);
			return;
		}
		
		System.out.println("Nenhuma ocorrência encontrada");
	}
}
